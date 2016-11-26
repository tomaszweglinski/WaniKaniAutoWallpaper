package towe.wanikani.wallpaper.validators;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public abstract class IntValidator implements IParameterValidator {

    private final int minValue;

    protected IntValidator(int minValue) {
        this.minValue = minValue;
    }

    @Override
    public void validate(String name, String value) throws ParameterException {
        boolean invalid;
        try {
            invalid = Integer.parseInt(value) < minValue;
        } catch (NumberFormatException nfe) {
            invalid = true;
        }
        if (invalid) {
            throw new ParameterException("\"" + name + "\": \"" + value + "\" is not a " + getClass().getSimpleName().toLowerCase() + " integer");
        }
    }

    public static class Positive extends IntValidator {
        public Positive() {
            super(1);
        }
    }

    public static class NonNegative extends IntValidator {
        public NonNegative() {
            super(0);
        }
    }
}
