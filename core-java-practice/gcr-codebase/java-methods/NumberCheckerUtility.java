import java.util.Scanner;

public class NumberCheckerUtility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = storeDigits(num);
        System.out.println("Digit Count: " + countDigits(num));
        System.out.println("Is Duck Number: " + isDuck(digits));
        System.out.println("Is Armstrong: " + isArmstrong(num, digits));
        findLargestTwo(digits);
        findSmallestTwo(digits);

        sc.close();
    }

    public static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }

    public static int[] storeDigits(int n) {
        String s = String.valueOf(Math.abs(n));
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        return arr;
    }

    public static boolean isDuck(int[] digits) {
        // Contains a zero, but usually not at the start (handled by int type)
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int num, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int d : digits) sum += Math.pow(d, power);
        return sum == num;
    }

    public static void findLargestTwo(int[] digits) {
        int large = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > large) {
                secondLarge = large;
                large = d;
            } else if (d > secondLarge && d != large) {
                secondLarge = d;
            }
        }
        System.out.println("Largest: " + large + ", Second Largest: " + secondLarge);
    }

    public static void findSmallestTwo(int[] digits) {
        int small = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < small) {
                secondSmall = small;
                small = d;
            } else if (d < secondSmall && d != small) {
                secondSmall = d;
            }
        }
        System.out.println("Smallest: " + small + ", Second Smallest: " + secondSmall);
    }
}