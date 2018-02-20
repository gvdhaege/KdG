package be.kdg.graphicstest.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

/**
 * Created by vochtenh on 19/02/2016.
 */
public class Painting2 extends BorderPane {
    private Canvas canvas;

    public Painting2() {
        setPrefSize(500, 500);
        canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.web("#2FEEA5"));
        gc.strokeLine(10, 10, 490, 490);
        gc.setStroke(Color.hsb(0.8, 0.3, 0.9));
        gc.strokeOval(100, 100, 50, 50);
        gc.setFill(Color.rgb(30, 230, 80, 0.9));
        gc.fillOval(200, 200, 180, 80);
        gc.setFill(Color.BURLYWOOD);
        gc.fillRect(10, 300, 100, 100);
        setCenter(canvas);
    }
}
