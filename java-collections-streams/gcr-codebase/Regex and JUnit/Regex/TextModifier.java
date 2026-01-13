public class TextModifier {
    public String removeExtraSpaces(String text) {
        return text.replaceAll("\\s{2,}", " ");
    }

    public String censor(String text, String[] badWords) {
        String result = text;
        for (String word : badWords) {
            result = result.replaceAll("(?i)\\b" + word + "\\b", "****");
        }
        return result;
    }
}