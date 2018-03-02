package be.kdg.mastermind.view.settings;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 * Created by vochtenh on 14/03/2016.
 */
public class SettingsView extends VBox {
    private Spinner spNrOfGuesses;
    private CheckBox cbDuplicateColorsAllowed;
    private Button btnSave;


    public SettingsView() {
        spNrOfGuesses = new Spinner(5,10,5);
        cbDuplicateColorsAllowed = new CheckBox("Duplicate colors allowed");
        btnSave = new Button("Save");
        HBox guesses = new HBox(new Label("Number of guesses:"),spNrOfGuesses);
        guesses.setSpacing(10);
        getChildren().addAll(guesses, cbDuplicateColorsAllowed, btnSave);
        setSpacing(10);
        setPadding(new Insets(10));
    }

    Button getBtnSave() {
        return btnSave;
    }

    Spinner getSpNrOfGuesses() {
        return spNrOfGuesses;
    }

    CheckBox getCbDuplicateColorsAllowed() {
        return cbDuplicateColorsAllowed;
    }
}
