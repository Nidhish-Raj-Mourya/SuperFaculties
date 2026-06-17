import java.util.ArrayDeque;
import java.util.Queue;

public class ReverseQueueUsingRecursion {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("Before: " + queue);

        reverseQueue(queue);

        System.out.println("After:  " + queue);
    }

    static void reverseQueue(Queue<Integer> queue) {

        // Base case
        if (queue.isEmpty()) {
            return;
        }

        // Remove front element
        int frontElement = queue.poll();

        // Reverse remaining queue
        reverseQueue(queue);

        // Add removed element at rear
        queue.offer(frontElement);
    }
}