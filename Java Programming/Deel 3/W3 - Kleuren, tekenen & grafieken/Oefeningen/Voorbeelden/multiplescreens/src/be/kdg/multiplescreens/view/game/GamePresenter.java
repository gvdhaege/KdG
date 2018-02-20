package be.kdg.multiplescreens.view.game;

import be.kdg.multiplescreens.model.SimpleModel;
import be.kdg.multiplescreens.view.about.AboutPresenter;
import be.kdg.multiplescreens.view.about.AboutView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by vochtenh on 17/02/2016.
 */
public class GamePresenter {
    private GameView view;
    private SimpleModel model;

    public GamePresenter(SimpleModel model, GameView view) {
        this.view = view;
        this.model = model;
        addEventHandlers();
    }

    private void addEventHandlers() {
        view.getMiAbout().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AboutView aboutView = new AboutView();
                AboutPresenter aboutPresenter = new AboutPresenter(model,aboutView);
                Stage aboutStage = new Stage();
                aboutStage.initOwner(view.getScene().getWindow());
                aboutStage.initModality(Modality.APPLICATION_MODAL);
                aboutStage.setScene(new Scene(aboutView));
                aboutStage.setX(view.getScene().getWindow().getX() + 100);
                aboutStage.setY(view.getScene().getWindow().getY() + 100);
                aboutStage.showAndWait();
            }
        });
    }
}
