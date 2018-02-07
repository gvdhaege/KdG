package View;

public class Presenter {
    private StadhuisPane view;

    public Presenter(StadhuisPane view) {
        this.view = view;

        addEventHandlers();
    }

    private void addEventHandlers() {
        view.getChoiceNormal().setOnAction(event -> view.resetEffect());
        view.getChoiceBlackWhite().setOnAction(event -> view.applyBlackAndWhiteEffect());
        view.getChoiceSepia().setOnAction(event -> view.applySepiaEffect());
    }
}
