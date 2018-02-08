package be.kdg.demo.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class GridPaneView1 extends GridPane {
    private Label label;
    private Button button;
    private ImageView imageView;
    public GridPaneView1() {
        this.initialiseNodes();
        this.layoutNodes();
    }
    private void initialiseNodes() {
        this.label = new Label("One");
        this.button = new Button("Klik");
        this.imageView = new ImageView("be/kdg/demo/be.kdg.demo.view/images/angrybird.png");
    }
    private void layoutNodes() {
        this.add(label,     0, 0);
        this.add(imageView, 1, 0);
        this.add(button,    0, 1);
        this.setGridLinesVisible(true);
    }
}
