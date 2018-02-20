package be.kdg.multiplescreens.view.start;

import javafx.scene.control.Button;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

/**
 * Created by vochtenh on 17/02/2016.
 */
public class StartView extends BorderPane {
    private Button btnNextScreen;

    public StartView() {
        btnNextScreen = new Button("Start ganzenbord!");
        btnNextScreen.setFont(new Font(20));
        btnNextScreen.setEffect(new Reflection());
        layoutNodes();
    }

    private void layoutNodes() {
        setPrefSize(300,300);
        setCenter(btnNextScreen);
    }

    Button getBtnNextScreen() {
        return btnNextScreen;
    }
}
