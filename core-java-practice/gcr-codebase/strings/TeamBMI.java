import java.util.Scanner;

public class TeamBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] measurements = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter weight (kg): ");
            measurements[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm): ");
            measurements[i][1] = sc.nextDouble();
        }

        String[][] report = processBMIData(measurements);
        displayTable(report);
        sc.close();
    }

    public static String[] getBMIAndStatus(double w, double hCm) {
        double hM = hCm / 100.0;
        double bmi = w / (hM * hM);
        String status;

        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";

        return new String[]{String.format("%.2f", bmi), status};
    }

    public static String[][] processBMIData(double[][] data) {
        String[][] report = new String[10][4];
        for (int i = 0; i < 10; i++) {
            String[] result = getBMIAndStatus(data[i][0], data[i][1]);
            report[i][0] = String.valueOf(data[i][1]); // Height
            report[i][1] = String.valueOf(data[i][0]); // Weight
            report[i][2] = result[0];                 // BMI
            report[i][3] = result[1];                 // Status
        }
        return report;
    }

    public static void displayTable(String[][] table) {
        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        System.out.println("------------------------------------");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
        }
    }
}