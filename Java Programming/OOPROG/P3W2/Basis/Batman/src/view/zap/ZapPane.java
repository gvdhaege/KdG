package view.zap;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class ZapPane extends BorderPane {
    private static final String IMAGE_PATH = "view/images/zap.jpg";

    public ZapPane() {
        this.setCenter(new ImageView(new Image(IMAGE_PATH)));
    }
}
