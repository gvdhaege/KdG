package be.kdg.demo.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class GridPaneView3 extends GridPane {
    private Label label;
    private Button button;
    private ImageView imageView;

    public GridPaneView3() {
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
        this.add(label,     0, 0);
        this.add(imageView, 1, 0);
        this.add(button,    0, 1, 2, 1);

        ColumnConstraints column1 = new ColumnConstraints(100);
        ColumnConstraints column2 = new ColumnConstraints(200);
        this.getColumnConstraints().addAll(column1, column2);

        RowConstraints rowConstraints = new RowConstraints(100);
        this.getRowConstraints().addAll(rowConstraints);

        this.setGridLinesVisible(true);
    }
}
