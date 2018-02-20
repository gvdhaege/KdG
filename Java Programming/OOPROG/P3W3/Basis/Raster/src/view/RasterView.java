package view;

import javafx.geometry.Insets;
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
    private Label rowLabel;
    private Label colLabel;
    private Slider rowSlider;
    private Slider colSlider;

    public RasterView() {
        this.initializeNodes();
        this.layoutNodes();
    }

    Slider getRowSlider() {
        return rowSlider;
    }

    Slider getColSlider() {
        return colSlider;
    }

    private void initializeNodes() {
        this.canvas = new Canvas(640, 400);
        this.rowLabel = new Label("Rijen");
        this.colLabel = new Label("Kolommen");
        this.rowSlider = new Slider(1.0, 100.0, 10.0);
        this.rowSlider.setShowTickLabels(true);
        this.rowSlider.setShowTickMarks(true);
        this.colSlider = new Slider(1.0, 100.0, 10.0);
        this.colSlider.setShowTickLabels(true);
        this.colSlider.setShowTickMarks(true);
    }

    private void layoutNodes() {
        final VBox sliders = new VBox();
        sliders.setAlignment(Pos.BOTTOM_LEFT);
        sliders.setPadding(new Insets(10, 10, 10, 10));
        sliders.getChildren().add(this.rowLabel);
        sliders.getChildren().add(this.rowSlider);
        sliders.getChildren().add(this.colLabel);
        sliders.getChildren().add(this.colSlider);

        this.setBottom(sliders);
        this.setCenter(this.canvas);
    }

    void drawRaster(int rows, int columns) {
        final GraphicsContext gc = this.canvas.getGraphicsContext2D();

        final double canvasHeight = this.canvas.getHeight();
        final double canvasWidth = this.canvas.getWidth();
        final double rowHeight = canvasHeight / rows;
        final double columnWidth = canvasWidth / columns;

        gc.setFill(Color.WHITE);
        gc.fillRect(0.0, 0.0, canvasWidth, canvasHeight);

        for (int row = 1; row < rows; row++) {
            gc.strokeLine(0.0, rowHeight * row, canvasWidth, rowHeight * row);
        }

        for (int col = 1; col < columns; col++) {
            gc.strokeLine(columnWidth * col, 0.0, columnWidth * col, canvasHeight);
        }
    }
}
