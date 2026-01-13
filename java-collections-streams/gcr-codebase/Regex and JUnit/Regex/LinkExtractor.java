import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class LinkExtractor {
    private static final String REGEX = "https?://[\\w.-]+(?:\\.[\\w.-]+)+[/\\w._~:/?#\\[\\]@!$&'()*+,;=.-]*";

    public List<String> extract(String text) {
        List<String> links = new ArrayList<>();
        Matcher matcher = Pattern.compile(REGEX).matcher(text);
        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links;
    }
}