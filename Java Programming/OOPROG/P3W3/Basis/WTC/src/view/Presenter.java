package view;

public class Presenter {
    private WTCView view;

    public Presenter(WTCView view) {
        this.view = view;
        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {
        this.view.getSlider().setOnMouseDragged(event -> updateView());
    }

    private void updateView() {
        this.view.updateCanvas(this.view.getSlider().getValue());
    }
}
