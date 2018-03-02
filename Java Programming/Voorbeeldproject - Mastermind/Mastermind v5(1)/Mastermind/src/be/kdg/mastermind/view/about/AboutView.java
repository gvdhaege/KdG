package be.kdg.mastermind.view.about;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

/**
 * Created by vochtenh on 17/02/2016.
 */
public class AboutView extends BorderPane {
    private Button btnOk;
    public AboutView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        btnOk = new Button("Ok");
        btnOk.setPrefWidth(60);
    }

    private void layoutNodes() {
        setCenter(new Label("Deze applicatie is geschreven door Karen Damen."));
        setPadding(new Insets(10));
        BorderPane.setAlignment(btnOk, Pos.CENTER_RIGHT);
        BorderPane.setMargin(btnOk, new Insets(10, 0, 0, 0));
        setBottom(btnOk);
    }

    Button getBtnOk() {
        return btnOk;
    }
}
