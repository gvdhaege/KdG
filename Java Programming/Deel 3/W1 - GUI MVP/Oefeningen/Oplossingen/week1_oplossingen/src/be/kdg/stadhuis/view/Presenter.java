package be.kdg.stadhuis.view;

public class Presenter {
    private final StadhuisPane view;

    public Presenter(StadhuisPane view) {
        this.view = view;

        this.addEventHandlers();
    }

    private void addEventHandlers() {
        this.view.getNormal().setOnAction(event -> Presenter.this.view.resetEffect());
        this.view.getBlackAndWhite().setOnAction(event -> Presenter.this.view.applyBlackAndWhiteEffect());
        this.view.getSepia().setOnAction(event -> Presenter.this.view.applySepiaEffect());
    }
}
