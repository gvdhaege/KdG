package be.kdg.mastermind.view;

import be.kdg.mastermind.model.Combination;
import be.kdg.mastermind.model.Mastermind;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 * Created by vochtenh on 16/02/2016.
 */
public class MastermindPresenter {
    private Mastermind model;
    private MastermindView view;
    public MastermindPresenter(Mastermind model, MastermindView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
    }

    private void addEventHandlers() {
        Button[][] buttons = view.getButtons();
        for (int i = 0; i < Mastermind.MAX_NUMBER_OF_GUESSES; i++) {
            for (int j = 0; j < Combination.COMBINATION_SIZE; j++) {
                buttons[i][j].setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        //TODO: link to model somehow??
                        Button target = (Button) event.getTarget();
                        target.setStyle("-fx-background-color: red");
                    }
                });
            }
        }
    }
}
