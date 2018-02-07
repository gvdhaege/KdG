package View;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class ScramblerView extends GridPane {
    private TextField invoerVeld;
    private Button scrambleButton;

    public ScramblerView() {
        initialisatieNodes();
        layoutNodes();
    }

    private void initialisatieNodes() {
        invoerVeld = new TextField();
        scrambleButton = new Button("Scramble");
    }

    private void layoutNodes() {
        this.add(invoerVeld, 0, 0);
        this.add(scrambleButton, 0, 1);
        GridPane.setHalignment(scrambleButton, HPos.CENTER);
        this.setVgap(10);
        this.setHgap(10);
        this.setPadding(new Insets(10, 10, 10, 10));
    }

    TextField getInvoerVeld() {
        return invoerVeld;
    }

    Button getScrambleButton() {
        return scrambleButton;
    }
}
