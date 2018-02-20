package be.kdg.graphicstest.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 * Created by vochtenh on 19/02/2016.
 */
public class Painting1 extends BorderPane {
    private Canvas canvas;

    public Painting1() {
        setPrefSize(500, 500);
        canvas = new Canvas(500, 500);
        GraphicsContext gc
                = canvas.getGraphicsContext2D();
        gc.strokeLine(10,10,490,490);
        gc.strokeOval(100,100,50,50);
        gc.fillOval(200,200,180,80);
        gc.fillRect(10,300,100,100);
        setCenter(canvas);
    }
}
