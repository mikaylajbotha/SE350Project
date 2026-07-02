package ui;

import java.util.Scanner;

// Handles the command-line menu loop for the Library Checkout System
public class MenuSystem {

    // Starts the menu and processes user choices
    public void start() {
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
                case "3" -> System.out.println("Search feature coming soon.");
                case "4" -> running = false;
                default -> System.out.println("Invalid option.");
            }
        }
        
        System.out.println("Goodbye!");
    }
}