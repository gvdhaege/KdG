package be.kdg.mastermind.view.mastermind;

import be.kdg.mastermind.model.Combination;
import be.kdg.mastermind.model.CombinationColor;
import javafx.animation.ScaleTransition;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 * Deze presenter bevat oa de logica om ervoor te zorgen dat klikken op een cirkel de kleur doet switchen.
 *
 */
public class CombinationPresenter {
    private CombinationView view;
    private Combination model;
    private boolean isEnabled = false;

    public CombinationPresenter(CombinationView view) {
        this(null, view);
    }

    public CombinationPresenter(Combination combination, CombinationView view) {
        this.view = view;
        this.model = combination;
        updateView();
        addEventHandlers();
    }

    private void updateView() {
        if (model != null) {
            for (int i = 0; i < model.COMBINATION_SIZE; i++) {
                if (model.getColor(i).equals(CombinationColor.BLUE)) {
                    view.getCircles()[i].setFill(Color.BLUE);
                } else if (model.getColor(i).equals(CombinationColor.RED)) {
                    view.getCircles()[i].setFill(Color.RED);
                } else if (model.getColor(i).equals(CombinationColor.GREEN)) {
                    view.getCircles()[i].setFill(Color.GREEN);
                } else if (model.getColor(i).equals(CombinationColor.YELLOW)) {
                    view.getCircles()[i].setFill(Color.YELLOW);
                }
            }
        }
        if (isEnabled) {
            view.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, BorderWidths.DEFAULT)));
        } else {
            view.setBorder(Border.EMPTY);
        }
    }

    public void setModel(Combination model) {
        this.model = model;
        updateView();
    }

    public Combination getCombination() {
        if (model == null) {
            CombinationColor[] colors = new CombinationColor[Combination.COMBINATION_SIZE];
            for (int i = 0; i < colors.length; i++) {
                if (view.getCircles()[i].getFill().equals(Color.RED)) {
                    colors[i] = CombinationColor.RED;
                } else if (view.getCircles()[i].getFill().equals(Color.BLUE)) {
                    colors[i] = CombinationColor.BLUE;
                } else if (view.getCircles()[i].getFill().equals(Color.YELLOW)) {
                    colors[i] = CombinationColor.YELLOW;
                } else if (view.getCircles()[i].getFill().equals(Color.GREEN)) {
                    colors[i] = CombinationColor.GREEN;
                } else {
                    //combination not ready, return null!
                    return null;
                }
            }
            model = new Combination(colors);
        }
        return model;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        updateView();
    }

    private void addEventHandlers() {
        for (Circle circle : view.getCircles()) {
            circle.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    if (!isEnabled) return;
                    Circle circle = (Circle) event.getSource();
                    rotateColor(circle);
                }
            });
        }
    }

    private void rotateColor(Circle circle) {
        if (circle.getFill().equals(CombinationView.DEFAULT_COLOR)) {
            circle.setFill(Color.RED);
        } else if (circle.getFill().equals(Color.RED)) {
            circle.setFill(Color.BLUE);
        } else if (circle.getFill().equals(Color.BLUE)) {
            circle.setFill(Color.GREEN);
        } else if (circle.getFill().equals(Color.GREEN)) {
            circle.setFill(Color.YELLOW);
        } else if (circle.getFill().equals(Color.YELLOW)) {
            circle.setFill(Color.RED);
        }
        ScaleTransition st = new ScaleTransition(Duration.millis(100), circle);
        st.setFromX(1);
        st.setToX(1.1);
        st.setFromY(1);
        st.setToY(1.1);
        st.setAutoReverse(true);
        st.setCycleCount(2);
        st.play();
    }

    public void resetView() {
        for (int i = 0; i < model.COMBINATION_SIZE; i++) {
            view.getCircles()[i].setFill(CombinationView.DEFAULT_COLOR);
        }
    }
}
