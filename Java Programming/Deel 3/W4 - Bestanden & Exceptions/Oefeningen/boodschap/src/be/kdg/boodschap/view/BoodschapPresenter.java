package be.kdg.boodschap.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class BoodschapPresenter {
    private final BoodschapView view;

    public BoodschapPresenter(BoodschapView view) {
        this.view = view;

        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {
        final EventHandler<ActionEvent> eventHandler = event -> this.updateView();
        this.view.getForegroundPicker().setOnAction(eventHandler);
        this.view.getBackgroundPicker().setOnAction(eventHandler);

        this.view.getMessageField().textProperty().addListener((observable, oldValue, newValue) -> this.updateView());

        this.view.getSaveMenuItem().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Hier aanvullen...
            }
        });

        this.view.getLoadMenuItem().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Hier aanvullen...
            }
        });
    }

    private void updateView() {
        final String boodschap = this.view.getMessageField().getText();
        final Color voorgrond = this.view.getForegroundPicker().getValue();
        final Color achtergrond = this.view.getBackgroundPicker().getValue();
        this.view.toonBoodschap(boodschap, voorgrond, achtergrond);
    }
}
