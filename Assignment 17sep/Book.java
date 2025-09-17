public class Book {
    public String ISBN;         // Public - accessible everywhere
    protected String title;     // Protected - accessible in subclass and same package
    private String author;      // Private - accessible only within Book class

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public getter for author
    public String getAuthor() {
        return author;
    }

    // Public setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Display method
    public void displayBookDetails() {
        System.out.println("ISBN  : " + ISBN);
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
    }
}
