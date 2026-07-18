import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import org.junit.jupiter.api.Test;

import factory.BookFactory;
import factory.DVDFactory;
import factory.ItemFactory;
import model.Book;
import model.DVD;
import model.Item;

public class ItemFactoryTest {

    // Tests that BookFactory's factory method produces a Book
    @Test
    public void testBookFactoryCreatesBook() {
        // Use the factory as its abstract type, per the Factory Method pattern
        ItemFactory factory = new BookFactory();
        Item item = factory.createItem("The Hobbit", "J.R.R. Tolkien", "0345339681");

        // Confirms the concrete type produced is a Book
        assertInstanceOf(Book.class, item);
        // Confirms title was passed through correctly
        assertEquals("The Hobbit", item.getTitle());
        // Confirms type label matches Book
        assertEquals("Book", item.getType());
    }

    // Tests that DVDFactory's factory method produces a DVD
    @Test
    public void testDVDFactoryCreatesDVD() {
        // Same factory reference type as above, different concrete factory
        ItemFactory factory = new DVDFactory();
        Item item = factory.createItem("Inception", "Christopher Nolan", "DVD-1001");

        // Confirms the concrete type produced is a DVD
        assertInstanceOf(DVD.class, item);
        // Confirms type label matches DVD
        assertEquals("DVD", item.getType());
    }

    // Tests that items are available immediately after creation, regardless of factory
    @Test
    public void testCreatedItemsAreAvailableByDefault() {
        // One factory per item type
        ItemFactory bookFactory = new BookFactory();
        ItemFactory dvdFactory = new DVDFactory();

        // Create one item from each factory
        Item book = bookFactory.createItem("Dune", "Frank Herbert", "0441172717");
        Item dvd = dvdFactory.createItem("Arrival", "Denis Villeneuve", "DVD-2002");

        // Both should default to available regardless of concrete type
        assertTrue(book.isAvailable());
        assertTrue(dvd.isAvailable());
    }
}