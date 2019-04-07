package task1;

public class PlayingCard {
    private Rank rank;
    private Suit suit;

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public enum Rank {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE
    }

    public enum Suit {
        HEARTS,
        SPADES,
        DIAMONDS,
        CLUBS
    }

    public PlayingCard(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

}
