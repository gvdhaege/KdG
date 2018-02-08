package be.kdg.demo.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;

public class ComboBoxView extends BorderPane {
    private ComboBox<String> cbNamen;
    public ComboBoxView() {
        this.initialiseNodes();
        this.layoutNodes();
    }
    private void initialiseNodes() {
        this.cbNamen = new ComboBox<>();
        ObservableList<String> namen =
                FXCollections.observableArrayList("Jos", "Frits", "Medard");
        this.cbNamen.setItems(namen);
        this.cbNamen.getSelectionModel().select(0);
    }
    private void layoutNodes() {
        this.setCenter(this.cbNamen);
        BorderPane.setMargin(this.cbNamen, new Insets(10));
    }
}
