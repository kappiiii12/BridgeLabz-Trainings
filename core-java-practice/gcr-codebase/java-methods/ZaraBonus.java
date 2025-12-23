import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] empData = new double[10][2]; // [Salary][Years]

        for (int i = 0; i < 10; i++) {
            empData[i][0] = Math.random() * 90000 + 10000; // 5-digit salary
            empData[i][1] = Math.random() * 15; // Random service years
        }

        double[][] updated = calculateBonus(empData);
        displayResults(empData, updated);
        sc.close();
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[10][2]; // [NewSalary][Bonus]
        for (int i = 0; i < 10; i++) {
            double bonusPercent = (data[i][1] > 5) ? 0.05 : 0.02;
            result[1][i] = data[i][0] * bonusPercent; // Bonus amount
            result[0][i] = data[i][0] + result[1][i]; // New Salary
        }
        // Swapped indices slightly to fit [2][10] logic if preferred, 
        // but here using [10][2] for clarity.
        return result; 
    }

    public static void displayResults(double[][] old, double[][] updated) {
        System.out.println("Old Sal\tYears\tNew Sal\tBonus");
        double sumOld = 0, sumNew = 0, sumBonus = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t%.1f\t%.2f\t%.2f\n", old[i][0], old[i][1], updated[i][0], updated[i][1]);
            sumOld += old[i][0]; sumNew += updated[i][0]; sumBonus += updated[i][1];
        }
        System.out.println("Total Old Salary: " + sumOld);
        System.out.println("Total New Salary: " + sumNew);
        System.out.println("Total Bonus Paid: " + sumBonus);
    }
}