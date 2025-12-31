public class Product {
    // Instance Variables
    public String productName;
    public double price;

    // Class Variable
    public static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment shared count
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName + " | Price: $" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total products created: " + totalProducts);
    }
}