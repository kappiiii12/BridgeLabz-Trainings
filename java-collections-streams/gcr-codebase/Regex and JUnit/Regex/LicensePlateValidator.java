import java.util.regex.Pattern;

public class LicensePlateValidator {
    private static final String REGEX = "^[A-Z]{2}\\d{4}$";

    public boolean validate(String input) {
        return Pattern.matches(REGEX, input);
    }
}