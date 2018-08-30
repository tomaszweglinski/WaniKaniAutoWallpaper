package towe.wanikani.wallpaper.validators;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class FontNameValidator implements IParameterValidator {

    @Override
    public void validate(String name, String value) throws ParameterException {
        for (Font font : GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts()) {
            if (value.equals(font.getName())) {
                return;
            }
        }
        throw new ParameterException("\"" + name + "\": font named \"" + value + "\" does not exist");
    }
}
