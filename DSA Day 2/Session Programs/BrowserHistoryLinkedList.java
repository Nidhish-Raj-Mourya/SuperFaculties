class PageNode {

    String url;
    PageNode previous;
    PageNode next;

    PageNode(String url) {
        this.url = url;
    }
}

public class BrowserHistoryLinkedList {

    public static void main(String[] args) {

        // Create browser history pages
        PageNode google = new PageNode("google.com");
        PageNode youtube = new PageNode("youtube.com");
        PageNode instagram = new PageNode("instagram.com");

        // Connect pages in both directions
        google.next = youtube;

        youtube.previous = google;
        youtube.next = instagram;

        instagram.previous = youtube;

        // Current page
        PageNode currentPage = instagram;

        System.out.println("Current Page:");
        System.out.println(currentPage.url);

        // Go back
        if (currentPage.previous != null) {
            currentPage = currentPage.previous;
        }

        System.out.println("\nAfter pressing Back:");
        System.out.println(currentPage.url);

        // Go back again
        if (currentPage.previous != null) {
            currentPage = currentPage.previous;
        }

        System.out.println("\nAfter pressing Back again:");
        System.out.println(currentPage.url);

        // Go forward
        if (currentPage.next != null) {
            currentPage = currentPage.next;
        }

        System.out.println("\nAfter pressing Forward:");
        System.out.println(currentPage.url);
    }
}