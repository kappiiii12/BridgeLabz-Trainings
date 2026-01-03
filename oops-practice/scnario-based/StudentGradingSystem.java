import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        int[] ids = {101, 102, 103};
        // 3 students, 3 subjects (Math, Science, English)
        double[][] grades = new double[3][3]; 
        Scanner sc = new Scanner(System.in);

        // Input with Validation
        for (int i = 0; i < names.length; i++) {
            System.out.println("Entering grades for " + names[i] + " (ID: " + ids[i] + ")");
            for (int j = 0; j < 3; j++) {
                while (true) {
                    try {
                        System.out.print("Subject " + (j + 1) + " grade: ");
                        double g = Double.parseDouble(sc.nextLine());
                        if (g < 0 || g > 100) throw new IllegalArgumentException();
                        grades[i][j] = g;
                        break;
                    } catch (Exception e) {
                        System.out.println("Error: Enter a numeric grade between 0-100.");
                    }
                }
            }
        }

        calculateStudentStats(names, grades);
        calculateSubjectHighs(grades);
    }

    public static void calculateStudentStats(String[] names, double[][] grades) {
        double classTotal = 0;
        System.out.println("\n--- Student Averages ---");
        for (int i = 0; i < grades.length; i++) {
            double sum = 0;
            for (double score : grades[i]) sum += score;
            double avg = sum / grades[i].length;
            classTotal += avg;
            System.out.printf("%s: Total = %.1f, Avg = %.1f%n", names[i], sum, avg);
        }
        System.out.printf("Overall Class Average: %.1f%n", classTotal / names.length);
    }

    public static void calculateSubjectHighs(double[][] grades) {
        System.out.println("\n--- Subject High Scores ---");
        for (int j = 0; j < grades[0].length; j++) {
            double high = grades[0][j];
            for (int i = 0; i < grades.length; i++) {
                if (grades[i][j] > high) high = grades[i][j];
            }
            System.out.println("Subject " + (j + 1) + " High Score: " + high);
        }
    }
}