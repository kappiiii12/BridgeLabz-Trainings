import java.util.Scanner;

public class SubstringCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String str = sc.nextLine();
        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        int count = 0;
        int lastIndex = 0;
        while ((lastIndex = str.indexOf(sub, lastIndex)) != -1) {
            count++;
            lastIndex += sub.length();
        }
        System.out.println("Occurrences: " + count);
        sc.close();
    }
}