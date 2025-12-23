import java.util.Scanner;

public class NumberSignChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();

        int result = checkNumberSign(inputNumber);
        System.out.println("Result code: " + result + " (1:Pos, -1:Neg, 0:Zero)");
        scanner.close();
    }

    public static int checkNumberSign(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }
}