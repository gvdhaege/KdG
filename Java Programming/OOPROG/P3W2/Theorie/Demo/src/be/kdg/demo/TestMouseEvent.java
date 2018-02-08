package be.kdg.demo;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TestMouseEvent extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();
        borderPane.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.printf("X: %3.0f, Y: %3.0f%n", event.getX(), event.getY());
            }
        });
        stage.setScene(new Scene(borderPane));
        stage.setTitle("Coördinaten");
        stage.show();
    }
}
