package be.kdg.boodschap;

import be.kdg.boodschap.view.BoodschapPresenter;
import be.kdg.boodschap.view.BoodschapView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        final BoodschapView view = new BoodschapView();
        new BoodschapPresenter(view);
        primaryStage.setScene(new Scene(view));
        primaryStage.setTitle("Boodschap");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
