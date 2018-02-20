package be.kdg.raster.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;

public class RasterView extends BorderPane {
    private Canvas canvas;

    public RasterView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.canvas = new Canvas(640.0, 400.0);
    }

    private void layoutNodes() {
        this.setCenter(this.canvas);
    }

    void drawRaster(int rows, int columns) {
        final GraphicsContext gc = this.canvas.getGraphicsContext2D();

        final double totalWidth = this.canvas.getWidth();
        final double totalHeight = this.canvas.getHeight();
        final double rowHeight = totalHeight / rows;
        final double columnWidth = totalWidth / columns;

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
