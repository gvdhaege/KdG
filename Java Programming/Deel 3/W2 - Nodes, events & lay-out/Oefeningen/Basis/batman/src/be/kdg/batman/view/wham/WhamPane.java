package be.kdg.batman.view.wham;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class WhamPane extends BorderPane {
    private static final String IMAGE_PATH = "be/kdg/batman/view/images/wham.jpg";

    public WhamPane() {
        this.setCenter(new ImageView(new Image(IMAGE_PATH)));
    }
}