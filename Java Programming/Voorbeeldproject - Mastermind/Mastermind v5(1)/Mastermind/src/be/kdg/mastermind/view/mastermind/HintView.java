package be.kdg.mastermind.view.mastermind;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Toont een hint
 */
public class HintView extends GridPane {
    private Circle[] circles;
    public HintView(int combinationSize) {
        circles = new Circle[combinationSize];
        for (int i=0;i<combinationSize/2;i++){
            circles[i] = new Circle(5, Color.LIGHTGRAY);
            add(circles[i],i,0);
        }
        int teller = 0;
        for (int i=combinationSize/2;i<combinationSize;i++){
            circles[i] = new Circle(5, Color.LIGHTGRAY);
            add(circles[i],teller++,1);
        }
        setHgap(5);
        setVgap(5);
        //setGridLinesVisible(true);
    }

    Circle[] getCircles() {
        return circles;
    }
}
