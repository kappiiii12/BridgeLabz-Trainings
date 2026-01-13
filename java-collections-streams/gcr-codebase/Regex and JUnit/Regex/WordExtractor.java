import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class WordExtractor {
    private static final String CAP_WORDS = "\\b[A-Z][a-z]+\\b";
    private static final String LANGUAGES = "\\b(Java|Python|JavaScript|Go)\\b";

    public List<String> getCapitalized(String text) {
        return find(text, CAP_WORDS);
    }

    public List<String> getLanguages(String text) {
        return find(text, LANGUAGES);
    }

    private List<String> find(String text, String regex) {
        List<String> results = new ArrayList<>();
        Matcher matcher = Pattern.compile(regex).matcher(text);
        while (matcher.find()) {
            results.add(matcher.group());
        }
        return results;
    }
}