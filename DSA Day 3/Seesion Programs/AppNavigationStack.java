import java.util.ArrayDeque;
import java.util.Deque;

public class AppNavigationStack {

    public static void main(String[] args) {

        Deque<String> screenStack = new ArrayDeque<>();

        // Open screens
        screenStack.push("Home");
        screenStack.push("Products");
        screenStack.push("Product Details");
        screenStack.push("Cart");
        screenStack.push("Payment");

        System.out.println("Current Screen: " + screenStack.peek());

        // Press Back
        screenStack.pop();

        System.out.println(
                "After pressing Back: " + screenStack.peek()
        );

        // Press Back again
        screenStack.pop();

        System.out.println(
                "After pressing Back again: " + screenStack.peek()
        );

        System.out.println("\nRemaining Navigation Stack:");

        for (String screen : screenStack) {
            System.out.println(screen);
        }
    }
}