package towe.wanikani.wallpaper.validators;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

import java.util.regex.Pattern;

public class ApiKeyValidator implements IParameterValidator {

    private static final Pattern PATTERN = Pattern.compile("[0-9a-f]{32}");

    @Override
    public void validate(String name, String value) throws ParameterException {
        if (!PATTERN.matcher(value).matches()) {
            throw new ParameterException("\"" + name + "\": \"" + value + "\" is not a valid API key");
        }
    }
}