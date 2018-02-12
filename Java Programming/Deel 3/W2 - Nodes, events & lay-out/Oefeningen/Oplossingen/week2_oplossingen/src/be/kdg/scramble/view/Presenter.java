package be.kdg.scramble.view;

import be.kdg.scramble.model.Scrambler;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Presenter {
    private Scrambler model;
    private ScramblerView view;

    public Presenter(Scrambler model, ScramblerView view) {
        this.model = model;
        this.view = view;
        updateView();
        handleEvents();
    }

    private void updateView() {
        this.view.getTfTekst().setText(model.getTekst());
    }

    private void handleEvents() {
        this.view.getBtnScramble().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                model.setTekst(view.getTfTekst().getText());
                model.scramble();
                updateView();
            }
        });
    }
}
