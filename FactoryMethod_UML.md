# Factory Method Pattern - UML Diagram

Applied to item creation so the catalog/UI code can create `Item`s
(`Book`, `DVD`, ...) without knowing which concrete class it's building.

```mermaid
classDiagram
    class Item {
        <<interface>>
        +getId() String
        +getTitle() String
        +isAvailable() boolean
        +setAvailable(boolean available) void
        +getType() String
    }

    class Book {
        -String title
        -String author
        -String isbn
        -boolean available
        +Book(String title, String author, String isbn)
        +getTitle() String
        +getAuthor() String
        +getId() String
        +isAvailable() boolean
        +setAvailable(boolean available) void
        +getType() String
    }

    class DVD {
        -String title
        -String director
        -String catalogNumber
        -boolean available
        +DVD(String title, String director, String catalogNumber)
        +getTitle() String
        +getDirector() String
        +getId() String
        +isAvailable() boolean
        +setAvailable(boolean available) void
        +getType() String
    }

    class ItemFactory {
        <<abstract>>
        +createItem(String title, String creator, String id) Item
    }

    class BookFactory {
        +createItem(String title, String creator, String id) Item
    }

    class DVDFactory {
        +createItem(String title, String creator, String id) Item
    }

    Item <|.. Book
    Item <|.. DVD
    ItemFactory <|-- BookFactory
    ItemFactory <|-- DVDFactory
    BookFactory ..> Book : creates
    DVDFactory ..> DVD : creates
```

**Notes**
- `ItemFactory` is the abstract Creator that declares the factory method `createItem(...)`.
- `BookFactory` and `DVDFactory` are concrete Creators, each overriding `createItem(...)`
  to return their own concrete `Item` subtype.
- Client code (`MenuSystem`) only depends on `ItemFactory` and `Item`, so a new item
  type (e.g. `Magazine`) can be added later by writing a new factory + model class,
  with no changes to existing client code.