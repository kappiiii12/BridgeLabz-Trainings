class Book2 {
    String title;
    String author;
    double price;
    boolean isAvailable;

    // Constructor to initialize the book
    public Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // Default to available
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, '" + title + "' is currently unavailable.");
        }
    }
}