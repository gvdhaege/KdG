package be.kdg.graphicstest.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Font;

/**
 * Created by vochtenh on 19/02/2016.
 */
public class Painting3 extends BorderPane {
    private Canvas canvas;

    public Painting3() {
        setPrefSize(500, 500);
        canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.web("#2FEEA5"));
        gc.setLineWidth(10);
        gc.setLineDashes(15);
        gc.strokeLine(10, 10, 200, 490);
        gc.setStroke(Color.hsb(0.8, 0.3, 0.9));
        gc.strokeOval(100, 50, 150, 150);
        gc.setFill(new ImagePattern(new Image("newyork.jpg")));
        gc.fillOval(200, 200, 300, 180);
        gc.setFill(Color.BURLYWOOD);
        gc.rotate(30);
        gc.setFont(new Font(100));
        gc.fillText("Holapola", 150, 300);
        //gc.applyEffect(new DropShadow());
        setCenter(canvas);
    }
}
