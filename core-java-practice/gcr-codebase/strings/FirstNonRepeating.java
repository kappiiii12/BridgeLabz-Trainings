public class FirstNonRepeating {
    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeat(input);
        System.out.println("First non-repeating character: " + (result == 0 ? "None" : result));
    }

    public static char findFirstNonRepeat(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) return s.charAt(i);
        }
        return 0;
    }
}