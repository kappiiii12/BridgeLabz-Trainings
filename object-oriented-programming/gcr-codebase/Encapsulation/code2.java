interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;

    public LibraryItem(String itemId, String title) {
        this.itemId = itemId;
        this.title = title;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item: " + title + " (ID: " + itemId + ")");
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;

    public DVD(String id, String title) { super(id, title); }

    @Override
    public int getLoanDuration() { return 7; } // 7 days for DVDs

    @Override
    public void reserveItem() { available = false; }

    @Override
    public boolean checkAvailability() { return available; }
}