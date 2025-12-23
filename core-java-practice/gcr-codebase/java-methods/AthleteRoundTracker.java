import java.util.Scanner;

public class AthleteRoundTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TARGET_DISTANCE_METERS = 5000.0;

        System.out.print("Enter side 1 (meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2 (meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3 (meters): ");
        double side3 = scanner.nextDouble();

        double roundsNeeded = calculateRoundsNeeded(side1, side2, side3, TARGET_DISTANCE_METERS);
        System.out.printf("To complete 5km, the athlete must complete %.2f rounds.%n", roundsNeeded);
        scanner.close();
    }

    public static double calculateRoundsNeeded(double s1, double s2, double s3, double target) {
        double perimeter = s1 + s2 + s3;
        return target / perimeter;
    }
}