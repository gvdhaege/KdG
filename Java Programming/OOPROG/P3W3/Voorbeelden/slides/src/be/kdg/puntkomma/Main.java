package be.kdg.puntkomma;

import be.kdg.puntkomma.view.PuntkommaView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        final PuntkommaView view = new PuntkommaView();
        primaryStage.setScene(new Scene(view));
        primaryStage.setTitle("Puntkomma");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
