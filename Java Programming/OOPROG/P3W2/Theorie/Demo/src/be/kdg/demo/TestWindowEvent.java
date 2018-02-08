package be.kdg.demo;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.util.Optional;

public class TestWindowEvent extends Application {
    @Override
    public void start(Stage stage) {
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                final Alert benJeZeker = new Alert(Alert.AlertType.CONFIRMATION);
                benJeZeker.setHeaderText("Je bent toch zeker?");
                benJeZeker.setContentText("Ben je zeker dat je wil afsluiten?");
                Optional<ButtonType> keuze = benJeZeker.showAndWait();
                if (keuze.get().getText().equalsIgnoreCase("CANCEL")) {
                    event.consume();
                }
            }
        });
        stage.setTitle("Bevestigen");
        stage.setScene(new Scene(new BorderPane()));
        stage.show();
    }
}
