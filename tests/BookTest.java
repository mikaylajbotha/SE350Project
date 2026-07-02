import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import model.Book;

public class BookTest {

    // Tests that a book is created with correct details
    @Test
    public void testBookCreation() {
        Book book = new Book("The Hobbit", "J.R.R. Tolkien", "0345339681");

        // Checks title and author values
        assertEquals("The Hobbit", book.getTitle());
        assertEquals("J.R.R. Tolkien", book.getAuthor());
    }

    // Tests that a new book is available by default
    @Test
    public void testBookIsAvailableByDefault() {
        Book book = new Book("The Hobbit", "J.R.R. Tolkien", "0345339681");

        // Confirms book availability status
        assertTrue(book.isAvailable());
    }
}