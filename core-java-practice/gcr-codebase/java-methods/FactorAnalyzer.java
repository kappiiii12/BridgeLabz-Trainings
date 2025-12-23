import java.util.Scanner;

public class FactorAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);
        
        System.out.print("Factors found: ");
        for (int f : factors) System.out.print(f + " ");
        
        System.out.println("\nSum of factors: " + calculateSum(factors));
        System.out.println("Sum of squares: " + calculateSumOfSquares(factors));
        System.out.println("Product of factors: " + calculateProduct(factors));
        sc.close();
    }

    public static int[] getFactors(int n) {
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
    
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int f : arr) sum += f;
        return sum;
    }

    public static long calculateProduct(int[] arr) {
        long prod = 1;
        for (int f : arr) prod *= f;
        return prod;
    }

    public static double calculateSumOfSquares(int[] arr) {
        double sumSq = 0;
        for (int f : arr) sumSq += Math.pow(f, 2);
        return sumSq;
    }
}