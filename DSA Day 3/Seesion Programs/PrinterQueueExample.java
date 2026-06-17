import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueueExample {

    public static void main(String[] args) {

        Queue<String> printQueue = new ArrayDeque<>();

        // Documents sent to printer
        printQueue.offer("Resume.pdf");
        printQueue.offer("ProjectReport.docx");
        printQueue.offer("Invoice.pdf");

        System.out.println("Documents waiting:");
        System.out.println(printQueue);

        // View next document
        System.out.println("\nNext document to print:");
        System.out.println(printQueue.peek());

        // Print first document
        String printedDocument = printQueue.poll();

        System.out.println("\nPrinted:");
        System.out.println(printedDocument);

        System.out.println("\nRemaining documents:");
        System.out.println(printQueue);
    }
}