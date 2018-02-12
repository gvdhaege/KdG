package view.pow;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class PowPane extends BorderPane {
    private static final String IMAGE_PATH = "view/images/pow.jpg";

    public PowPane() {
        this.setCenter(new ImageView(new Image(IMAGE_PATH)));
    }
}
