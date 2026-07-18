package factory;

import model.DVD;
import model.Item;

// Concrete creator that produces DVD items
public class DVDFactory extends ItemFactory {

    // creator here represents the DVD's director
    @Override
    public Item createItem(String title, String creator, String id) {
        return new DVD(title, creator, id);
    }
}