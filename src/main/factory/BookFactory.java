package factory;

import model.Book;
import model.Item;

// Concrete creator that produces Book items
public class BookFactory extends ItemFactory {

    // creator here represents the book's author
    @Override
    public Item createItem(String title, String creator, String id) {
        return new Book(title, creator, id);
    }
}