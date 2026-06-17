import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterJobQueue {

    public static void main(String[] args) {

        Queue<String> printQueue = new ArrayDeque<>();

        printQueue.offer("Resume.pdf");
        printQueue.offer("ProjectReport.docx");
        printQueue.offer("Invoice.pdf");
        System.out.println("Print queue:");
        System.out.println(printQueue);

        while (!printQueue.isEmpty()) {

            String document = printQueue.poll();

            System.out.println("Printing: " + document);
        }

        System.out.println("All documents printed.");
    }
}