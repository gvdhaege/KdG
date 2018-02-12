package be.kdg.texasholdem.model;

import java.util.Arrays;

public class Player {
    private final Card[] pocket;

    public Player() {
        this.pocket = new Card[2];
    }

    public void dealCards(Card cardOne, Card cardTwo) {
        if (cardOne == null || cardTwo == null) {
            throw new IllegalArgumentException("Card one = " + cardOne + "; Card two = " + cardTwo + ".");
        }
        else {
            this.pocket[0] = cardOne;
            this.pocket[1] = cardTwo;
        }
    }

    public Card getFirstCard() {
        return this.pocket[0];
    }

    public Card getSecondCard() {
        return this.pocket[1];
    }

    public Card[] removeCards() {
        Card[] retval = Arrays.copyOf(this.pocket, this.pocket.length);
        Arrays.fill(this.pocket, null);
        return retval;
    }
}
