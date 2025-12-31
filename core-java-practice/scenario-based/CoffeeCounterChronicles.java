import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double GST_RATE = 0.18;  

        while (true) {
            System.out.print("Enter coffee type (espresso/latte/cappuccino/exit): ");
            String coffeeType = sc.next().toLowerCase();

            if (coffeeType.equals("exit")) {
                System.out.println("Exiting the coffee counter. Thank you!");
                break;
            }

            double price;

            switch (coffeeType) {
                case "espresso":
                    price = 100;
                    break;
                case "latte":
                    price = 120;
                    break;
                case "cappuccino":
                    price = 150;
                    break;
                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    continue;  
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double total = price * quantity;
            double gstAmount = total * GST_RATE;
            double totalBill = total + gstAmount;

            System.out.printf("Total bill (without GST): %.2f\n", total);
            System.out.printf("GST @18%%: %.2f\n", gstAmount);
            System.out.printf("Total bill (with GST): %.2f\n\n", totalBill);
        }

        sc.close();
    }
}
