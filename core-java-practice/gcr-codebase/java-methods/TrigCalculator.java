import java.util.Scanner;

public class TrigCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double degrees = scanner.nextDouble();

        double[] trigValues = calculateTrigonometricFunctions(degrees);
        System.out.printf("Sine: %.4f, Cosine: %.4f, Tangent: %.4f%n", trigValues[0], trigValues[1], trigValues[2]);
        scanner.close();
    }

    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double radians = Math.toRadians(angleDegrees);
        return new double[]{
            Math.sin(radians), 
            Math.cos(radians), 
            Math.tan(radians)
        };
    }
}