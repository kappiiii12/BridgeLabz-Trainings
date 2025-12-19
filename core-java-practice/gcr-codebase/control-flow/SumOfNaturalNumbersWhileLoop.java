import java.util.Scanner ;

public class SumOfNaturalNumbersWhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int number =n;
        int formulaSUM = number * (number+1) /2 ;
        int normalSum =0;
        if(number >0){
             for(int i = 1 ; i <= number ; i++){
                  normalSum+=i;
             }
             System.out.println("sum using formula is "+formulaSUM+"\nsum using for loop is : "+normalSum);
        }
        else
            System.out.println(n+" is not natural");

        sc.close();

}
}
