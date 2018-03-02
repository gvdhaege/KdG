package be.kdg.mastermind.view.help;

import be.kdg.mastermind.model.MastermindException;
import be.kdg.mastermind.model.Rules;
import javafx.scene.control.Alert;

/**
 * Created by vochtenh on 14/03/2016.
 */
public class HelpPresenter {
    public HelpPresenter(HelpView view) {
        try {
            view.getTaRules().setText(new Rules().getRules());
        } catch (MastermindException me) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(me.getMessage());
            alert.showAndWait();
        }
    }
}
