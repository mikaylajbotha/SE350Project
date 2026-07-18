package model;

// Concrete Item representing a book in the catalog 
public class Book implements Item {
    // Book's display title
    private String title;   
    // Book's author
    private String author;

    // Unique book identifier (ISBN)
    private String isbn;

    // Whether the book is currently available to check out
    private boolean available;    

    // Creates a new book, available by default
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

     // Returns the book's title
    @Override
    public String getTitle() { return title; }

     // Returns the author's name
    public String getAuthor() { return author; }

    // Returns the book's ISBN as its unique id
    @Override
    public String getId() { return isbn; }

    // Kept for backward compatibility with existing code/tests calling getIsbn()
    public String getIsbn() { return isbn; }

    // Checks if the book is available
    @Override
    public boolean isAvailable() { return available; }

    // Updates availability status
    @Override
    public void setAvailable(boolean available) { this.available = available; }

    // Identifies this item's type for the UI
    @Override
    public String getType() { return "Book"; }
}