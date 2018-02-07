package be.kdg.scramble.view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * Created by vochtenh on 25/01/2016.
 */
public class ScramblerView extends GridPane {
    private TextField tfTekst;
    private Button btnScramble;

    public ScramblerView() {
        tfTekst = new TextField();
        btnScramble = new Button("Scramble!");
        add(tfTekst, 0, 1);
        add(btnScramble, 0, 2);
        setVgap(10);
        setPadding(new Insets(10));
        GridPane.setHalignment(btnScramble, HPos.CENTER);
    }

    TextField getTfTekst() {
        return tfTekst;
    }

    Button getBtnScramble() {
        return btnScramble;
    }
}
