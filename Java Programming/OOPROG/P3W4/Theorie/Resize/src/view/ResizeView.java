package view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class ResizeView extends BorderPane {
    private Canvas canvas;

    public ResizeView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.canvas = new Canvas();
    }

    private void layoutNodes() {
        this.setCenter(this.canvas);
    }

    @Override
    public void resize(double width, double height) {
        super.resize(width, height);

        this.canvas.setWidth(width);
        this.canvas.setHeight(height);

        GraphicsContext gc = this.canvas.getGraphicsContext2D();
        gc.setFill(Color.rgb(
                (int) (width / 1400 * 256) % 256,
                (int) (height / 1000 * 256) % 256,
                0));
        gc.fillRect(0.0, 0.0, this.canvas.getWidth(), this.canvas.getHeight());
    }
}

