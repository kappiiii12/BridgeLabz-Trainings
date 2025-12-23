import java.util.Scanner;

public class FactorArrayProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);
        System.out.println("Greatest Factor: " + factors[factors.length - 1]);
        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        System.out.println("Product of Cubes: " + productCubes(factors));

        sc.close();
    }

    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int k = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[k++] = i;
        return factors;
    }

    public static int sumFactors(int[] arr) {
        int sum = 0;
        for (int f : arr) sum += f;
        return sum;
    }

    public static long productFactors(int[] arr) {
        long prod = 1;
        for (int f : arr) prod *= f;
        return prod;
    }

    public static double productCubes(int[] arr) {
        double prod = 1;
        for (int f : arr) prod *= Math.pow(f, 3);
        return prod;
    }
}