package be.kdg.multiplescreens.view.about;

import be.kdg.multiplescreens.model.SimpleModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * Created by vochtenh on 17/02/2016.
 */
public class AboutPresenter {
    public AboutPresenter(SimpleModel model, AboutView view) {
        view.getBtnOkeekes().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.getScene().getWindow().hide();
            }
        });
    }
}
