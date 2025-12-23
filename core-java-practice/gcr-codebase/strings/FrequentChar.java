import java.util.Scanner;

public class FrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        int[] freq = new int[256];
        
        for (char c : str.toCharArray()) freq[c]++;

        char maxChar = ' ';
        int maxCount = -1;
        for (int i = 0; i < str.length(); i++) {
            if (maxCount < freq[str.charAt(i)]) {
                maxCount = freq[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }
        System.out.println("Most Frequent Character: '" + maxChar + "'");
        sc.close();
    }
}