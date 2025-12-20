import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] table = new int[10];

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        System.out.println("Multiplication Table:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
