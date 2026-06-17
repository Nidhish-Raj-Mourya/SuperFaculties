import java.util.ArrayDeque;
import java.util.Deque;

public class DeleteMiddleOfStack {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Before deletion: " + stack);

        int middlePosition = stack.size() / 2;

        deleteMiddle(stack, middlePosition);

        System.out.println("After deletion:  " + stack);
    }

    static void deleteMiddle(
            Deque<Integer> stack,
            int position
    ) {

        // Middle element reached
        if (position == 0) {
            stack.pop();
            return;
        }

        // Temporarily remove the top element
        int top = stack.pop();

        // Continue toward the middle
        deleteMiddle(stack, position - 1);

        // Restore the removed element
        stack.push(top);
    }
}