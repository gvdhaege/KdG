package be.kdg.resize.view;

import javafx.geometry.Dimension2D;

public class ResizePresenter {
    private final ResizeView view;

    public ResizePresenter(ResizeView view) {
        this.view = view;
    }

    /*private void addEventHandlers() {
    }*/

    public void addWindowEventHandlers() {
        this.view.getScene().getWindow().setOnCloseRequest(event ->
            Settings.saveWindowSize(new Dimension2D(
                    this.view.getScene().getWindow().getWidth(),
                    this.view.getScene().getWindow().getHeight()
                    ))
        );

        final Dimension2D windowSize = Settings.loadWindowSize();
        this.view.getScene().getWindow().setWidth(windowSize.getWidth());
        this.view.getScene().getWindow().setHeight(windowSize.getHeight());
    }
}
