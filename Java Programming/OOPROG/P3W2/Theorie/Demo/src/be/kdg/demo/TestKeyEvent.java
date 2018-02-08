package be.kdg.demo;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TestKeyEvent extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();
        TextField textField = new TextField();
        borderPane.setCenter(textField);

        textField.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if ("aeiou".contains(event.getCharacter())) {
                    event.consume();
                }
            }
        });

        BorderPane.setMargin(textField, new Insets(30.0));
        stage.setScene(new Scene(borderPane));
        stage.setTitle("Klnkrs");
        stage.show();
    }
}
