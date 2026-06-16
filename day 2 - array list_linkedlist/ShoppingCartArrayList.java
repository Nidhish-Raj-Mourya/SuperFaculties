import java.util.ArrayList;

public class ShoppingCartArrayList {

    public static void main(String[] args) {

        // ArrayList stores shopping cart items
        ArrayList<String> cartItems = new ArrayList<>();

        // Add products to cart
        cartItems.add("Shoes");
        cartItems.add("T-Shirt");
        cartItems.add("Watch");

        // Display all cart items
        System.out.println("Shopping Cart:");

        for (int i = 0; i < cartItems.size(); i++) {
            System.out.println(
                    "Item " + (i + 1) + ": " + cartItems.get(i)
            );
        }

        // Access a particular item
        System.out.println("\nSecond item:");
        System.out.println(cartItems.get(1));

        // Update an item
        cartItems.set(1, "Black T-Shirt");

        // Remove an item
        cartItems.remove(0);

        System.out.println("\nCart after update and removal:");

        for (int i = 0; i < cartItems.size(); i++) {
            System.out.println(
                    "Item " + (i + 1) + ": " + cartItems.get(i)
            );
        }
    }
}