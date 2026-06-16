import java.util.ArrayDeque;
import java.util.Deque;

public class InstagramUndoStack {

    public static void main(String[] args) {

        // Stack storing previous caption versions
        Deque<String> captionHistory = new ArrayDeque<>();

        String caption = "My first Instagram post";

        System.out.println("Original caption:");
        System.out.println(caption);

        // Save current caption before editing
        captionHistory.push(caption);

        caption = "My first travel post";

        System.out.println("\nAfter first edit:");
        System.out.println(caption);

        // Save current caption before editing again
        captionHistory.push(caption);

        caption = "My first travel post from Indore";

        System.out.println("\nAfter second edit:");
        System.out.println(caption);

        // Undo the latest edit
        if (!captionHistory.isEmpty()) {
            caption = captionHistory.pop();
        }

        System.out.println("\nAfter first undo:");
        System.out.println(caption);

        // Undo again
        if (!captionHistory.isEmpty()) {
            caption = captionHistory.pop();
        }

        System.out.println("\nAfter second undo:");
        System.out.println(caption);
    }
}