import java.util.Scanner;

public class MayaBMIFitnessTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height in meters: ");
        double heightInMeters = scanner.nextDouble();

        System.out.print("Enter weight in kilograms: ");
        double weightInKg = scanner.nextDouble();

        double bmi = weightInKg / (heightInMeters * heightInMeters);

        System.out.printf("Your BMI is: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }

        scanner.close();
    }
}
