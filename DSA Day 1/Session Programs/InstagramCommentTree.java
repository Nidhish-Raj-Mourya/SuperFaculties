import java.util.ArrayList;
import java.util.List;

class Comment {

    String username;
    String text;

    // Child comments / replies
    List<Comment> replies = new ArrayList<>();

    Comment(String username, String text) {
        this.username = username;
        this.text = text;
    }

    void addReply(Comment reply) {
        replies.add(reply);
    }
}

public class InstagramCommentTree {

    public static void main(String[] args) {

        // Root comment
        Comment mainComment =
                new Comment("nidhish", "Great post!");

        // Replies to root comment
        Comment reply1 =
                new Comment("rahul", "Thank you!");

        Comment reply2 =
                new Comment("priya", "I agree!");

        // Reply to a reply
        Comment nestedReply =
                new Comment("aman", "Same here!");

        // Build the comment tree
        mainComment.addReply(reply1);
        mainComment.addReply(reply2);

        reply2.addReply(nestedReply);

        // Display complete comment tree
        displayComments(mainComment, 0);
    }

    static void displayComments(Comment comment, int level) {

        // Indentation shows reply depth
        System.out.println(
                "  ".repeat(level)
                        + "@" + comment.username
                        + ": " + comment.text
        );

        // Recursively display child replies
        for (Comment reply : comment.replies) {
            displayComments(reply, level + 1);
        }
    }
}