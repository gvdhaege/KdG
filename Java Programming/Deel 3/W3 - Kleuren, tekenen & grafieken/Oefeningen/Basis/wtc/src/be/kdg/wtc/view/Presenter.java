package be.kdg.wtc.view;

public class Presenter {
    private final WTCView view;

    public Presenter(WTCView view) {
        this.view = view;
        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {
        this.view.getSlider().setOnMouseDragged(event -> this.updateView());
    }

    private void updateView() {
        this.view.updateCanvas(this.view.getSlider().getValue());
    }
}
