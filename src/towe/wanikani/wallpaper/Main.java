package towe.wanikani.wallpaper;

import com.beust.jcommander.ParameterException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.text.Collator;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;

import towe.wanikani.json.kanji.Kanji;
import towe.wanikani.json.kanji.Response;

@SuppressWarnings("ResultOfMethodCallIgnored")
public class Main {

    private static final String OVERVIEW_DIR_NAME = "overview";
    private static final String OUTPUT_FILE_NAME = "wallpaper";
    private static final String OUTPUT_FORMAT = "PNG";

    private static final Pattern FONT_NAME_PATTERN = Pattern.compile("([^.]+)(\\..+)?");

    public static void main(String[] args) throws IOException {
        Settings settings = new Settings();

        try {
            settings.initialize(args);
        } catch (ParameterException e) {
            log(e);
            return;
        }

        if (settings.showUsageIfRequested())
            return;

        List<Kanji> kanjiList = obtainKanjiList(settings);
        BufferedImage wallpaper = new BufferedImage(settings.getWidth(), settings.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = (Graphics2D) wallpaper.getGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Layout layout = new Layout(kanjiList, settings);

        if (settings.overviewRequested()) {
            System.out.println("Generating overview...");
            File subdirectory = new File(OVERVIEW_DIR_NAME);

            if (!subdirectory.exists())
                subdirectory.mkdir();

            String[] supportedFontNames = getSupportedFontNames(kanjiList, g2d);

            for (int i = 0; i < supportedFontNames.length; ++i) {
                String fontName = supportedFontNames[i];
                layout.paint(g2d, fontName);
                System.out.println(fontName + " (" + (i + 1) + "/" + supportedFontNames.length + ")");
                ImageIO.write(wallpaper, OUTPUT_FORMAT, new File(OVERVIEW_DIR_NAME + File.separator + fontName + "." + OUTPUT_FORMAT.toLowerCase()));
            }
        } else {
            layout.paint(g2d, settings.getFontName());
            File file = new File(OUTPUT_FILE_NAME + "." + OUTPUT_FORMAT.toLowerCase());
            System.out.println("Generating " + file.getName() + "...");
            ImageIO.write(wallpaper, OUTPUT_FORMAT, file);

            if (settings.autoRequested()) {
                System.out.println("Updating wallpaper and removing output file...");
                WallpaperManager.update(file);
                file.delete();
            }
        }
    }

    private static void log(Object data) {
        if (data instanceof Throwable) {
            System.err.println(((Throwable) data).getMessage());
        } else {
            System.out.println(data);
        }
    }

    private static List<Kanji> obtainKanjiList(Settings settings) throws IOException {
        List<Kanji> kanjiList;
        File cache = new File(settings.getApiKey() + ".json");
        URL apiUrl = new URL("https://www.wanikani.com/api/v1.4/user/" + settings.getApiKey() + "/kanji/" + commaSeparatedRange(1, 60));

        if (settings.useCache()) {
            if (!cache.exists()) {
                log("Connecting to WaniKani...");
                new FileOutputStream(cache).getChannel().transferFrom(Channels.newChannel(apiUrl.openStream()), 0, Long.MAX_VALUE);
            }

            kanjiList = new ObjectMapper().readValue(cache, Response.class).getRequestedInformation();
        } else {
            log("Connecting to WaniKani...");
            kanjiList = new ObjectMapper().readValue(apiUrl, Response.class).getRequestedInformation();
        }

        kanjiList.sort(Comparator.comparingInt(Kanji::getLevel));
        return kanjiList;
    }

    @SuppressWarnings("SameParameterValue")
    private static String commaSeparatedRange(int min, int max) {
        StringBuilder buffer = new StringBuilder();

        for (int i = min; i <= max; ++i) {
            buffer.append(i);

            if (i != max)
                buffer.append(',');
        }

        return buffer.toString();
    }

    private static String[] getSupportedFontNames(Iterable<Kanji> iterable, Graphics context) {
        Collection<String> supportedFontNames = new TreeSet<>(Collator.getInstance());

        fontLoop:
        for (Font font : GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts()) {
            Matcher matcher = FONT_NAME_PATTERN.matcher(font.getFontName());
            matcher.matches();
            String name = matcher.group(1);

            if (supportedFontNames.contains(name))
                continue;

            for (Kanji kanji : iterable) {
                if (!font.canDisplay(kanji.getCharacter().charAt(0)))
                    continue fontLoop;
            }

            FontRenderContext fontRenderContext = context.getFontMetrics(font).getFontRenderContext();

            for (Kanji kanji : iterable) {
                Rectangle bounds = font.createGlyphVector(fontRenderContext, kanji.getCharacter()).getOutline().getBounds();

                if (bounds.width == 0 || bounds.height == 0)
                    continue fontLoop;
            }

            supportedFontNames.add(name);
        }
        return supportedFontNames.toArray(new String[0]);
    }
}