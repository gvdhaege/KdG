package be.kdg.mastermind;

import be.kdg.mastermind.model.Mastermind;
import be.kdg.mastermind.view.MastermindPresenter;
import be.kdg.mastermind.view.MastermindView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by vochtenh on 29/12/2015.
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Mastermind model = new Mastermind();
        MastermindView view = new MastermindView();
        MastermindPresenter presenter = new MastermindPresenter(model, view);
        Scene scene = new Scene(view);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mastermind");
        primaryStage.show();
    }
}
