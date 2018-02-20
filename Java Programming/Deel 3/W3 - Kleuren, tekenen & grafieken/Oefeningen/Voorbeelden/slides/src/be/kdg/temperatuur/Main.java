package be.kdg.temperatuur;

import be.kdg.temperatuur.view.TemperatuurView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

//
// http://www.meteo.be/meteo/view/nl/360955-Maandelijkse+normalen.html
//

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        final TemperatuurView view = new TemperatuurView();
        primaryStage.setScene(new Scene(view));
        primaryStage.setTitle("Temperatuur");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
