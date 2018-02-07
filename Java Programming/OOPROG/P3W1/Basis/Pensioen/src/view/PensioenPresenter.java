package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;
import model.Pensioen;

public class PensioenPresenter {
    private Pensioen pensioen;
    private PensioenView pensioenView;

    public PensioenPresenter(Pensioen pensioen, PensioenView pensioenView) {
        this.pensioen = pensioen;
        this.pensioenView = pensioenView;
        addEventHandlers();
    }

    private void updateView(){
        pensioenView.getPensioenJaarField().setText(String.valueOf(pensioen.getPensioenJaar()));
    }

    private void addEventHandlers(){
        pensioenView.getBerekenButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                pensioen.setGeboorteJaar(Integer.parseInt(pensioenView.getGeboorteJaarField().getText()));
                updateView();
            }
        });
    }

    public PensioenView getView() {
        return pensioenView;
    }
}
