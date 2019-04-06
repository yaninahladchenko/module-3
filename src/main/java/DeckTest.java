import java.util.List;

public class DeckTest {

    public static void main(String[] args) {
        Deck deck = new Deck();
        List<PlayingCard> playingCards = deck.createDeck();

        for(PlayingCard playingCard : playingCards) {
            System.out.println(String.format("Suit %s, Rank: %s", playingCard.getSuit(), playingCard.getRank()));
        }

        System.out.println(String.format("Cards in deck: %s", playingCards.size()));
    }
}
