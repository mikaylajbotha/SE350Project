package model;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;

    // Unique patron ID
    private String id;

    // List of books currently checked out by the patron
    private List<Book> checkedOutBooks;

    // Initializes patron with name, ID, and empty checked-out list
    public Patron(String name, String id) {
        this.name = name;
        this.id = id;
        this.checkedOutBooks = new ArrayList<>();
    }

    // Returns patron name
    public String getName() { return name; }

    // Returns patron ID
    public String getId() { return id; }

    // Returns list of checked-out books
    public List<Book> getCheckedOutBooks() { return checkedOutBooks; }
}