package be.kdg.mastermind.view.mastermind;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by vochtenh on 24/02/2016.
 */
public class Tester extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(new GameboardView(4,9)));
        primaryStage.show();
    }
}
