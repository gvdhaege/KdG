package be.kdg.mastermind.view.settings;

import be.kdg.mastermind.model.Mastermind;
import be.kdg.mastermind.model.MastermindException;
import be.kdg.mastermind.model.Rules;
import be.kdg.mastermind.view.mastermind.MastermindPresenter;
import be.kdg.mastermind.view.mastermind.MastermindView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.input.RotateEvent;

/**
 * Created by vochtenh on 14/03/2016.
 */
public class SettingsPresenter {
    private Mastermind model;
    private SettingsView view;
    private boolean settingsChanged = false;

    public SettingsPresenter(Mastermind model, SettingsView view) {
        this.model = model;
        this.view = view;
        updateView();
        addEventHandlers();
    }

    private void updateView() {
        view.getCbDuplicateColorsAllowed().setSelected(model.getSettings().isDuplicateColorsAllowed());
        view.getSpNrOfGuesses().getValueFactory().setValue(model.getSettings().getNumberOfGuesses());
    }

    private void addEventHandlers() {
        view.getBtnSave().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert areYouSure = new Alert(Alert.AlertType.WARNING);
                areYouSure.setContentText("This wil restart the game, are you sure?");
                areYouSure.showAndWait();
                String result = areYouSure.getResult().getText();
                if (result.equals("OK")) {
                    boolean selected = view.getCbDuplicateColorsAllowed().isSelected();
                    model.getSettings().setDuplicateColorsAllowed(selected);
                    int value = (int) view.getSpNrOfGuesses().getValue();
                    model.getSettings().setNumberOfGuesses(value);
                    view.getScene().getWindow().hide();
                    settingsChanged = true;
                }
            }
        });
    }

    public boolean settingsChanged() {
        return settingsChanged;
    }
}
