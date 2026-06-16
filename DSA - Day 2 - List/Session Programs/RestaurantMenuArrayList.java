import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantMenuArrayList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ArrayList stores restaurant menu items
        ArrayList<String> menuItems = new ArrayList<>();

        while (true) {

            System.out.println("\n===== RESTAURANT MENU SYSTEM =====");
            System.out.println("1. Add Menu Item");
            System.out.println("2. Show Complete Menu");
            System.out.println("3. Update Menu Item");
            System.out.println("4. Remove Menu Item");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {

                case 1:
                    addMenuItem(scanner, menuItems);
                    break;

                case 2:
                    showMenu(menuItems);
                    break;

                case 3:
                    updateMenuItem(scanner, menuItems);
                    break;

                case 4:
                    removeMenuItem(scanner, menuItems);
                    break;

                case 5:
                    System.out.println("Restaurant menu system closed.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Please choose between 1 and 5.");
            }
        }
    }

    private static void addMenuItem(
            Scanner scanner,
            ArrayList<String> menuItems
    ) {

        System.out.print("Enter food item name: ");
        String foodItem = scanner.nextLine().trim();

        if (foodItem.isEmpty()) {
            System.out.println("Food item cannot be empty.");
            return;
        }

        menuItems.add(foodItem);

        System.out.println(foodItem + " added successfully.");

        // Show menu after adding an item
        showMenu(menuItems);
    }

    private static void showMenu(
            ArrayList<String> menuItems
    ) {

        System.out.println("\n===== CURRENT RESTAURANT MENU =====");

        if (menuItems.isEmpty()) {
            System.out.println("No food items available.");
            return;
        }

        for (int index = 0; index < menuItems.size(); index++) {

            System.out.println(
                    (index + 1) + ". " + menuItems.get(index)
            );
        }
    }

    private static void updateMenuItem(
            Scanner scanner,
            ArrayList<String> menuItems
    ) {

        if (menuItems.isEmpty()) {
            System.out.println("No items available to update.");
            return;
        }

        showMenu(menuItems);

        System.out.print("Enter item number to update: ");

        int itemNumber;

        try {
            itemNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException exception) {
            System.out.println("Please enter a valid item number.");
            return;
        }

        int index = itemNumber - 1;

        if (index < 0 || index >= menuItems.size()) {
            System.out.println("Invalid item number.");
            return;
        }

        System.out.print("Enter new food item name: ");
        String newFoodItem = scanner.nextLine().trim();

        if (newFoodItem.isEmpty()) {
            System.out.println("Food item cannot be empty.");
            return;
        }

        menuItems.set(index, newFoodItem);

        System.out.println("Menu item updated successfully.");

        // Show menu after updating
        showMenu(menuItems);
    }

    private static void removeMenuItem(
            Scanner scanner,
            ArrayList<String> menuItems
    ) {

        if (menuItems.isEmpty()) {
            System.out.println("No items available to remove.");
            return;
        }

        showMenu(menuItems);

        System.out.print("Enter item number to remove: ");

        int itemNumber;

        try {
            itemNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException exception) {
            System.out.println("Please enter a valid item number.");
            return;
        }

        int index = itemNumber - 1;

        if (index < 0 || index >= menuItems.size()) {
            System.out.println("Invalid item number.");
            return;
        }

        String removedItem = menuItems.remove(index);

        System.out.println(
                removedItem + " removed successfully."
        );

        // Show menu after removing
        showMenu(menuItems);
    }
}