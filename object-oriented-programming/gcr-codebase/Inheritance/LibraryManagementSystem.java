class Book {
    protected String title;
    protected int publicationYear;

    // Constructor for Book
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display basic book info
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Published: " + publicationYear);
    }
}

// Subclass: Author (Extends Book)
class Author extends Book {
    private String authorName;
    private String bio;

    // Constructor for Author
    public Author(String title, int publicationYear, String authorName, String bio) {
        // super() calls the constructor of the Book class
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    // Overriding displayInfo to include Author details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Displays title and year from Book class
        System.out.println("Author: " + authorName);
        System.out.println("Bio: " + bio);
    }
}