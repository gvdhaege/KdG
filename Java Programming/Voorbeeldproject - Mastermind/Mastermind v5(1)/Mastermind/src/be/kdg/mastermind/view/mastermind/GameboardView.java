package be.kdg.mastermind.view.mastermind;

import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 * Toont een spelbord. Dit bestaat uit een lijst van CombinationViews en HintViews
 * De combinationviews worden vertegenwoordigd door hun presenter.
 */
public class GameboardView extends GridPane {
    private CombinationPresenter[] combinationPresenters;
    private HintView[] hintViews;

    public GameboardView(int combinationSize, int numberOfGuesses) {
        combinationPresenters = new CombinationPresenter[numberOfGuesses];
        hintViews = new HintView[numberOfGuesses];
        for (int i=0;i<numberOfGuesses;i++){
            CombinationView combinationView = new CombinationView();
            combinationPresenters[i] = new CombinationPresenter(combinationView);
            hintViews[i] = new HintView(combinationSize);
            HBox oneRow = new HBox(combinationView, hintViews[i]);
            oneRow.setSpacing(10);
            add(oneRow,0,i);
        }
        setVgap(10);
    }

    CombinationPresenter[] getCombinationPresenters() {
        return combinationPresenters;
    }

    HintView[] getHintViews() {
        return hintViews;
    }
}
