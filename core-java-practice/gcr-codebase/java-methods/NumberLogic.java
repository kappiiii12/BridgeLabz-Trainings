import java.util.Scanner;

public class NumberLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
            
            if (isPositive(nums[i])) {
                System.out.print("Positive and ");
                System.out.println(isEven(nums[i]) ? "Even" : "Odd");
            } else {
                System.out.println("Negative");
            }

        }

        int comp = compare(nums[0], nums[4]);
        if (comp == 1) System.out.println("First element is greater than the last.");
        else if (comp == 0) System.out.println("First and last elements are equal.");
        else System.out.println("First element is less than the last.");
        sc.close();
    }

    public static boolean isPositive(int n) { return n >= 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        if (n1 == n2) return 0;
        return -1;
    }
}