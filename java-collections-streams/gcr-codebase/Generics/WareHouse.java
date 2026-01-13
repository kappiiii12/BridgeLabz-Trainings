import java.util.*;

abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) { this.name = name; }
    public abstract String getDetails();
}

class Electronics extends WarehouseItem {
    Electronics(String name) { super(name); }
    public String getDetails() { return "Electronics: " + name; }
}

class Groceries extends WarehouseItem {
    Groceries(String name) { super(name); }
    public String getDetails() { return "Groceries: " + name; }
}

// UC: Generic class with Bounded Type Parameter
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }

    // UC: Wildcard method to display any type of WarehouseItem
    public static void displayItems(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            System.out.println(item.getDetails());
        }
    }

    public List<T> getItems() { return items; }
}