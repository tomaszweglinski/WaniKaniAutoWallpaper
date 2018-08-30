package towe.wanikani.wallpaper;

import towe.wanikani.wallpaper.validators.ColorConverter;
import towe.wanikani.wallpaper.validators.FontNameValidator;
import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import java.awt.Color;
import java.awt.Toolkit;
import towe.wanikani.json.kanji.Kanji;
import towe.wanikani.json.kanji.UserSpecific;
import towe.wanikani.wallpaper.validators.ApiKeyValidator;
import towe.wanikani.wallpaper.validators.IntValidator;

@SuppressWarnings("FieldMayBeFinal")
public class Settings {

    private static final ColorConverter COLOR_CONVERTER = new ColorConverter();

    @Parameter(names = {"-k", "--api-key"}, description = "API key", validateWith = ApiKeyValidator.class, required = true)
    private String apiKey;

    @Parameter(names = {"-w", "--width"}, description = "Width of wallpaper", validateWith = IntValidator.Positive.class)
    private int width = (int) Math.round(Toolkit.getDefaultToolkit().getScreenSize().getWidth());

    @Parameter(names = {"-h", "--height"}, description = "Height of wallpaper", validateWith = IntValidator.Positive.class)
    private int height = (int) Math.round(Toolkit.getDefaultToolkit().getScreenSize().getHeight());

    @Parameter(names = "--margin-left", description = "Space to leave blank to the left", validateWith = IntValidator.NonNegative.class)
    private int marginLeft = 10;

    @Parameter(names = "--margin-right", description = "Space to leave blank to the right", validateWith = IntValidator.NonNegative.class)
    private int marginRight = 10;

    @Parameter(names = "--margin-top", description = "Space to leave blank to the top", validateWith = IntValidator.NonNegative.class)
    private int marginTop = 10;

    @Parameter(names = "--margin-bottom", description = "Space to leave blank to the bottom", validateWith = IntValidator.NonNegative.class)
    private int marginBottom = 40;

    @Parameter(names = "--color-background", description = "Color for background", validateWith = ColorConverter.class, converter = ColorConverter.class)
    private Color colorBackground = Color.BLACK;

    @Parameter(names = "--color-unseen", description = "Color for unseen characters", validateWith = ColorConverter.class, converter = ColorConverter.class)
    private Color colorUnseen = COLOR_CONVERTER.convert("#434343");

    @Parameter(names = "--color-apprentice", description = "Color for apprentice characters", validateWith = ColorConverter.class, converter = ColorConverter.class)
    private Color colorApprentice = COLOR_CONVERTER.convert("#DD0093");

    @Parameter(names = "--color-guru", description = "Color for guru characters", validateWith = ColorConverter.class, converter = ColorConverter.class)
    private Color colorGuru = COLOR_CONVERTER.convert("#882D9E");

    @Parameter(names = "--color-master", description = "Color for master characters", validateWith = ColorConverter.class, converter = ColorConverter.class)
    private Color colorMaster = COLOR_CONVERTER.convert("#294DDB");

    @Parameter(names = "--color-enlightened", description = "Color for enlightened characters", validateWith = ColorConverter.class, converter = ColorConverter.class)
    private Color colorEnlightened = COLOR_CONVERTER.convert("#0093DD");

    @Parameter(names = "--color-burned", description = "Color for burned characters", validateWith = ColorConverter.class, converter = ColorConverter.class)
    private Color colorBurned = COLOR_CONVERTER.convert("#FBC042");

    @Parameter(names = "--color-error", description = "Color for error'ed characters", validateWith = ColorConverter.class, converter = ColorConverter.class)
    private Color colorError = Color.RED;

    @Parameter(names = {"-f", "--font"}, description = "Font name", validateWith = FontNameValidator.class)
    private String fontName;
    
    @Parameter(names = "--overview", description = "Generates wallpapers for all supported fonts available in system")
    private boolean overviewMode;

    @Parameter(names = {"-a", "--auto"}, description = "Sets new wallpaper and removes output image")
    private boolean autoMode;

    @Parameter(names = "--help", description = "Shows usage instructions", help = true)
    private boolean showUsage;
    
    @Parameter(names = "--cache", hidden = true)
    private boolean useCache;

    private JCommander jCommander;

    public void initialize(String[] args) {
        jCommander = new JCommander(this, args);
    }

    public String getApiKey() {
        return apiKey;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getMarginLeft() {
        return marginLeft;
    }

    public int getMarginRight() {
        return marginRight;
    }

    public int getMarginTop() {
        return marginTop;
    }

    public int getMarginBottom() {
        return marginBottom;
    }

    public Color getColor(Kanji kanji) {
        UserSpecific userSpecific = kanji.getUserSpecific();
        if (userSpecific != null) {
            switch (userSpecific.getSrs()) {
                case "apprentice":
                    return colorApprentice;
                case "guru":
                    return colorGuru;
                case "master":
                    return colorMaster;
                case "enlighten":
                    return colorEnlightened;
                case "burned":
                    return colorBurned;
                default:
                    return colorError;
            }
        } else {
            return colorUnseen;
        }
    }

    public Color getBackgroundColor() {
        return colorBackground;
    }

    public String getFontName() {
        return fontName;
    }

    public boolean overviewRequested() {
        return overviewMode;
    }

    public boolean autoRequested() {
        return autoMode;
    }

    public boolean showUsageIfRequested() {
        if (showUsage) {
            jCommander.usage();
        }
        return showUsage;
    }
    
    public boolean useCache() {
        return useCache;
    }
}
