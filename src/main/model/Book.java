package model;

public class Book implements Item {
    private String title;   
    private String author;

    // Unique book identifier (ISBN)
    private String isbn;

    // Availability status of the book
    private boolean available;    

    // Creates a new book that is available by default
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

     // Returns book title
    @Override
    public String getTitle() { return title; }

     // Returns author name
    public String getAuthor() { return author; }

    // Returns Unique book identifier (ISBN)
    @Override
    public String getId() { return isbn; }

    // Kept for backward compatibility with existing code/tests that call getIsbn()
    public String getIsbn() { return isbn; }

    // Checks if the book is available
    @Override
    public boolean isAvailable() { return available; }

    // Updates the availability status
    @Override
    public void setAvailable(boolean available) { this.available = available; }

    // Identifies this item's type for the UI
    @Override
    public String getType() { return "Book"; }
}