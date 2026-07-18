package catalog;

import model.Item;
import java.util.ArrayList;
import java.util.List;

// Singleton Pattern: there should only ever be one LibraryCatalog for the
// whole application, since it represents the single shared collection of
// items the library owns. The constructor is private and every caller
// gets the same instance through getInstance().
public class LibraryCatalog {

    // The single shared instance
    private static LibraryCatalog instance;

    // List that stores all items in the catalog (Books, DVDs, etc.)
    private List<Item> items;

    // Private constructor prevents outside code from creating another catalog
    private LibraryCatalog() {
        this.items = new ArrayList<>();
    }

    // Returns the single shared LibraryCatalog instance, creating it on first use
    public static LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    // Adds an item to the catalog
    public void addItem(Item item) {
        items.add(item);
    }

    // Returns all items in the catalog
    public List<Item> getItems() {
        return items;
    }

    // Finds an item by its unique id, or null if not found
    public Item findById(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
}