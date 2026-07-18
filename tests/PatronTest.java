import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import model.Book;
import model.Patron;

public class PatronTest {

    // Tests that a patron is created with the correct name and id
    @Test
    public void testPatronCreation() {
        Patron patron = new Patron("Alex Rivera", "P-100");

        assertEquals("Alex Rivera", patron.getName());
        assertEquals("P-100", patron.getId());
    }

    // Tests that a new patron starts with no checked-out books
    @Test
    public void testPatronStartsWithNoCheckedOutBooks() {
        Patron patron = new Patron("Alex Rivera", "P-100");

        assertTrue(patron.getCheckedOutBooks().isEmpty());
    }

    // Tests that a book added to the checked-out list is reflected in getCheckedOutBooks()
    @Test
    public void testAddingBookUpdatesCheckedOutList() {
        Patron patron = new Patron("Alex Rivera", "P-100");
        Book book = new Book("Dune", "Frank Herbert", "0441172717");

        // Patron has no addBook() method yet, so the list is updated directly
        patron.getCheckedOutBooks().add(book);

        assertEquals(1, patron.getCheckedOutBooks().size());
        assertEquals(book, patron.getCheckedOutBooks().get(0));
    }
}