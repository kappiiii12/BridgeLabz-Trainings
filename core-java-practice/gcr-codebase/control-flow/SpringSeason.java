import java.util.Scanner ;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month : ");
        int month = sc.nextInt();
         System.out.println("Enter Date : ");
        int date = sc.nextInt();

        if((month > 3 && month < 6) || (month == 3 && date >= 20) || (month == 6 && date <=20))
            System.out.println("its Spring Season");
        else 
            System.out.println("its NOT Spring Season");
        sc.close();
    }
}
