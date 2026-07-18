package model;

// Common interface for anything that can live in the library catalog
// and be checked out/returned (Book, DVD, Magazine, etc.)
public interface Item {

    // Unique identifier for the item (ISBN for books, catalog # for DVDs, etc.)
    String getId();

    // Display title of the item
    String getTitle();

    // Whether the item is currently available to check out
    boolean isAvailable();

    // Updates the availability status
    void setAvailable(boolean available);

    // Short label used by the menu/UI to describe the item type (e.g. "Book", "DVD")
    String getType();
}