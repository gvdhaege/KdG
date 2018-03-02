package be.kdg.boodschap.view;

import javafx.geometry.Bounds;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class BoodschapView extends BorderPane {
    private static final Font FONT = new Font("SansSerif Bold", 64.0);

    private Canvas canvas;
    private MenuItem load;
    private MenuItem save;
    private Label messageLabel;
    private TextField messageField;
    private Label foregroundLabel;
    private ColorPicker foregroundPicker;
    private Label backgroundLabel;
    private ColorPicker backgroundPicker;

    public BoodschapView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.canvas = new Canvas(800.0, 140.0);
        this.load = new MenuItem("Openen");
        this.save = new MenuItem("Opslaan");
        this.messageLabel = new Label("Boodschap:");
        this.messageField = new TextField();
        this.foregroundLabel = new Label("Voorgrond");
        this.foregroundPicker = new ColorPicker();
        this.foregroundPicker.setValue(Color.BLACK);
        this.backgroundLabel = new Label("Achtergrond");
        this.backgroundPicker = new ColorPicker();
    }

    private void layoutNodes() {
        final Menu fileMenu = new Menu("Bestand");
        fileMenu.getItems().add(this.load);
        fileMenu.getItems().add(this.save);
        final MenuBar menuBar = new MenuBar(fileMenu);

        final GridPane gridPane = new GridPane();
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(34.0);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(33.0);
        col2.setHalignment(HPos.RIGHT);
        ColumnConstraints col3 = new ColumnConstraints();
        col3.setPercentWidth(33.0);
        col3.setHalignment(HPos.RIGHT);
        gridPane.getColumnConstraints().addAll(col1, col2, col3);
        gridPane.setVgap(5.0);
        gridPane.setHgap(5.0);
        gridPane.setPadding(new Insets(5.0));
        gridPane.add(this.messageLabel, 0, 0);
        gridPane.add(this.messageField, 0, 1);
        gridPane.add(this.foregroundLabel, 1, 0);
        gridPane.add(this.foregroundPicker, 1, 1);
        gridPane.add(this.backgroundLabel, 2, 0);
        gridPane.add(this.backgroundPicker, 2, 1);

        this.setTop(menuBar);
        this.setCenter(this.canvas);
        this.setBottom(gridPane);
    }

    void toonBoodschap(String boodschap, Color foreground, Color background) {
        final GraphicsContext gc = this.canvas.getGraphicsContext2D();
        final double width = this.canvas.getWidth();
        final double height = this.canvas.getHeight();

        final Text text = new Text(boodschap);
        text.setFont(FONT);
        final Bounds bounds = text.getLayoutBounds();

        gc.setFont(FONT);

        gc.setFill(background);
        gc.fillRect(0.0, 0.0, width, height);

        gc.setFill(foreground);
        gc.fillText(boodschap, (width - bounds.getWidth()) / 2.0, 90.0);
    }

    TextField getMessageField() {
        return messageField;
    }

    ColorPicker getForegroundPicker() {
        return foregroundPicker;
    }

    ColorPicker getBackgroundPicker() {
        return backgroundPicker;
    }

    MenuItem getLoadMenuItem() {
        return load;
    }

    MenuItem getSaveMenuItem() {
        return save;
    }
}
