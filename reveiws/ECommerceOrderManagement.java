package reveiws;
import java.util.*;

class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}

interface Payment {
    void processPayment(double amount) throws PaymentFailedException;
}

class UPIPayment implements Payment {
    @Override
    public void processPayment(double amount) throws PaymentFailedException {
        System.out.println("Processing UPI payment of $" + amount);
    }
}

public class ECommerceOrderManagement {

    private Map<Integer, Order> orderHistory = new HashMap<>(); 
    private Stack<Integer> lastOrderTracker = new Stack<>();    
    private List<Product> catalog = new ArrayList<>();
    private int idCounter = 101;

    static class Product {
        String name; 
        double price;
        Product(String name, double price){ 
         this.name = name; this.price = price; 
        }
    }

    static class Order {
        int id;
        LinkedList<Product> items; 
        double total;
        Order(int id, LinkedList<Product> items, double total) {
            this.id = id; this.items = items; this.total = total;
        }
    }

    public void addToCatalog(String name, double price) {
        catalog.add(new Product(name, price));
    }

    public void placeOrder(LinkedList<Product> selectedItems, Payment method) {
        double total = 0;
        for (Product p : selectedItems) 
            total += p.price;

        try {
            method.processPayment(total);
            Order newOrder = new Order(idCounter++, selectedItems, total);
            orderHistory.put(newOrder.id, newOrder);
            lastOrderTracker.push(newOrder.id);
            System.out.println("Order placed successfully! ID: " + newOrder.id);
        } catch (PaymentFailedException e) {
            System.out.println("Order Failed: " + e.getMessage());
        }
    }

    public void undoLastOrder() {
        if (!lastOrderTracker.isEmpty()) {
            int lastId = lastOrderTracker.pop();
            orderHistory.remove(lastId);
            System.out.println("Order " + lastId + " has been undone/removed.");
        } else {
            System.out.println("No orders to undo.");
        }
    }

    public void displayCatalog() {
        System.out.println("\n--- Product Catalog ---");
        for (Product p : catalog) System.out.println(p.name + " - $" + p.price);
    }
   
    public static void main(String[] args) {
        ECommerceOrderManagement system = new ECommerceOrderManagement();
        system.addToCatalog("Laptop", 1200.00);
        
        LinkedList<Product> cart = new LinkedList<>();
        cart.add(new Product("Laptop", 1200.00));
        
        system.placeOrder(cart, new UPIPayment()); 
        system.undoLastOrder();
    }
}