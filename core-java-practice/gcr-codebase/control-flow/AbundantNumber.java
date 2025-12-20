import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize sum of divisors
        int sum = 0;

        // Find divisors using for loop
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        // Check if the number is abundant
        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        sc.close();
    }
}
