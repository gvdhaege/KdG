package be.kdg.pensioen.view;

import be.kdg.pensioen.model.Pensioen;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class PensioenPresenter {
    private Pensioen model;
    private PensioenView view;

    public PensioenPresenter(Pensioen model, PensioenView view) {
        this.model = model;
        this.view = view;
       // updateView(); // --> Er is nog niets om te laten zien!
        addEventHandlers();
    }

    private void updateView() {
       // TODO
    }

    private void addEventHandlers() {
        // TODO

    }

    public PensioenView getView() {
        return view;
    }
}
