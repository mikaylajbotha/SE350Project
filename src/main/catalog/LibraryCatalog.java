package catalog;

import model.Book;
import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    // List that stores all books in the catalog
    private List<Book> items;

    // Initializes the catalog with an empty list
    public LibraryCatalog() {
        this.items = new ArrayList<>();
    }

    // Adds a book to the catalog
    public void addItem(Book book) {
        items.add(book);
    }

    // Returns all books in the catalog
    public List<Book> getItems() {
        return items;
    }
}