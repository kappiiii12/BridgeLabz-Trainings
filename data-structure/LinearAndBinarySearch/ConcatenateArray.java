public class ConcatenateArray {
    public static String joinStrings(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Java", "is", "fun"};
        System.out.println(joinStrings(words));
    }
}