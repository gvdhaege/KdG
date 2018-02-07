package view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;


public class PensioenView extends BorderPane {
    private TextField geboorteJaarField;
    private TextField pensioenJaarField;
    private Button berekenButton;

    public PensioenView() {
        initialisatieNodes();
        layoutnodes();
    }

    private void initialisatieNodes() {
        geboorteJaarField = new TextField();
        pensioenJaarField = new TextField();
        berekenButton = new Button("bereken");

        geboorteJaarField.setPrefColumnCount(4);
        pensioenJaarField.setPrefColumnCount(4);
        pensioenJaarField.setEditable(false);
    }

    private void layoutnodes() {
        this.setLeft(geboorteJaarField);
        this.setCenter(berekenButton);
        this.setRight(pensioenJaarField);

        BorderPane.setMargin(geboorteJaarField, new Insets(10, 10, 10, 10));
        BorderPane.setMargin(berekenButton, new Insets(10, 10, 10, 10));
        BorderPane.setMargin(pensioenJaarField, new Insets(10, 10, 10, 10));
    }

    Button getBerekenButton() {
        return berekenButton;
    }

    TextField getGeboorteJaarField() {
        return geboorteJaarField;
    }

    TextField getPensioenJaarField() {
        return pensioenJaarField;
    }
}
