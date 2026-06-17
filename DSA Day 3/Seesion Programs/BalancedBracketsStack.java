import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBracketsStack {

    public static void main(String[] args) {

        String expression = "{[()]}";

        Deque<Character> stack = new ArrayDeque<>();

        boolean balanced = true;

        for (char ch : expression.toCharArray()) {

            // Opening brackets go into the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets check the top opening bracket
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }

                char top = stack.pop();

                if (!isMatchingPair(top, ch)) {
                    balanced = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            balanced = false;
        }

        if (balanced) {
            System.out.println("Brackets are balanced.");
        } else {
            System.out.println("Brackets are not balanced.");
        }
    }

    static boolean isMatchingPair(char opening, char closing) {

        return (opening == '(' && closing == ')')
                || (opening == '{' && closing == '}')
                || (opening == '[' && closing == ']');
    }
}