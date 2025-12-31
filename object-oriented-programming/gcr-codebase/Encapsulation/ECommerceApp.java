// Interface for Taxable products
interface Taxable {
    double calculateTax(double price);
    void getTaxDetails();
}

// Abstract Superclass
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    // Encapsulation: Getters and Setters
    public double getPrice() { return price; }
    public String getName() { return name; }
    
    public void setPrice(double price) {
        if (price >= 0) this.price = price;
    }

    public void displayFinalPrice() {
        double discount = calculateDiscount();
        double tax = 0;
        
        // Check if this specific object implements Taxable
        if (this instanceof Taxable) {
            tax = ((Taxable) this).calculateTax(price);
        }
        
        double finalPrice = price + tax - discount;
        System.out.println("Product: " + name + " | Final Price: $" + finalPrice);
    }
}

// Concrete Class: Electronics (Taxable)
class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() { return getPrice() * 0.10; } // 10% off

    @Override
    public double calculateTax(double price) { return price * 0.15; } // 15% tax

    @Override
    public void getTaxDetails() { System.out.println("Electronics Tax: 15%"); }
}

// Concrete Class: Groceries (No Tax)
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() { return getPrice() * 0.05; } // 5% off
}

public class ECommerceApp {
    public static void main(String[] args) {
        Product[] cart = {
            new Electronics(501, "Laptop", 1000),
            new Groceries(502, "Organic Milk", 10)
        };

        for (Product p : cart) {
            p.displayFinalPrice();
        }
    }
}