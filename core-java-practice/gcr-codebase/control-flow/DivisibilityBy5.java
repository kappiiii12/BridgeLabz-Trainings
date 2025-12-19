import java.util.Scanner ;
public class DivisibilityBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Enter a number : ");
        if(number%5 == 0)
            System.out.println("Is the number "+number+" divisible by 5? YES");
        else
            System.out.println("Is the number "+number+" divisible by 5? NO");

        sc.close();
    }
}
