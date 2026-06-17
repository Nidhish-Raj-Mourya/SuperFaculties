import java.util.ArrayDeque;
import java.util.Queue;

public class CabBookingQueue {

    public static void main(String[] args) {

        Queue<String> bookingQueue = new ArrayDeque<>();

        bookingQueue.offer("Booking 101 - Airport");
        bookingQueue.offer("Booking 102 - Railway Station");
        bookingQueue.offer("Booking 103 - Office");

        System.out.println("Waiting bookings: " + bookingQueue);

        String assignedBooking = bookingQueue.poll();

        System.out.println("Assigned to driver: " + assignedBooking);
        System.out.println("Remaining bookings: " + bookingQueue);
    }
}