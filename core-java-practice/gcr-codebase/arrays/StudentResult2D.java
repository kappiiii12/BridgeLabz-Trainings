import java.util.Scanner;

public class StudentResult2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int number = sc.nextInt();

        
        double[][] marks = new double[number][4];
        String[] grade = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter Physics, Chemistry and Maths marks for student " + (i + 1));
            marks[i][0] = sc.nextDouble();
            marks[i][1] = sc.nextDouble();
            marks[i][2] = sc.nextDouble();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks! Enter again.");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {
            marks[i][3] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (marks[i][3] >= 90) {
                grade[i] = "A";
            } else if (marks[i][3] >= 75) {
                grade[i] = "B";
            } else if (marks[i][3] >= 60) {
                grade[i] = "C";
            } else if (marks[i][3] >= 40) {
                grade[i] = "D";
            } else {
                grade[i] = "Fail";
            }
        }

        System.out.println("\nStudent Results:");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + marks[i][3]);
            System.out.println("Grade: " + grade[i]);
            System.out.println("----------------------");
        }

        sc.close();
    }
}
