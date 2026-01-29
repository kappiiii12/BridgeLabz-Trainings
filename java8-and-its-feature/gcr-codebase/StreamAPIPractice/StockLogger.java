package StreamAPIPractice;

import java.util.Arrays;
import java.util.List;

public class StockLogger {
    public static void main(String[] args) {
        // Simulating a live feed of stock prices for a specific ticker (e.g., RELIANCE)
        List<Double> stockPrices = Arrays.asList(2560.50, 2562.10, 2558.75, 2565.00, 2570.30);

        System.out.println("--- Live Stock Price Feed ---");

        // Task: Use forEach() to print each update
        stockPrices.forEach(price -> 
            System.out.printf("Update Received: ₹%.2f%n", price)
        );
    }
}
