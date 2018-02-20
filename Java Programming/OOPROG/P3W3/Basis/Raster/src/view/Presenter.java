package view;

import model.RasterModel;

public class Presenter {
    private final RasterModel model;
    private final RasterView view;

    public Presenter(RasterModel model, RasterView view) {
        this.model = model;
        this.view = view;

        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {
        this.view.getRowSlider().setOnMouseDragged(event -> {
            this.model.setRows((int) this.view.getRowSlider().getValue());
            this.updateView();
        });
        this.view.getColSlider().setOnMouseDragged(event -> {
            this.model.setColums((int) this.view.getColSlider().getValue());
            this.updateView();
        });
    }

    private void updateView() {
        this.view.drawRaster(this.model.getRows(), this.model.getColums());
    }
}
