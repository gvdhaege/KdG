package be.kdg.raster_uitbreiding.view;

import be.kdg.raster_uitbreiding.model.RasterModel;

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
        this.view.getRowsSlider().setOnMouseDragged(event -> {
            this.model.setRows((int)this.view.getRowsSlider().getValue());
            this.updateView();
        });

        this.view.getColumnsSlider().setOnMouseDragged(event -> {
            this.model.setColumns((int)this.view.getColumnsSlider().getValue());
            this.updateView();
        });
    }

    private void updateView() {
        this.view.drawRaster(this.model.getRows(), this.model.getColumns());
    }
}
