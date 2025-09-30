public class Rating {
    private int stars;
    private Comment review;
    
    public Rating(int stars, Comment review) {
        if (!(stars >= 1 && stars <= 5)) throw new IllegalArgumentException("Invalid stars.");
        this.stars = stars;
        this.review = review;
    }

    public int getStars() {
        return stars;
    }

    public Comment getReview() {
        return review;
    }

    @Override
    public String toString() {
        return "\u2605".repeat(getStars()) + "\u2606".repeat(5-getStars());
    }
}