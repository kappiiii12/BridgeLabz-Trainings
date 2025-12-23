import java.util.Scanner;

public class ChocolateDistributor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();

        int[] distribution = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + distribution[1]);
        System.out.println("Remaining chocolates: " + distribution[0]);
        scanner.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }
}