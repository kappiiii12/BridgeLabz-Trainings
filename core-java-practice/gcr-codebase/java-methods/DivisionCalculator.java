import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number and divisor: ");
        int num = scanner.nextInt();
        int div = scanner.nextInt();

        int[] results = findRemainderAndQuotient(num, div);
        System.out.println("Quotient: " + results[1] + ", Remainder: " + results[0]);
        scanner.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient}; // Index 0: Remainder, Index 1: Quotient
    }
}