package be.kdg.demo.view;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class TextFieldView extends BorderPane {
    private Label label;
    private TextField naam;
    public TextFieldView() {
        this.initialiseNodes();
        this.layoutNodes();
    }
    private void initialiseNodes() {
        this.label = new Label("Naam:");
        this.naam = new TextField();
    }
    private void layoutNodes() {
        BorderPane.setMargin(this.label, new Insets(10));
        BorderPane.setMargin(this.naam, new Insets(10));
        this.setLeft(this.label);
        this.setRight(this.naam);
    }
}
