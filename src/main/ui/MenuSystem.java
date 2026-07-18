package ui;

import java.util.Scanner;
import java.util.List;

import catalog.LibraryCatalog;
import factory.BookFactory;
import factory.DVDFactory;
import factory.ItemFactory;
import model.Item;

// Handles the command-line menu loop for the Library Checkout System
public class MenuSystem {

    // Always the same shared catalog (Singleton)
    private final LibraryCatalog catalog = LibraryCatalog.getInstance();

    // Seeds the catalog with a couple of sample items using the Factory Method
    // pattern, so BookFactory/DVDFactory decide how each item gets built.
    private void seedCatalog() {
        ItemFactory bookFactory = new BookFactory();
        ItemFactory dvdFactory = new DVDFactory();

        catalog.addItem(bookFactory.createItem("The Hobbit", "J.R.R. Tolkien", "0345339681"));
        catalog.addItem(dvdFactory.createItem("Inception", "Christopher Nolan", "DVD-1001"));
    }

    // Starts the menu and processes user choices
    public void start() {
        seedCatalog();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Continues showing menu until user exits
        while (running) {
            // Display available menu options
            System.out.println("\n--- Library Checkout System ---");
            System.out.println("1. Checkout item");
            System.out.println("2. Return item");
            System.out.println("3. Search catalog");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            // Reads user input
            String choice = scanner.nextLine();

            // Handles selected menu option
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

    // Lists everything currently in the shared catalog
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