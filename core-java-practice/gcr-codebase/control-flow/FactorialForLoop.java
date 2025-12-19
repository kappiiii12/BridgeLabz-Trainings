import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number >0){
            int factorial = 1;
            for(int i = 1 ; i<= number ;i++){
               factorial *= i;
            } 
            System.out.println("factorial of "+number+" is "+ factorial);
        }
        else
            System.out.println("number you entered is not natural");
        sc.close();
    }
}
