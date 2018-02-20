package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class WTCView extends VBox {
    private static final Image BEFORE = new Image("view/images/before.jpg");
    private static final Image AFTER = new Image("view/images/after.jpg");

    private static final double IMAGE_WIDTH = 900.0;
    private static final double IMAGE_HEIGHT = 595.0;

    private Canvas canvas;
    private Slider slider;

    public WTCView() {
        this.initializeNodes();
        this.layoutNodes();
    }

    private void initializeNodes() {
        this.canvas = new Canvas();
        this.slider = new Slider(0.0, 100.0, 50.0);
    }

    private void layoutNodes() {
        this.canvas.setWidth(IMAGE_WIDTH);
        this.canvas.setHeight(IMAGE_HEIGHT);
        this.slider.setMinWidth(IMAGE_WIDTH + 14.0);

        this.setSpacing(5.0);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(5.0, 5.0, 5.0, 5.0));

        this.getChildren().add(this.canvas);
        this.getChildren().add(this.slider);
    }

    Slider getSlider() {
        return slider;
    }

    void updateCanvas(double percentage) {
        final GraphicsContext gc = this.canvas.getGraphicsContext2D();

        final double drawWidth = (IMAGE_WIDTH * percentage) / 100;

        gc.drawImage(BEFORE,
                0.0, 0.0, drawWidth, IMAGE_HEIGHT,
                0.0, 0.0, drawWidth, IMAGE_HEIGHT);

        gc.drawImage(AFTER,
                drawWidth, 0.0, IMAGE_WIDTH, IMAGE_HEIGHT,
                drawWidth, 0.0, IMAGE_WIDTH, IMAGE_HEIGHT);

        gc.setStroke(Color.BLACK);
        gc.setLineWidth(3.0);
        gc.strokeLine(drawWidth, 0.0, drawWidth, IMAGE_HEIGHT);
    }
}
