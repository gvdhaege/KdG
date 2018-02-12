package be.kdg.dobbelen.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class DobbelenView extends BorderPane {
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

    }

    private void layoutNodes() {
        this.setPadding(new Insets(10));

        this.setLeft(die1);
        this.setRight(die2);
        this.setBottom(btnThrow);

        BorderPane.setAlignment(btnThrow, Pos.CENTER);
        BorderPane.setMargin(die1, new Insets(10));
        BorderPane.setMargin(die2, new Insets(10));
        BorderPane.setMargin(btnThrow, new Insets(10));

        btnThrow.setPrefWidth(80);
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
