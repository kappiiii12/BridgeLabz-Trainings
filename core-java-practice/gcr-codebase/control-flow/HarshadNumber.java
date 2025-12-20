import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int sum = 0;

        // Calculate sum of digits using while loop
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        // Check if the number is divisible by the sum of its digits
        if (sum != 0 && number % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        sc.close();
    }
}
