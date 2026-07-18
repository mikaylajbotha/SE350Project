import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;
import catalog.LibraryCatalog;
import model.Book;

public class LibraryCatalogTest {

    // Tests that adding an item increases catalog size
    @Test
    public void testAddItemIncreasesCatalogSize() {
        LibraryCatalog catalog = LibraryCatalog.getInstance();
        int before = catalog.getItems().size();

        Book book = new Book("Dune", "Frank Herbert", "0441172717");
        catalog.addItem(book);

        // Verifies catalog grew by exactly one item
        assertEquals(before + 1, catalog.getItems().size());
    }

    // Tests that getInstance() always returns the same shared catalog (Singleton)
    @Test
    public void testGetInstanceReturnsSameObject() {
        LibraryCatalog first = LibraryCatalog.getInstance();
        LibraryCatalog second = LibraryCatalog.getInstance();

        // Both references should point to the exact same object
        assertSame(first, second);
    }

    // Tests that an item added through one reference is visible through another
    @Test
    public void testSingletonSharesStateAcrossReferences() {
        LibraryCatalog first = LibraryCatalog.getInstance();
        Book book = new Book("1984", "George Orwell", "0451524934");
        first.addItem(book);

        LibraryCatalog second = LibraryCatalog.getInstance();

        // Item found through "second" even though it was added via "first"
        assertEquals(book, second.findById("0451524934"));
    }
}