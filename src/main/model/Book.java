package model;

public class Book {
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
    public String getTitle() { return title; }

     // Returns author name
    public String getAuthor() { return author; }

    // Returns Unique book identifier (ISBN)
    public String getIsbn() { return isbn; }

    // Checks if the book is available
    public boolean isAvailable() { return available; }

    // Updates the availability status
    public void setAvailable(boolean available) { this.available = available; }
}