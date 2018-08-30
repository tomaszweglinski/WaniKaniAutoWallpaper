package towe.wanikani.wallpaper.validators;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.IStringConverter;
import com.beust.jcommander.ParameterException;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorConverter implements IStringConverter<Color>, IParameterValidator {

    private static final Pattern PATTERN = Pattern.compile("#([0-9A-Fa-f]{2})([0-9A-Fa-f]{2})([0-9A-Fa-f]{2})");

    @Override
    public Color convert(String value) {
        Matcher matcher = PATTERN.matcher(value);
        if (matcher.matches()) {
            return new Color(Integer.parseInt(matcher.group(1), 16), Integer.parseInt(matcher.group(2), 16), Integer.parseInt(matcher.group(3), 16));
        } else {
            try {
                return (Color) Color.class.getField(value.toUpperCase()).get(null);
            } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
                return null;
            }
        }
    }

    @Override
    public void validate(String name, String value) throws ParameterException {
        if (!PATTERN.matcher(value).matches()) {
            try {
                Color.class.getField(value.toUpperCase());
            } catch (NoSuchFieldException nsfe) {
                throw new ParameterException("\"" + name + "\": \"" + value + "\" is not #RRGGBB hexadecimal value nor a color name");
            }
        }
    }
}