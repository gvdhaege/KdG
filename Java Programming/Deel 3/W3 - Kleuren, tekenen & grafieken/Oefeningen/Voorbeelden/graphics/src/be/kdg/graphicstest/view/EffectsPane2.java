package be.kdg.graphicstest.view;

import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * Created by vochtenh on 19/02/2016.
 */
public class EffectsPane2 extends BorderPane {
    public EffectsPane2() {
        Text text = new Text("Hallokes!");
        text.setFont(new Font(100));
        text.setEffect(new DropShadow());
        setCenter(text);
        setPrefSize(500,500);
    }
}
