package be.kdg.texasholdem.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>(52);

        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                this.cards.add(new Card(suit, rank));
            }
        }

        this.shuffle();
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card getNext() {
        if (this.cards.isEmpty()) {
            throw new IllegalStateException("Deck is empty!");
        }
        else {
            return this.cards.remove(0);
        }
    }

    public void addCards(Card... cards) {
        for (Card card : cards) {
            this.cards.add(card);
        }
    }
}
