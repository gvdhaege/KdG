package be.steven.mastermind.view;

import be.steven.mastermind.model.Combination;
import be.steven.mastermind.model.Mastermind;
import javafx.scene.control.Button;

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
                buttons[i][j].setOnAction(event -> {
                    Button target = (Button) event.getTarget();
                    target.setStyle("-fx-background-color: red");
                });
            }
        }
    }
}
