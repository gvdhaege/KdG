package be.kdg.demo.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class ButtonView extends BorderPane {
    private Button button1;
    private Button button2;
    private Button button3;
    public ButtonView() {
        this.initialiseNodes();
        this.layoutNodes();
    }
    private void initialiseNodes() {
        this.button1 = new Button();
        this.button2 = new Button("Accept");
        Image imageOk = new Image("be/kdg/demo/be.kdg.demo.view/images/angrybird.png");
        this.button3 = new Button("Accept", new ImageView(imageOk));
    }
    private void layoutNodes() {
        this.setTop(this.button1);
        this.setCenter(this.button2);
        this.setBottom(this.button3);
        BorderPane.setMargin(this.button1, new Insets(10));
        BorderPane.setMargin(this.button2, new Insets(10));
        BorderPane.setMargin(this.button3, new Insets(10));
        BorderPane.setAlignment(this.button2, Pos.CENTER_LEFT);
    }
}
