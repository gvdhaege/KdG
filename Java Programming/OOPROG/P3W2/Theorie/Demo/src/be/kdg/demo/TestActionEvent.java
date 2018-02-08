package be.kdg.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TestActionEvent extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();
        ToggleButton toggleButton = new ToggleButton("Aan/Uit");
        borderPane.setCenter(toggleButton);

        toggleButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(toggleButton.isSelected() ? "Aan" : "Uit");
            }
        });

        BorderPane.setMargin(toggleButton, new Insets(30.0));
        stage.setScene(new Scene(borderPane));
        stage.show();
    }
}
