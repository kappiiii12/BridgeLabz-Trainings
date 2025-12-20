import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get year input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check leap year using single if condition
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        sc.close();
    }
}
