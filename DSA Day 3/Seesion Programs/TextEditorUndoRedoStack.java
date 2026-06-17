import java.util.ArrayDeque;
import java.util.Deque;

public class TextEditorUndoRedoStack {

    public static void main(String[] args) {

        Deque<String> undoStack = new ArrayDeque<>();
        Deque<String> redoStack = new ArrayDeque<>();

        String text = "";

        // First edit
        undoStack.push(text);
        text = "Hello";
        redoStack.clear();

        System.out.println("After first edit: " + text);

        // Second edit
        undoStack.push(text);
        text = "Hello World";
        redoStack.clear();

        System.out.println("After second edit: " + text);

        // Third edit
        undoStack.push(text);
        text = "Hello Java World";
        redoStack.clear();

        System.out.println("After third edit: " + text);

        // Undo
        if (!undoStack.isEmpty()) {
            redoStack.push(text);
            text = undoStack.pop();
        }

        System.out.println("After undo: " + text);

        // Undo again
        if (!undoStack.isEmpty()) {
            redoStack.push(text);
            text = undoStack.pop();
        }

        System.out.println("After second undo: " + text);

        // Redo
        if (!redoStack.isEmpty()) {
            undoStack.push(text);
            text = redoStack.pop();
        }

        System.out.println("After redo: " + text);
    }
}