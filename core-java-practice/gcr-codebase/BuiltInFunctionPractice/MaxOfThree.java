import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = getIntInput(sc, "first");
        int b = getIntInput(sc, "second");
        int c = getIntInput(sc, "third");

        int max = findMax(a, b, c);
        System.out.println("The maximum value is: " + max);
        sc.close();
    }

    public static int getIntInput(Scanner sc, String label) {
        System.out.print("Enter " + label + " number: ");
        return sc.nextInt();
    }

    public static int findMax(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }
}