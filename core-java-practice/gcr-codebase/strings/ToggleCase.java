import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String toggled = "";

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) toggled += Character.toLowerCase(c);
            else if (Character.isLowerCase(c)) toggled += Character.toUpperCase(c);
            else toggled += c;
        }
        System.out.println("Toggled String: " + toggled);
        sc.close();
    }
}