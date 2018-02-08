package be.kdg.demo.view;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class ImageViewView extends BorderPane {
    private ImageView afbeelding;
    public ImageViewView() {
        this.initialiseNodes();
        this.layoutNodes();
    }
    private void initialiseNodes() {
        this.afbeelding = new ImageView(new Image("be/kdg/demo/be.kdg.demo.view/images/angrybird.png"));
    }
    private void layoutNodes() {
        this.setCenter(this.afbeelding);
        BorderPane.setMargin(this.afbeelding, new Insets(10));
    }
}
