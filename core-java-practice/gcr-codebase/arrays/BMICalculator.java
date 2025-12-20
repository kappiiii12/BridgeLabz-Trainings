import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of persons:");
        int n = sc.nextInt();

        double[] weight = new double[n];   
        double[] height = new double[n];   
        double[] bmi = new double[n];
        String[] status = new String[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight (kg) and height (m) of person " + (i + 1));
            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();

            if (weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid input, please enter again");
                i--;
            }
        }


        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 25) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

    
        System.out.println("\nBMI Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + height[i] + " m");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + status[i]);
            System.out.println("-------------------------");
        }

        sc.close();
    }
}
