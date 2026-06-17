import java.util.ArrayDeque;
import java.util.Queue;

public class QueueBasicMethods {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();

        // Add elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        // View front element
        System.out.println("Front element: " + queue.peek());

        // Remove front element
        int removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Queue after removal: " + queue);

        // Check size
        System.out.println("Queue size: " + queue.size());

        // Check whether queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Check whether an element exists
        System.out.println("Does queue contain 20? "
                + queue.contains(20));

        // Remove all remaining elements
        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }

        System.out.println("Final queue: " + queue);
    }
}