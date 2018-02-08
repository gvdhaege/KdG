package be.kdg.demo.view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class GridPaneView5 extends GridPane {
    private Label label;
    private Button button;
    private ImageView imageView;

    public GridPaneView5() {
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
        this.button.setPrefSize(120, 20);
        this.add(label, 0, 0);
        this.add(imageView, 1, 0);
        this.add(button, 0, 1, 2, 1);

        GridPane.setConstraints(label, 0, 0, 1, 1, HPos.LEFT, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(imageView, 1, 0, 1, 1, HPos.LEFT, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(button, 0, 1, 2, 1, HPos.LEFT, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);

        setGridLinesVisible(true);
    }
}
