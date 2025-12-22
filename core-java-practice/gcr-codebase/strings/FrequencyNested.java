public class FrequencyNested {
    public static void main(String[] args) {
        String[] result = getFreqNested("banana");
        for (String s : result) if (s != null) System.out.println(s);
    }

    public static String[] getFreqNested(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[s.length()];
        String[] result = new String[s.length()];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; 
                }
            }
            result[i] = chars[i] + ": " + freq[i];
        }
        return result;
    }
}