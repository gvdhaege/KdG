package be.kdg.demo.view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class GridPaneView2 extends GridPane {
    private Label label;
    private Button button;
    private ImageView imageView;

    public GridPaneView2() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.label = new Label("One");
        this.button = new Button("Klik");
        this.imageView = new ImageView("be/kdg/demo/be.kdg.demo.view/images/angrybird.png");
    }

    private void layoutNodes() {
        this.label.setPadding(new Insets(10));
        this.button.setPrefSize(80, 20);
        this.add(label, 0, 0);
        this.add(imageView, 1, 0);
        this.add(button, 0, 1, 2, 1);
        this.setAlignment(Pos.CENTER);
        this.setHgap(10);
        this.setVgap(10);
        GridPane.setHalignment(button, HPos.CENTER);
        this.setGridLinesVisible(true);
    }
}
