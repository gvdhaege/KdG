package model;

public class Game {
    private GamePhase gamePhase;

    public Game() {
        this.gamePhase = GamePhase.POW;
    }

    public void nextGamePhase() {
        this.gamePhase = GamePhase.values()[(this.gamePhase.ordinal() + 1) % GamePhase.values().length];
    }

    public GamePhase getGamePhase() {
        return gamePhase;
    }
}
