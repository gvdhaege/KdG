package be.kdg.dobbelen.view;

import be.kdg.dobbelen.model.Dobbelen;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

public class Presenter {
    private static final String IMAGE_PACKAGE = "be/kdg/dobbelen/view/images";

    private Dobbelen model;
    private DobbelenView view;

    public Presenter(Dobbelen model, DobbelenView view) {
        this.model = model;
        this.view = view;
        updateView();
        addEventHandlers();
    }

    private void updateView() {
        view.getDie1().setImage(new Image(IMAGE_PACKAGE + "/die" + model.getAantalOgen1() + ".png"));
        view.getDie2().setImage(new Image(IMAGE_PACKAGE + "/die" + model.getAantalOgen2() + ".png"));
    }

    private void addEventHandlers() {
        view.getBtnThrow().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                model.werp();
                updateView();
            }
        });
    }

}
