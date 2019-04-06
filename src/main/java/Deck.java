import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<PlayingCard> playingCardsList;

    public List<PlayingCard> createDeck() {
        List<PlayingCard> playingCardsList = new ArrayList<PlayingCard>();

        for (PlayingCard.Rank rank : PlayingCard.Rank.values()) {
            for (PlayingCard.Suit suit : PlayingCard.Suit.values()) {
                playingCardsList.add(new PlayingCard(rank, suit));
            }
        }
        return playingCardsList;
    }
}
