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

        this.view.getLoadMenuItem().setOnAction(event -> {
            final FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Openen");
            final File loadFile = fileChooser.showOpenDialog(this.view.getScene().getWindow());

            if (loadFile != null) {
                try (final DataInputStream is = new DataInputStream(new FileInputStream(loadFile))) {
                    final short fgR = is.readShort();
                    final short fgG = is.readShort();
                    final short fgB = is.readShort();
                    final short bgR = is.readShort();
                    final short bgG = is.readShort();
                    final short bgB = is.readShort();
                    final byte[] buffer = new byte[50];
                    final int length = is.read(buffer);
                    final String boodschap = new String(Base64.getDecoder().decode(new String(buffer, 0, length)));

                    this.view.getMessageField().setText(boodschap);
                    this.view.getForegroundPicker().setValue(Color.rgb(fgR, fgG, fgB));
                    this.view.getBackgroundPicker().setValue(Color.rgb(bgR, bgG, bgB));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                this.updateView();
            }
        });

        this.view.getSaveMenuItem().setOnAction(event -> {
            final FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Opslaan");
            final File saveFile = fileChooser.showSaveDialog(this.view.getScene().getWindow());

            if (saveFile != null) {
                try (final DataOutputStream os = new DataOutputStream(new FileOutputStream(saveFile))) {
                    final String boodschap = this.view.getMessageField().getText();
                    final Color voorgrond = this.view.getForegroundPicker().getValue();
                    final Color achtergrond = this.view.getBackgroundPicker().getValue();

                    final short fgR = (short) (voorgrond.getRed() * 255.0);
                    final short fgG = (short) (voorgrond.getGreen() * 255.0);
                    final short fgB = (short) (voorgrond.getBlue() * 255.0);
                    final short bgR = (short) (achtergrond.getRed() * 255.0);
                    final short bgG = (short) (achtergrond.getGreen() * 255.0);
                    final short bgB = (short) (achtergrond.getBlue() * 255.0);

                    os.writeShort(fgR);
                    os.writeShort(fgG);
                    os.writeShort(fgB);
                    os.writeShort(bgR);
                    os.writeShort(bgG);
                    os.writeShort(bgB);
                    os.write(Base64.getEncoder().encode(boodschap.getBytes()));
                } catch (IOException ex) {
                    ex.printStackTrace();
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
