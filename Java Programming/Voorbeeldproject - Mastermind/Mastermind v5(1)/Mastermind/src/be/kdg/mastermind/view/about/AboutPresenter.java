package be.kdg.mastermind.view.about;

import be.kdg.mastermind.model.Mastermind;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * Created by vochtenh on 17/02/2016.
 */
public class AboutPresenter {
    public AboutPresenter(Mastermind model, AboutView view) {
        view.getBtnOk().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.getScene().getWindow().hide();
            }
        });
    }
}
