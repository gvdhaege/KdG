package be.kdg.demo.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

public class GridPaneView4 extends GridPane {
    private Label label;
    private Button button;
    private ImageView imageView;

    public GridPaneView4() {
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

        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(33.0);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(67.0);
        this.getColumnConstraints().addAll(column1, column2);

        RowConstraints row1 = new RowConstraints();
        row1.setVgrow(Priority.ALWAYS);
        RowConstraints row2 = new RowConstraints(20.0);
        this.getRowConstraints().addAll(row1, row2);

        setGridLinesVisible(true);
    }
}

