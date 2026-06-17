import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserBackStack {

    public static void main(String[] args) {

        Deque<String> backStack = new ArrayDeque<>();

        String currentPage = "Google";

        System.out.println("Current Page: " + currentPage);

        // Visit YouTube
        backStack.push(currentPage);
        currentPage = "YouTube";

        System.out.println("Current Page: " + currentPage);

        // Visit Instagram
        backStack.push(currentPage);
        currentPage = "Instagram";

        System.out.println("Current Page: " + currentPage);

        // Press Back
        if (!backStack.isEmpty()) {
            currentPage = backStack.pop();
        }

        System.out.println("After pressing Back: " + currentPage);

        // Press Back again
        if (!backStack.isEmpty()) {
            currentPage = backStack.pop();
        }

        System.out.println("After pressing Back again: " + currentPage);
    }
}