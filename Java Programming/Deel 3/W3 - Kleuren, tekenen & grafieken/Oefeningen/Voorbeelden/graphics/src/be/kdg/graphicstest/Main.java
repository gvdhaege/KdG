package be.kdg.graphicstest;

import be.kdg.graphicstest.view.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by vochtenh on 18/02/2016.
 */
public class Main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(new EffectsPane1()));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
