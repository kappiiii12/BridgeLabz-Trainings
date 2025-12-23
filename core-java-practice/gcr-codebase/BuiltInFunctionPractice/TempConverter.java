import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius");
        int choice = sc.nextInt();

        System.out.print("Enter temperature value: ");
        double val = sc.nextDouble();

        if (choice == 1) {
            System.out.println("Fahrenheit: " + cToF(val));
        } else {
            System.out.println("Celsius: " + fToC(val));
        }
        sc.close();
    }

    public static double cToF(double c) { return (c * 9 / 5) + 32; }
    public static double fToC(double f) { return (f - 32) * 5 / 9; }
}