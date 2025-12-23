import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Operation: Add (+), Sub (-), Mul (*), Div (/)");
        char op = sc.next().charAt(0);

        System.out.print("Enter two numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        switch (op) {
            case '+': System.out.println("Result: " + add(num1, num2)); break;
            case '-': System.out.println("Result: " + sub(num1, num2)); break;
            case '*': System.out.println("Result: " + mul(num1, num2)); break;
            case '/': System.out.println("Result: " + div(num1, num2)); break;
            default: System.out.println("Invalid operation.");
        }
        sc.close();
    }

    public static double add(double a, double b) { return a + b; }
    public static double sub(double a, double b) { return a - b; }
    public static double mul(double a, double b) { return a * b; }
    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return a / b;
    }
}