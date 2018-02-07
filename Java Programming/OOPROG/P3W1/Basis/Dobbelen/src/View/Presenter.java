package View;

import Model.Dobbelen;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

public class Presenter {
    private Dobbelen model;
    private DobbelenView view;

    public Presenter(Dobbelen model, DobbelenView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        view.getButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                model.werp();
                updateView();
            }
        });
    }

    private void updateView() {
        view.getDobbelsteen1().setImage(new Image("View/images" + "/die" + model.getAantalOgen1() + ".png"));
        view.getDobbelsteen2().setImage(new Image("View/images" + "/die" + model.getAantalOgen2() + ".png"));
    }
}
