class TextState {

    String text;
    TextState previous;
    TextState next;

    TextState(String text) {
        this.text = text;
    }
}

public class TextEditorUndoRedo {

    public static void main(String[] args) {

        TextState version1 =
                new TextState("Hello");

        TextState version2 =
                new TextState("Hello World");

        TextState version3 =
                new TextState("Hello Java World");

        // Connect text versions
        version1.next = version2;

        version2.previous = version1;
        version2.next = version3;

        version3.previous = version2;

        TextState currentVersion = version3;

        System.out.println("Current Text:");
        System.out.println(currentVersion.text);

        // Undo
        if (currentVersion.previous != null) {
            currentVersion = currentVersion.previous;
        }

        System.out.println("\nAfter Undo:");
        System.out.println(currentVersion.text);

        // Undo again
        if (currentVersion.previous != null) {
            currentVersion = currentVersion.previous;
        }

        System.out.println("\nAfter Second Undo:");
        System.out.println(currentVersion.text);

        // Redo
        if (currentVersion.next != null) {
            currentVersion = currentVersion.next;
        }

        System.out.println("\nAfter Redo:");
        System.out.println(currentVersion.text);
    }
}