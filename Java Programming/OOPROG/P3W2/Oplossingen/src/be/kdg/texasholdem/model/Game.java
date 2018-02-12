package be.kdg.texasholdem.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://en.wikipedia.org/wiki/Texas_hold_%27em
 */
public class Game {
    public enum BettingRound {
        PRE_FLOP, FLOP, TURN, RIVER
    }

    private BettingRound bettingRound;

    private Card[] flop;
    private Card turn;
    private Card river;

    private final Deck deck;

    private final Player player;

    public Game() {
        this.flop = new Card[3];
        this.deck = new Deck();
        this.player = new Player();

        this.setBettingRound(BettingRound.PRE_FLOP);
    }

    public void nextBettingRound() {
        switch (this.bettingRound) {
            case PRE_FLOP:
                this.setBettingRound(BettingRound.FLOP);
                break;
            case FLOP:
                this.setBettingRound(BettingRound.TURN);
                break;
            case TURN:
                this.setBettingRound(BettingRound.RIVER);
                break;
            default:
                // TODO: exception
        }
    }

    private void setBettingRound(BettingRound bettingRound) {
        this.bettingRound = bettingRound;

        switch (bettingRound) {
            case PRE_FLOP:
                this.player.dealCards(this.deck.getNext(), this.deck.getNext());
                break;
            case FLOP:
                for (int i = 0; i < this.flop.length; i++) {
                    this.flop[i] = this.deck.getNext();
                }
                break;
            case TURN:
                this.turn = this.deck.getNext();
                break;
            case RIVER:
                this.river = this.deck.getNext();
                break;
        }
    }

    public void restart() {
        switch (this.bettingRound) {
            case RIVER:
                this.deck.addCards(this.river);
                this.river = null;
            case TURN:
                this.deck.addCards(this.turn);
                this.turn = null;
            case FLOP:
                this.deck.addCards(this.flop);
                Arrays.fill(this.flop, null);
            case PRE_FLOP:
                this.deck.addCards(this.player.removeCards());
        }

        this.deck.shuffle();

        this.setBettingRound(BettingRound.PRE_FLOP);
    }

    public List<Card> getFlop() {
        return Collections.unmodifiableList(Arrays.asList(this.flop));
    }

    public Card getTurn() {
        return turn;
    }

    public Card getRiver() {
        return river;
    }

    public Player getPlayer() {
        return this.player;
    }

    public BettingRound getBettingRound() {
        return bettingRound;
    }
}
