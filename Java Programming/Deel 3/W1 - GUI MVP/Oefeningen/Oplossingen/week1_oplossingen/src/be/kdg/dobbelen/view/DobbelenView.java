package be.kdg.dobbelen.view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


public class DobbelenView extends GridPane {
    private ImageView die1;
    private ImageView die2;
    private Button btnThrow;

    public DobbelenView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        die1 = new ImageView();
        die2 = new ImageView();
        btnThrow = new Button("Werp");
        btnThrow.setPrefWidth(80);
    }

    private void layoutNodes() {
        //this.setGridLinesVisible(true);
        this.setPadding(new Insets(10));
        this.setHgap(10);
        this.setVgap(10);

        this.add(die1, 0, 0);
        this.add(die2, 1, 0);
        this.add(btnThrow, 0, 1, 2, 1);
        GridPane.setHalignment(btnThrow, HPos.CENTER);
    }

    ImageView getDie1() {
        return die1;
    }

    ImageView getDie2() {
        return die2;
    }

    Button getBtnThrow() {
        return btnThrow;
    }
}
