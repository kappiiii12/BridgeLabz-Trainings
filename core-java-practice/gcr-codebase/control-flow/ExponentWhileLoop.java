import java.util.Scanner;

public class ExponentWhileLoop {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        int res = 1;
        int i=1;
        while(i<=power){
            res *= number;
            i++;
        }
        System.out.println(res);
        sc.close();
    }
}
