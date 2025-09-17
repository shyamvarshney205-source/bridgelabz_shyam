public class Book {
    // Static variable shared across all book objects
    private static String libraryName = "Central City Library";

    // Instance variables
    private String title;
    private String author;
    private final String isbn;  // Final variable ensures immutability of ISBN

    // Constructor using 'this' keyword to resolve ambiguity
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details only if the object is a Book instance
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid object. Not a book.");
        }
    }

    // Getter for ISBN (as requested)
    public String getIsbn() {
        if (this instanceof Book) {
            return isbn;
        } else {
            return "Invalid object.";
        }
    }
}
