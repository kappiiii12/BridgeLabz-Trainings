import java.util.Scanner;

public class SumOfNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum =0;
        while(true){
            double number = sc.nextDouble();
            if(number == 0)
                break;
            sum += number;
        }
         System.out.println("Sum = "+sum);
         sc.close();
    }
}
