import java.util.Scanner ;

public class IsLargest {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        int number1 = sc.nextInt();
        System.out.println("Enter number2 : ");
        int number2 = sc.nextInt();
        System.out.println("Enter number3 : ");
        int number3 = sc.nextInt();

        if(number1 > number2 && number1 > number3){
            System.out.println(" Is the first number the largest? YES");
             System.out.println(" Is the second number the largest? NO");
              System.out.println(" Is the third number the largest? NO");
            }
        else if(number2 > number1 && number2 > number3){
            System.out.println(" Is the first number the largest? NO");
             System.out.println(" Is the second number the largest? YES");
              System.out.println(" Is the third number the largest? NO");
            }
        else{
            System.out.println(" Is the first number the largest? NO");
             System.out.println(" Is the second number the largest? NO");
              System.out.println(" Is the third number the largest? YES");
            }

            sc.close();
    }
}
