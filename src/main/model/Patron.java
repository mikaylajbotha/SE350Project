package model;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    // Patron's display name
    private String name;

    // Unique patron ID
    private String id;

    // Books this patron currently has checked out
    private List<Book> checkedOutBooks;

    // Sets up a new patron with name, ID, and an empty checked-out list
    public Patron(String name, String id) {
        this.name = name;
        this.id = id;
        this.checkedOutBooks = new ArrayList<>();
    }

    // Returns patron's name
    public String getName() { return name; }

    // Returns patron's ID
    public String getId() { return id; }

    // Returns the patron's currently checked-out books
    public List<Book> getCheckedOutBooks() { return checkedOutBooks; }
}