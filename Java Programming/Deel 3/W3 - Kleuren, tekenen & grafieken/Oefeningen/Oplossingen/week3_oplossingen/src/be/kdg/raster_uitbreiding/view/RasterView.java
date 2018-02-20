package be.kdg.raster_uitbreiding.view;

import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class RasterView extends BorderPane {
    private Canvas canvas;
    private Label rowsLabel;
    private Slider rowsSlider;
    private Label columnsLabel;
    private Slider columnsSlider;

    public RasterView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.rowsLabel = new Label("Rijen");
        this.rowsSlider = new Slider(2.0, 100.0, 10.0);
        this.rowsSlider.setShowTickMarks(true);
        this.rowsSlider.setShowTickLabels(true);
        this.columnsLabel = new Label("Kolommen");
        this.columnsSlider = new Slider(2.0, 100.0, 10.0);
        this.columnsSlider.setShowTickMarks(true);
        this.columnsSlider.setShowTickLabels(true);
        this.canvas = new Canvas(640.0, 400.0);
    }

    private void layoutNodes() {
        final VBox controls = new VBox();
        controls.setAlignment(Pos.CENTER_LEFT);
        controls.getChildren().add(this.rowsLabel);
        controls.getChildren().add(this.rowsSlider);
        controls.getChildren().add(this.columnsLabel);
        controls.getChildren().add(this.columnsSlider);

        this.setCenter(this.canvas);
        this.setBottom(controls);
    }

    Slider getRowsSlider() {
        return rowsSlider;
    }

    Slider getColumnsSlider() {
        return columnsSlider;
    }

    void drawRaster(int rows, int columns) {
        final GraphicsContext gc = this.canvas.getGraphicsContext2D();

        final double totalWidth = this.canvas.getWidth();
        final double totalHeight = this.canvas.getHeight();
        final double rowHeight = totalHeight / rows;
        final double columnWidth = totalWidth / columns;

        // De achtergrond
        gc.setFill(Color.WHITE);
        gc.fillRect(0.0, 0.0, totalWidth, totalHeight);

        // De rijen tekenen
        for (int r = 1; r < rows; r++) {
            gc.strokeLine(0.0, rowHeight * r, totalWidth, rowHeight * r);
        }

        // De kolommen tekenen
        for (int c = 1; c < columns; c++) {
            gc.strokeLine(columnWidth * c, 0.0, columnWidth * c, totalHeight);
        }
    }
}
