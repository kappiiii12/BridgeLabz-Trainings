import java.util.Scanner ;
public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter price of one unit : ");
        int price = sc.nextInt();
        System.out.println("enter quantity needed : ");
        int quantity = sc.nextInt();
        int TotalPrice = price*quantity;
        System.out.println("Total price is "+TotalPrice + " if the unit price is "+price+" and quantity is "+quantity);
        sc.nextInt();
    }
}
