import java.util.regex.Pattern;

public class HexColorValidator {
    private static final String REGEX = "^#[0-9A-Fa-f]{6}$";

    public boolean validate(String input) {
        return Pattern.matches(REGEX, input);
    }
}