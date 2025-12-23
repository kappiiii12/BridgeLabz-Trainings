import java.util.Scanner;

public class OTPAndCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // OTP Logic
        String[] otps = new String[10];
        for(int i=0; i<10; i++) otps[i] = generateOTP();
        System.out.println("OTPs generated. Are they unique? " + areOTPsUnique(otps));

        // Calendar Logic
        System.out.print("Enter month (1-12) and year: ");
        int month = sc.nextInt();
        int year = sc.nextInt();
        displayCalendar(month, year);

        sc.close();
    }

    public static String generateOTP() {
        return String.valueOf((int)(Math.random() * 900000) + 100000);
    }

    public static boolean areOTPsUnique(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) return false;
            }
        }
        return true;
    }

    public static void displayCalendar(int m, int y) {
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (m == 2 && ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)) days[2] = 29;

        System.out.println("    " + months[m] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Gregorian Algorithm for first day
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int firstDay = (1 + x + (31 * m0) / 12) % 7;

        for (int i = 0; i < firstDay; i++) System.out.print("    ");
        for (int i = 1; i <= days[m]; i++) {
            System.out.printf("%3d ", i);
            if (((i + firstDay) % 7 == 0) || (i == days[m])) System.out.println();
        }
    }
}