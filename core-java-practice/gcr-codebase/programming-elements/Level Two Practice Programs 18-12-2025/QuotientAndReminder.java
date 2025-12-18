import java.util.Scanner;

public class QuotientAndReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int number1 = sc.nextInt();
         System.out.println("Enter Second Number : ");
        int number2 = sc.nextInt();

        int quotient = number1/number2 ;
        int reminder = number1%number2 ;
         System.out.println("Quotient is : "+quotient + "Reminder is : "+reminder + " of twp numbers "+ number1 +" and "+number2);
        sc.close();
         
    }
}
