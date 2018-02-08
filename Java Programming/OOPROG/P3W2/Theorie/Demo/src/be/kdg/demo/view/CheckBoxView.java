package be.kdg.demo.view;

import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;

public class CheckBoxView extends BorderPane {
    private CheckBox akkoord;
    public CheckBoxView() {
        this.initialiseNodes();
        this.layoutNodes();
    }
    private void initialiseNodes() {
        this.akkoord = new CheckBox("Ik ga akkoord met de algemene voorwaarden.");
    }
    private void layoutNodes() {
        this.setCenter(this.akkoord);
        BorderPane.setMargin(this.akkoord, new Insets(15.0));
    }
}
