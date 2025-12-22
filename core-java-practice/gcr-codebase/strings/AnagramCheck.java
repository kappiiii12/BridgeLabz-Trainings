public class AnagramCheck {
    public static void main(String[] args) {
        System.out.println("Are 'listen' and 'silent' anagrams? " + checkAnagram("listen", "silent"));
    }

    public static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) return false;
        }
        return true;
    }
}