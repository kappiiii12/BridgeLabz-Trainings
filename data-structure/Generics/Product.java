class Category { String name; Category(String n) { name = n; } }
class BookCategory extends Category { BookCategory() { super("Books"); } }

class Product<T extends Category> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // UC: Generic method to apply discounts
    public static <P extends Product<?>> void applyDiscount(P product, double percentage) {
        product.price -= product.price * (percentage / 100);
        System.out.println("New price for " + product.name + ": " + product.price);
    }
}