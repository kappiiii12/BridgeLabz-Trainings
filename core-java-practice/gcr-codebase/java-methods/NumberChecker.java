import java.util.Arrays;

public class NumberChecker {
    // Basic Digit Operations
    public static int getDigitCount(long n) {
        return String.valueOf(Math.abs(n)).length();
    }

    public static int[] getDigitsArray(long n) {
        String s = String.valueOf(Math.abs(n));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }

    // Number Logic Methods
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int n) {
        int[] digits = getDigitsArray(n);
        int power = digits.length;
        double sum = 0;
        for (int d : digits) sum += Math.pow(d, power);
        return (int) sum == n;
    }

    public static boolean isHarshad(int n) {
        int sum = 0;
        for (int d : getDigitsArray(n)) sum += d;
        return n % sum == 0;
    }

    public static boolean isNeon(int n) {
        int sq = n * n;
        int sum = 0;
        for (int d : getDigitsArray(sq)) sum += d;
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, prod = 1;
        for (int d : getDigitsArray(n)) {
            sum += d;
            prod *= d;
        }
        return sum == prod;
    }

    public static boolean isAutomorphic(int n) {
        int sq = n * n;
        return String.valueOf(sq).endsWith(String.valueOf(n));
    }

    public static boolean isBuzz(int n) {
        return (n % 7 == 0) || (n % 10 == 7);
    }

    // Statistics on Digits
    public static void findLargestTwo(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        System.out.println("Largest: " + first + ", Second Largest: " + second);
    }

    public static int[][] getDigitFrequency(int n) {
        int[] digits = getDigitsArray(n);
        int[] counts = new int[10];
        for (int d : digits) counts[d]++;
        
        int unique = 0;
        for (int c : counts) if (c > 0) unique++;

        int[][] freq = new int[unique][2];
        int idx = 0;
        for (int i = 0; i < 10; i++) {
            if (counts[i] > 0) {
                freq[idx][0] = i;
                freq[idx][1] = counts[i];
                idx++;
            }
        }
        return freq;
    }
}