import java.util.Scanner;

public class MultipleBelowHundredForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("Multiple of "+number+" below 100 are : ");
        for(int i=1;i<=100;i++)
            if(i%number==0)
            System.out.print(i+" ");
        sc.close();
    }
}
