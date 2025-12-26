import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getDetails() { return title + " by " + author; }
}

class Library {
    private String name;
    private List<Book> books; // Aggregation: Library has books

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) { books.add(book); }

    public void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) System.out.println("- " + b.getDetails());
    }
}