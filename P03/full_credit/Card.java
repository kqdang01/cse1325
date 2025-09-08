public class Card {
    private String term;
    private String definition;

    public Card(String term, String definition) {
        if (term == null || term.equals("") || definition == null || definition.equals("")) {
            throw new IllegalArgumentException("invalid parameters.");
        }
        this.term = term;
        this.definition = definition;
    }
    @Override
    public String toString() {
        return this.definition;
    }

    public Boolean attempt(String response) {
        return (this.term.toLowerCase().equals(response.toLowerCase()));
    }

    public String getTerm() {
        return this.term;
    }
}