package be.kdg.mastermind;

import be.kdg.mastermind.model.Mastermind;
import be.kdg.mastermind.model.MastermindException;
import be.kdg.mastermind.view.mastermind.MastermindPresenter;
import be.kdg.mastermind.view.mastermind.MastermindView;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * Opstartklasse van de applicatie.
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Mastermind model = new Mastermind();
        MastermindView view = new MastermindView(model.getCombinationSize(), model.getMaxNumberOfGuesses());
        MastermindPresenter presenter = new MastermindPresenter(model, view);
        Scene scene = new Scene(view);
        scene.getStylesheets().add("stylesheets/style.css");
        primaryStage.setScene(scene);
        presenter.addWindowEventHandlers();
        primaryStage.setTitle("Mastermind");
        primaryStage.show();

    }
}
