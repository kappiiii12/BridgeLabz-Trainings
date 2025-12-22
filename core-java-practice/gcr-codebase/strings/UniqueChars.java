public class UniqueChars {
    public static void main(String[] args) {
        String input = "programming";
        char[] unique = findUnique(input);
        System.out.print("Unique Characters: ");
        for (char c : unique) if (c != 0) System.out.print(c + " ");
    }

    public static int getLen(String s) {
        int count = 0;
        for (char c : s.toCharArray()) count++;
        return count;
    }

    public static char[] findUnique(String s) {
        int n = getLen(s);
        char[] temp = new char[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) temp[k++] = s.charAt(i);
        }
        
        char[] result = new char[k];
        for(int i=0; i<k; i++) result[i] = temp[i];
        return result;
    }
}