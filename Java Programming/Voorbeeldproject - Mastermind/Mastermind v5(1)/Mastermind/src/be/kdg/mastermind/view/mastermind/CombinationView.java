package be.kdg.mastermind.view.mastermind;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Toont een Combination
 */
public class CombinationView extends GridPane {
    public static final Color DEFAULT_COLOR = Color.LIGHTGRAY;
    public static final int DEFAULT_SIZE = 4;
    private Circle[] circles;
    public CombinationView() {
        circles = new Circle[DEFAULT_SIZE];
        layoutNodes();
        setHgap(10);
    }

    void layoutNodes() {
        for (int kolom = 0;kolom < circles.length; kolom++){
        }
    }

    Circle[] getCircles() {
        return circles;
    }
}
