import java.util.ArrayList;

public class InstagramDraftArrayList {

    public static void main(String[] args) {

        // ArrayList storing Instagram draft posts
        ArrayList<String> draftPosts = new ArrayList<>();

        // Add draft posts
        draftPosts.add("Travel photo draft");
        draftPosts.add("Java tutorial reel draft");
        draftPosts.add("College event post draft");

        // Display all drafts
        System.out.println("Instagram Draft Posts:");

        for (int i = 0; i < draftPosts.size(); i++) {
            System.out.println(
                    "Draft " + (i + 1) + ": " + draftPosts.get(i)
            );
        }

        // Access a particular draft using index
        System.out.println("\nSecond draft:");
        System.out.println(draftPosts.get(1));

        // Update a draft
        draftPosts.set(1, "Updated Java tutorial reel draft");

        // Remove a draft
        draftPosts.remove(0);

        System.out.println("\nDrafts after update and removal:");

        for (int i = 0; i < draftPosts.size(); i++) {
            System.out.println(
                    "Draft " + (i + 1) + ": " + draftPosts.get(i)
            );
        }
    }
}