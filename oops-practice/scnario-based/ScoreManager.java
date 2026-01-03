import java.util.Scanner;
import java.util.InputMismatchException;

public class ScoreManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        // Get number of students with validation
        while (true) {
            try {
                System.out.print("Enter the number of students: ");
                n = scanner.nextInt();
                if (n <= 0) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Please enter a valid positive integer.");
                scanner.nextLine(); 
            }
        }

        double[] scores = new double[n];
        double sum = 0;

        // Input scores with validation
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("Enter score for student " + (i + 1) + ": ");
                    double s = scanner.nextDouble();
                    if (s < 0 || s > 100) {
                        System.out.println("Score must be between 0 and 100.");
                    } else {
                        scores[i] = s;
                        sum += s;
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a numeric value.");
                    scanner.nextLine();
                }
            }
        }

        // Calculations
        double average = sum / n;
        double highest = scores[0];
        double lowest = scores[0];

        for (double s : scores) {
            if (s > highest) highest = s;
            if (s < lowest) lowest = s;
        }

        // Display Results
        System.out.println("\n--- Performance Report ---");
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score:  " + lowest);
        
        System.out.print("Scores above average: ");
        for (double s : scores) {
            if (s > average) System.out.print(s + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}