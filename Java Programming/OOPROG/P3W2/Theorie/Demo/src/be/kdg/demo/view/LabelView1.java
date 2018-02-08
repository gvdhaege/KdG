package be.kdg.demo.view;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class LabelView1 extends BorderPane {
    private Label label;
    public LabelView1() {
        this.initialiseNodes();
        this.layoutNodes();
    }
    private void initialiseNodes() {
        Image imageOk = new Image("be/kdg/demo/be.kdg.demo.view/images/angrybird.png");
        this.label = new Label("Accept", new ImageView(imageOk));
    }
    private void layoutNodes() {
        this.setCenter(this.label);
        BorderPane.setMargin(this.label, new Insets(10));
    }
}