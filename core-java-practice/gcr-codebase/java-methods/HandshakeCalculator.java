import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        int totalHandshakes = calculateMaxHandshakes(numberOfStudents);
        System.out.println("The maximum number of possible handshakes is: " + totalHandshakes);
        scanner.close();
    }

    public static int calculateMaxHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}