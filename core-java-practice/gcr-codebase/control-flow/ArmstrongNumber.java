import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize variables
        int sum = 0;
        int originalNumber = number;

        // Use while loop to process each digit
        while (originalNumber != 0) {

            // Find the last digit
            int digit = originalNumber % 10;

            // Find the cube of the digit and add to sum
            sum = sum + (digit * digit * digit);

            // Remove the last digit
            originalNumber = originalNumber / 10;
        }

        // Check if the number is an Armstrong Number
        if (sum == number) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}
