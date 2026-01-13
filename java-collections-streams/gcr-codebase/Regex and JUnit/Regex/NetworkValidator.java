import java.util.regex.Pattern;

public class NetworkValidator {
    private static final String IP_PART = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    private static final String IP_REGEX = "^" + IP_PART + "\\." + IP_PART + "\\." + IP_PART + "\\." + IP_PART + "$";
    private static final String CARD_REGEX = "^(4|5)\\d{15}$";

    public boolean isIPv4(String input) {
        return Pattern.matches(IP_REGEX, input);
    }

    public boolean isCreditCard(String input) {
        return Pattern.matches(CARD_REGEX, input);
    }
}