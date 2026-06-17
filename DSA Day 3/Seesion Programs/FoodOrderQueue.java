import java.util.ArrayDeque;
import java.util.Queue;

public class FoodOrderQueue {

    public static void main(String[] args) {

        Queue<String> orderQueue = new ArrayDeque<>();

        // New orders arrive
        orderQueue.offer("Order 101 - Pizza");
        orderQueue.offer("Order 102 - Burger");
        orderQueue.offer("Order 103 - Pasta");

        System.out.println("Orders waiting:");
        System.out.println(orderQueue);

        // View the first order
        System.out.println("\nNext order to prepare:");
        System.out.println(orderQueue.peek());

        // Prepare first order
        String preparedOrder = orderQueue.poll();

        System.out.println("\nPrepared order:");
        System.out.println(preparedOrder);

        System.out.println("\nRemaining orders:");
        System.out.println(orderQueue);
    }
}