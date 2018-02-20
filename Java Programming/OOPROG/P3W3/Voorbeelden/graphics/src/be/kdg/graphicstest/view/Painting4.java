package be.kdg.graphicstest.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;

/**
 * Created by vochtenh on 19/02/2016.
 */
public class Painting4 extends BorderPane {
    private Canvas canvas;

    public Painting4() {
        setPrefSize(320, 320);
        canvas = new Canvas(320, 320);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(new ImagePattern(new Image("newyork.jpg")));
        double xpoints[] = {10, 85, 110, 135, 210, 160,
                170, 110, 50, 60};
        double ypoints[] = {85, 75, 10, 75, 85, 125,
                190, 150, 190, 125};
        gc.fillPolygon(xpoints, ypoints, xpoints.length);
        gc.beginPath();
        gc.moveTo(200,200);
        gc.lineTo(300,200);
        gc.lineTo(300,300);
        gc.lineTo(200,300);
        gc.closePath();
        gc.fill();
        gc.strokeText("Holapola",100,100);
        gc.clearRect(40,40,300,300);
        setCenter(canvas);
    }
}
