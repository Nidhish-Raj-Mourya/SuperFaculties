import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class QueueSearchingSorting {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(40);
        queue.offer(10);
        queue.offer(30);
        queue.offer(20);

        // Search using contains()
        System.out.println(
                "Contains 30: " + queue.contains(30)
        );

        // Convert queue into list for sorting
        List<Integer> sortedQueue =
                new ArrayList<>(queue);

        Collections.sort(sortedQueue);

        System.out.println(
                "Sorted elements: " + sortedQueue
        );

        // Original queue remains unchanged
        System.out.println(
                "Original queue: " + queue
        );
    }
}