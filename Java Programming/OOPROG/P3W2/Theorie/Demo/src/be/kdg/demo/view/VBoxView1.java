package be.kdg.demo.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class VBoxView1 extends VBox {
    private Label label;
    private Button button;
    private ImageView imageView;
    public VBoxView1() {
        this.initialiseNodes();
        this.layoutNodes();
    }
    private void initialiseNodes() {
        this.label = new Label("One");
        this.button = new Button("Klik");
        this.imageView = new ImageView("be/kdg/demo/be.kdg.demo.view/images/angrybird.png");
    }
    private void layoutNodes() {
        this.setSpacing(20);
        this.setPadding(new Insets(20));
        this.getChildren().addAll(label, button, imageView);
    }
}


