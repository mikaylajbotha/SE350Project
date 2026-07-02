import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import catalog.LibraryCatalog;
import model.Book;

public class LibraryCatalogTest {

    // Tests that adding a book increases catalog size
    @Test
    public void testAddItemIncreasesCatalogSize() {
        // Creates a new catalog and book
        LibraryCatalog catalog = new LibraryCatalog();
        Book book = new Book("Dune", "Frank Herbert", "0441172717");

         // Adds book to catalog
        catalog.addItem(book);

        // Verifies catalog contains one book
        assertEquals(1, catalog.getItems().size());
    }
}