import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
        } else {
            int recResult = sumRecursion(n);
            int formResult = sumFormula(n);
            
            System.out.println("Result (Recursion): " + recResult);
            System.out.println("Result (Formula): " + formResult);
            System.out.println("Verification: " + (recResult == formResult ? "Matches!" : "Mismatch!"));
        }
        sc.close();
    }

    public static int sumRecursion(int n) {
        if (n == 1) return 1;
        return n + sumRecursion(n - 1);
    }

    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}