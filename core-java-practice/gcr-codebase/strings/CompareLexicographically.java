import java.util.Scanner;

public class CompareLexicographically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String 1: ");
        String s1 = sc.nextLine();
        System.out.print("String 2: ");
        String s2 = sc.nextLine();

        int comparison = 0;
        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                comparison = s1.charAt(i) - s2.charAt(i);
                break;
            }
        }
        if (comparison == 0) comparison = s1.length() - s2.length();

        if (comparison < 0) System.out.println(s1 + " comes before " + s2);
        else if (comparison > 0) System.out.println(s2 + " comes before " + s1);
        else System.out.println("Strings are equal");
        sc.close();
    }
}