class PhotoNode {

    String photoName;
    PhotoNode previous;
    PhotoNode next;

    PhotoNode(String photoName) {
        this.photoName = photoName;
    }
}

public class PhotoGalleryLinkedList {

    public static void main(String[] args) {

        PhotoNode photo1 = new PhotoNode("Beach.jpg");
        PhotoNode photo2 = new PhotoNode("Mountain.jpg");
        PhotoNode photo3 = new PhotoNode("Sunset.jpg");

        // Connect nodes
        photo1.next = photo2;

        photo2.previous = photo1;
        photo2.next = photo3;

        photo3.previous = photo2;

        PhotoNode currentPhoto = photo1;

        System.out.println("Current Photo: "
                + currentPhoto.photoName);

        // Move to next photo
        if (currentPhoto.next != null) {
            currentPhoto = currentPhoto.next;
        }

        System.out.println("Next Photo: "
                + currentPhoto.photoName);

        // Move to next photo again
        if (currentPhoto.next != null) {
            currentPhoto = currentPhoto.next;
        }

        System.out.println("Next Photo: "
                + currentPhoto.photoName);

        // Move back
        if (currentPhoto.previous != null) {
            currentPhoto = currentPhoto.previous;
        }

        System.out.println("Previous Photo: "
                + currentPhoto.photoName);
    }
}