package ui;

import java.util.Scanner;
import java.util.List;

import catalog.LibraryCatalog;
import factory.BookFactory;
import factory.DVDFactory;
import factory.ItemFactory;
import model.Item;

// Command-line menu loop for the Library Checkout System
public class MenuSystem {

    // Grabs the one shared catalog instance (Singleton)
    private final LibraryCatalog catalog = LibraryCatalog.getInstance();

    // Seeds the catalog with sample items via factories (Factory Method),
    // so BookFactory/DVDFactory decide what concrete class gets built
    private void seedCatalog() {
        ItemFactory bookFactory = new BookFactory();
        ItemFactory dvdFactory = new DVDFactory();

        catalog.addItem(bookFactory.createItem("Siddhartha", "Hermann Hesse", "0345339681"));
        catalog.addItem(dvdFactory.createItem("Aquamarine", "Elizabeth Allen Rosenbaum", "DVD-1001"));
    }

    // Seeds the catalog, then runs the menu loop until the user exits
    public void start() {
        seedCatalog();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Loop until user chooses to exit
        while (running) {
            // Print menu options
            System.out.println("\n--- Library Checkout System ---");
            System.out.println("1. Checkout item");
            System.out.println("2. Return item");
            System.out.println("3. Search catalog");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            // Read the user's choice
            String choice = scanner.nextLine();

            // Route to the matching action
            switch (choice) {
                case "1" -> System.out.println("Checkout feature coming soon.");
                case "2" -> System.out.println("Return feature coming soon.");
                case "3" -> printCatalog();
                case "4" -> running = false;
                default -> System.out.println("Invalid option.");
            }
        }

        System.out.println("Goodbye!");
    }

    // Prints every item currently in the shared catalog with its status
    private void printCatalog() {
        List<Item> items = catalog.getItems();
        System.out.println("\n--- Catalog (" + items.size() + " items) ---");
        for (Item item : items) {
            String status = item.isAvailable() ? "Available" : "Checked out";
            System.out.println("[" + item.getType() + "] " + item.getTitle()
                    + " (id: " + item.getId() + ") - " + status);
        }
    }
}