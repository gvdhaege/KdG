package be.kdg.graphicstest.view;

import javafx.scene.control.Label;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * Created by vochtenh on 19/02/2016.
 */
public class EffectsPane1 extends BorderPane {
    public EffectsPane1() {
        Label text = new Label("Hallokes!");
        text.setFont(new Font(100));
        text.setEffect(new Reflection());
        setCenter(text);
        setPrefSize(500,500);
    }
}
