public class InstagramCarouselArray {

    public static void main(String[] args) {

        // Array storing carousel images
        String[] carouselImages = {
                "photo1.jpg",
                "photo2.jpg",
                "photo3.jpg"
        };

        // Display all carousel images
        System.out.println("Instagram Carousel Post:");

        for (int i = 0; i < carouselImages.length; i++) {
            System.out.println(
                    "Slide " + (i + 1) + ": " + carouselImages[i]
            );
        }

        // Access a particular image using index
        System.out.println("\nSecond image:");
        System.out.println(carouselImages[1]);

        // Update an image
        carouselImages[1] = "updatedPhoto2.jpg";

        System.out.println("\nAfter updating second image:");

        for (int i = 0; i < carouselImages.length; i++) {
            System.out.println(
                    "Slide " + (i + 1) + ": " + carouselImages[i]
            );
        }
    }
}