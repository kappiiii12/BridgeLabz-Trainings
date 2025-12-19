import java.util.Scanner ;

public class FactorialWhileLoop {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = n;
        if(number >0){
            int factorial = 1;
            while(number>=1){
               factorial *= number;
               number--;
            } 
            System.out.println("factorial of "+n+" is "+ factorial);
        }
        else
            System.out.println("number you entered is not natural");
        sc.close();
}
}
