package be.kdg.dictee.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class DicteeView extends BorderPane {
    private Button btnLeesVoor;
    private TextArea textDictee;

    public DicteeView() {
        initialisatieNodes();
        layoutNodes();
    }

    private void layoutNodes() {
        this.setCenter(textDictee);
        this.setBottom(btnLeesVoor);
        BorderPane.setAlignment(btnLeesVoor, Pos.CENTER);
        BorderPane.setMargin(btnLeesVoor, new Insets(10, 10, 10, 10));
        btnLeesVoor.setOnAction(new LeesVoorHandler());
    }

    private void initialisatieNodes() {
        btnLeesVoor = new Button("Lees voor");
        textDictee = new TextArea("blablalblalbalbla");

    }

    public static class LeesVoorHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Ik heb geen zin!");
            alert.setTitle("Dictee");
            alert.showAndWait();
        }
    }

    Button getBtnLeesVoor() {
        return btnLeesVoor;
    }

    TextArea getTextDictee() {
        return textDictee;
    }
}
