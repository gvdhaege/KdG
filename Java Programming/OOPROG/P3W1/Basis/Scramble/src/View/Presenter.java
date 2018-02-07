package View;

import Model.Scrambler;

public class Presenter {
    private Scrambler model;
    private ScramblerView view;

    public Presenter(Scrambler model, ScramblerView view) {
        this.model = model;
        this.view = view;

        handleEvents();
    }

    private void handleEvents() {
        view.getScrambleButton().setOnAction(event -> updateView());
    }

    private void updateView() {
        model.setTekst(view.getInvoerVeld().getText());
        model.scramble();
        view.getInvoerVeld().setText(model.getTekst());
    }
}
