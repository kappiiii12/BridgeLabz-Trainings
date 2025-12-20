import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i;
        for( i =2;i<number;i++){
            if(number%i == 0){
                System.out.println("Number is not prime");
                break;
            }
           
        }
         if(i>=number)
            System.out.println("Number is Prime");
        sc.close();
    }
}
