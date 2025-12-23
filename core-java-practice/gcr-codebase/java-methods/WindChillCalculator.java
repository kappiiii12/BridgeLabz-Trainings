import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        double temp = scanner.nextDouble();
        System.out.print("Enter Wind Speed: ");
        double speed = scanner.nextDouble();

        double windChill = calculateWindChill(temp, speed);
        System.out.printf("The Wind Chill temperature is: %.2f%n", windChill);
        scanner.close();
    }

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}