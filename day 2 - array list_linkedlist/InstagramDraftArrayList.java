import java.util.ArrayList;

public class InstagramDraftArrayList {

    public static void main(String[] args) {

        // ArrayList stores Instagram post drafts
        ArrayList<String> drafts = new ArrayList<>();

        // Save drafts
        drafts.add("Travel photo with caption");
        drafts.add("Java tutorial reel");
        drafts.add("College event carousel");

        // Display all saved drafts
        System.out.println("Saved Instagram Drafts:");

        for (int i = 0; i < drafts.size(); i++) {
            System.out.println(
                    "Draft " + (i + 1) + ": " + drafts.get(i)
            );
        }

        // Open a particular draft
        System.out.println("\nOpening second draft:");
        System.out.println(drafts.get(1));

        // Edit a draft
        drafts.set(1, "Updated Java tutorial reel");

        // Delete a draft
        drafts.remove(0);

        System.out.println("\nDrafts after editing and deleting:");

        for (int i = 0; i < drafts.size(); i++) {
            System.out.println(
                    "Draft " + (i + 1) + ": " + drafts.get(i)
            );
        }
    }
}