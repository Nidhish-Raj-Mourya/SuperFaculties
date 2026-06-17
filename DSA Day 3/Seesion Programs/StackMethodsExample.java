import java.util.ArrayDeque;
import java.util.Deque;

public class StackMethodsExample {

    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();

        // 1. push() - adds element at the top
        stack.push("Home");
        stack.push("Products");
        stack.push("Cart");

        System.out.println("Stack after push():");
        System.out.println(stack);

        // 2. peek() - views top element without removing it
        String topElement = stack.peek();

        System.out.println("\nTop element using peek():");
        System.out.println(topElement);

        // 3. pop() - removes and returns top element
        String removedElement = stack.pop();

        System.out.println("\nRemoved element using pop():");
        System.out.println(removedElement);

        System.out.println("\nStack after pop():");
        System.out.println(stack);

        // 4. isEmpty() - checks whether stack is empty
        System.out.println("\nIs stack empty?");
        System.out.println(stack.isEmpty());

        // 5. size() - returns number of elements
        System.out.println("\nStack size:");
        System.out.println(stack.size());

        // 6. contains() - checks whether an element exists
        System.out.println("\nDoes stack contain Home?");
        System.out.println(stack.contains("Home"));

        // 7. remove() - removes a specific element
        stack.remove("Home");

        System.out.println("\nStack after removing Home:");
        System.out.println(stack);

        // 8. clear() - removes all elements
        stack.clear();

        System.out.println("\nStack after clear():");
        System.out.println(stack);

        System.out.println("\nIs stack empty now?");
        System.out.println(stack.isEmpty());
    }
}