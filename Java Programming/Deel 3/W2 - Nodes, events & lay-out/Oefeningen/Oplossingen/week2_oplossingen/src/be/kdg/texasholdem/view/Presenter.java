package be.kdg.texasholdem.view;

import be.kdg.texasholdem.model.Card;
import be.kdg.texasholdem.model.Game;

public class Presenter {
    private final Game model;
    private final GamePane gamePane;

    public Presenter(Game model, GamePane gamePane) {
        this.model = model;
        this.gamePane = gamePane;

        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {
        this.gamePane.getNextPhase().setOnAction(event -> {
            this.model.nextBettingRound();
            this.updateView();
        });

        this.gamePane.getRestart().setOnAction(event -> {
            this.model.restart();
            this.updateView();
        });
    }

    private void updateView() {
        switch (this.model.getBettingRound()) {
            case PRE_FLOP:
                this.gamePane.getBrValueLabel().setText("Pre-flop");

                for (int i = 0; i < 5; i++) {
                    this.gamePane.setBoardImage(i, CardImages.getCardBack());
                }
                this.gamePane.setPocketImage(0, CardImages.get(this.model.getPlayer().getFirstCard()));
                this.gamePane.setPocketImage(1, CardImages.get(this.model.getPlayer().getSecondCard()));
                this.gamePane.getNextPhase().setDisable(false);
                break;
            case FLOP:
                this.gamePane.getBrValueLabel().setText("Flop");

                // show 3 cards
                int i = 0;
                for (Card card : this.model.getFlop()) {
                    this.gamePane.setBoardImage(i++, CardImages.get(card));
                }
                break;
            case TURN:
                this.gamePane.getBrValueLabel().setText("Turn");

                this.gamePane.setBoardImage(3, CardImages.get(this.model.getTurn()));
                break;
            case RIVER:
                this.gamePane.getBrValueLabel().setText("River");

                this.gamePane.setBoardImage(4, CardImages.get(this.model.getRiver()));
                this.gamePane.getNextPhase().setDisable(true);
                break;
        }
    }
}
