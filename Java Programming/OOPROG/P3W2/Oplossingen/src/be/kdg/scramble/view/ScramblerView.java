package be.kdg.scramble.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class ScramblerView extends BorderPane {
    private TextField tfTekst;
    private Button btnScramble;

    public ScramblerView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.tfTekst = new TextField();
        this.btnScramble = new Button("Scramble!");
    }

    private void layoutNodes() {
        setTop(tfTekst);
        setBottom(btnScramble);
        setPadding(new Insets(10));
        BorderPane.setAlignment(btnScramble, Pos.CENTER);
        BorderPane.setMargin(tfTekst, new Insets(10));
    }

    TextField getTfTekst() {
        return tfTekst;
    }

    Button getBtnScramble() {
        return btnScramble;
    }
}
