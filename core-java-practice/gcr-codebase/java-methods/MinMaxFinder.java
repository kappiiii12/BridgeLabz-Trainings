import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int[] results = findSmallestAndLargest(n1, n2, n3);
        System.out.println("Smallest: " + results[0] + ", Largest: " + results[1]);
        scanner.close();
    }

    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int smallest = Math.min(n1, Math.min(n2, n3));
        int largest = Math.max(n1, Math.max(n2, n3));
        return new int[]{smallest, largest};
    }
}