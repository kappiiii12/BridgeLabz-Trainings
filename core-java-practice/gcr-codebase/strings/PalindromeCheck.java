public class PalindromeCheck {
    public static void main(String[] args) {
        String text = "radar";
        System.out.println("Logic 1 (Iterative): " + isPal1(text));
        System.out.println("Logic 2 (Recursive): " + isPal2(text, 0, text.length() - 1));
        System.out.println("Logic 3 (Array Reverse): " + isPal3(text));
    }

    // Logic 1: Start and End comparison
    public static boolean isPal1(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }

    // Logic 2: Recursion
    public static boolean isPal2(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPal2(s, start + 1, end - 1);
    }

    // Logic 3: Reverse Array
    public static boolean isPal3(String s) {
        char[] original = s.toCharArray();
        char[] reverse = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            reverse[i] = s.charAt(s.length() - 1 - i);
        }
        for (int i = 0; i < s.length(); i++) {
            if (original[i] != reverse[i]) return false;
        }
        return true;
    }
}