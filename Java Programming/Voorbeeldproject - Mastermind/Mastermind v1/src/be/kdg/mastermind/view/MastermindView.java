package be.kdg.mastermind.view;

import be.kdg.mastermind.model.Combination;
import be.kdg.mastermind.model.Mastermind;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 * Created by vochtenh on 16/02/2016.
 */
public class MastermindView extends BorderPane {
    private Button[][] buttons = new Button[Mastermind.MAX_NUMBER_OF_GUESSES][Combination.COMBINATION_SIZE];
    //TODO: hints tonen!
    //TODO: menu!
    //TODO: ...

    public MastermindView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        for (int i=0;i<Mastermind.MAX_NUMBER_OF_GUESSES;i++){
            for (int j=0;j<Combination.COMBINATION_SIZE;j++){
                buttons[i][j] = new Button();
                buttons[i][j].setPrefSize(50,50);
            }
        }
    }

    private void layoutNodes() {
        GridPane gridPane = new GridPane();
        for (int i = 0; i < Mastermind.MAX_NUMBER_OF_GUESSES; i++) {
            for (int j = 0; j < Combination.COMBINATION_SIZE; j++) {
                gridPane.add(buttons[i][j],j,i);
            }
        }
        setCenter(gridPane);
        //TODO: knoppen resizen nog niet mee!
    }

    Button[][] getButtons() {
        return buttons;
    }
}
