import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseStackUsingRecursion {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Before: " + stack);

        reverseStack(stack);

        System.out.println("After: " + stack);
    }

    static void reverseStack(Deque<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        reverseStack(stack);

        insertAtBottom(stack, top);
    }

    static void insertAtBottom(
            Deque<Integer> stack,
            int value
    ) {

        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int top = stack.pop();

        insertAtBottom(stack, value);

        stack.push(top);
    }
}