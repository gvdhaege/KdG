package be.kdg;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Opdrachten P3W3");
        primaryStage.setScene(new Scene(new MainPane()));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
