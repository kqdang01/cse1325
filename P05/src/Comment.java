import java.util.ArrayList;

public class Comment {
    private String text;
    private Person author;
    private Comment inReplyTo;
    private ArrayList<Comment> replies;

    public Comment(String text, Person author, Comment inReplyTo) {
        if (text.equals("") || text == null || author == null) throw new IllegalArgumentException("Invalid text or author.");
        this.text = text;
        this.author = author;
        this.inReplyTo = inReplyTo;
        this.replies = new ArrayList<>();
    }

    public void addReply(String text, Person author) {
        if (text.equals("") || text == null || author == null) throw new IllegalArgumentException("Invalid text or author.");
        Comment comment = new Comment(text, author, this);
        replies.add(comment);
    }

    public int numReplies() {
        return replies.size();
    }

    public Comment getReply(int index) {
        return replies.get(index);
    }

    public Comment getInReplyTo() {
        return inReplyTo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Comment by " + author);
        if (inReplyTo != null) sb.append("in reply to " + inReplyTo.author);
        sb.append("\n");
        if (numReplies() > 0) {
            sb.append("Replies: ");
            for (int i = 0; i < numReplies(); ++i) {
                sb.append("(" + i + ") " + replies.get(i).author.getName() + "\t");
            }
        }
        sb.append("\n" + text);
        return sb.toString();
    }
}