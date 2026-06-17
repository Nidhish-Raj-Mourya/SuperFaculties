import java.util.ArrayDeque;
import java.util.Queue;

public class VideoUploadQueue {

    public static void main(String[] args) {

        Queue<String> uploadQueue = new ArrayDeque<>();

        uploadQueue.offer("TravelReel.mp4");
        uploadQueue.offer("JavaTutorial.mp4");
        uploadQueue.offer("CollegeEvent.mp4");

        System.out.println("Videos waiting for processing:");
        System.out.println(uploadQueue);

        while (!uploadQueue.isEmpty()) {

            String video = uploadQueue.poll();

            System.out.println("\nProcessing: " + video);
            System.out.println("Compressing video...");
            System.out.println("Generating thumbnail...");
            System.out.println("Upload completed.");
        }
    }
}