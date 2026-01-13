
import java.util.regex.Pattern;

class UsernameValidator {
    private static final String REGEX = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
    private final Pattern pattern;

    public UsernameValidator() {
        this.pattern = Pattern.compile(REGEX);
    }

    public boolean isValid(String username) {
        if (username == null) {
            return false;
        }
        return pattern.matcher(username).matches();
    }
}

