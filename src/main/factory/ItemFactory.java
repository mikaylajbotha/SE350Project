package factory;

import model.Item;

// Factory Method Pattern: ItemFactory declares the factory method that
// subclasses override to decide which concrete Item to instantiate.
// The catalog/UI code only ever talks to this abstract type, never to
// Book or DVD directly, so new item types can be added without changing
// existing client code.
public abstract class ItemFactory {

    // The factory method. Each concrete factory implements this to
    // produce its own kind of Item.
    public abstract Item createItem(String title, String creator, String id);
}