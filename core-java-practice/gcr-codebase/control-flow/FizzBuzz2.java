import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for FizzBUzz : ");
        int number = sc.nextInt();
        if(number%3==0 && number%5==0)
            System.out.println("FizzBuzz");
        else if(number%3==0)
            System.out.println("Fizz");
        else if(number%5 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
        sc.close();
    }
}
