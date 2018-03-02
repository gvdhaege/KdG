package be.kdg.boodschap.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;

import java.io.*;
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
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Opslaan");
                File saveFile = fileChooser.showSaveDialog(view.getScene().getWindow());

                if (saveFile != null) {
                    try (DataOutputStream os = new DataOutputStream(new FileOutputStream(saveFile))) {
                        final String boodschap = view.getMessageField().getText();
                        final Color voorgrond = view.getForegroundPicker().getValue();
                        final Color achtergrond = view.getBackgroundPicker().getValue();

                        final short voorgrondRed = (short) (voorgrond.getRed() * 255);
                        final short voorgrondGreen = (short) (voorgrond.getGreen() * 255);
                        final short voorgrondBlue = (short) (voorgrond.getBlue() * 255);
                        final short achtergrondRed = (short) (achtergrond.getRed() * 255);
                        final short achtergrondGreen = (short) (achtergrond.getGreen() * 255);
                        final short achtergrondBlue = (short) (achtergrond.getBlue() * 255);

                        os.writeShort(voorgrondRed);
                        os.writeShort(voorgrondGreen);
                        os.writeShort(voorgrondBlue);
                        os.writeShort(achtergrondRed);
                        os.writeShort(achtergrondGreen);
                        os.writeShort(achtergrondBlue);
                        os.write(Base64.getEncoder().encode(boodschap.getBytes()));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        this.view.getLoadMenuItem().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Openen");
                File loadFile = fileChooser.showOpenDialog(view.getScene().getWindow());

                if (loadFile != null) {
                    try (DataInputStream is = new DataInputStream(new FileInputStream(loadFile))) {
                        final short fgR = is.readShort();
                        final short fgG = is.readShort();
                        final short fgB = is.readShort();
                        final short bgR = is.readShort();
                        final short bgG = is.readShort();
                        final short bgB = is.readShort();

                        final byte[] buffer = new byte[50];
                        final int lengte = is.read(buffer);
                        final String boodschap = new String(Base64.getDecoder().decode(new String(buffer, 0, lengte)));

                        view.getMessageField().setText(boodschap);
                        view.getForegroundPicker().setValue(Color.rgb(fgR, fgG, fgB));
                        view.getBackgroundPicker().setValue(Color.rgb(bgR, bgG, bgB));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    updateView();
                }
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
