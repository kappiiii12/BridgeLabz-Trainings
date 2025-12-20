import java.util.Scanner;

public class FactorsForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Factors of "+number+" are :");
        for(int i =1;i<=number ;i++){
            if (number%i==0) 
                System.out.println(i);     
        }
        sc.close();
;    }
}
