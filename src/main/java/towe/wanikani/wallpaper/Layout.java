package towe.wanikani.wallpaper;

import java.awt.Font;
import java.awt.Graphics2D;
import java.util.List;
import towe.wanikani.json.kanji.Kanji;

public class Layout {

    private final List<Kanji> kanjiList;
    private final Settings settings;
    private final int fontSize;
    private final int columns;
    private final double leftMargin;
    private final double topMargin;

    public Layout(List<Kanji> kanjiList, Settings settings) {
        this.kanjiList = kanjiList;
        this.settings = settings;
        int symbolSize = settings.getHeight() + 1, rows, cols;
        do {
            --symbolSize;
            rows = (settings.getHeight() - settings.getMarginTop() - settings.getMarginBottom()) / symbolSize;
            cols = (settings.getWidth() - settings.getMarginLeft() - settings.getMarginRight()) / symbolSize;
        } while (rows * cols < kanjiList.size() && symbolSize > 1);
        fontSize = symbolSize;
        columns = cols;
        leftMargin = (settings.getWidth() + settings.getMarginLeft() - settings.getMarginRight() - cols * symbolSize) * 0.5;
        topMargin = (settings.getHeight() + settings.getMarginTop() - settings.getMarginBottom() - rows * symbolSize) * 0.5;
    }

    public void paint(Graphics2D g2d, String fontName) {
        Font font = fontName != null ? new Font(fontName, Font.PLAIN, fontSize) : g2d.getFont().deriveFont((float) fontSize);
        g2d.setFont(font);
        g2d.setColor(settings.getBackgroundColor());
        g2d.fillRect(0, 0, settings.getWidth(), settings.getHeight());
        int ascent = g2d.getFontMetrics(font).getAscent();
        for (int i = 0; i < kanjiList.size(); ++i) {
            Kanji kanji = kanjiList.get(i);
            g2d.setColor(settings.getColor(kanji));
            g2d.drawString(kanji.getCharacter(), (float) (leftMargin + (i % columns) * fontSize), (float) (topMargin + (i / columns) * fontSize + ascent));
        }
    }
}
