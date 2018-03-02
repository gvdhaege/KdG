package be.kdg.mastermind.view.help;

import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

/**
 * Created by vochtenh on 14/03/2016.
 */
public class HelpView extends BorderPane {
    private TextArea taRules = new TextArea();

    public HelpView() {
        setCenter(taRules);
        taRules.setPrefWidth(Double.MAX_VALUE);
        taRules.setPrefHeight(Double.MAX_VALUE);
        taRules.setWrapText(true);
        taRules.setFont(Font.font("Arial",12));
        taRules.setEditable(false);
        setPrefWidth(400);
        setPrefHeight(300);
    }

    TextArea getTaRules() {
        return taRules;
    }
}
