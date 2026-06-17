import java.util.ArrayDeque;
import java.util.Queue;

public class InstagramUploadQueue {

    public static void main(String[] args) {

        // Queue storing posts waiting for upload processing
        Queue<String> uploadQueue = new ArrayDeque<>();

        // Users upload posts
        uploadQueue.offer("Travel Reel");
        uploadQueue.offer("Java Tutorial Video");
        uploadQueue.offer("College Event Photos");

        System.out.println("Posts waiting for processing:");
        System.out.println(uploadQueue);

        // Process the first uploaded post
        String firstPost = uploadQueue.poll();

        System.out.println("\nProcessing:");
        System.out.println(firstPost);

        System.out.println("\nRemaining upload queue:");
        System.out.println(uploadQueue);

        // View the next post without removing it
        System.out.println("\nNext post to process:");
        System.out.println(uploadQueue.peek());
    }
}