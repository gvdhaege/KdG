package View;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


public class DobbelenView extends GridPane {
    private ImageView dobbelsteen1;
    private ImageView dobbelsteen2;
    private Button button;

    public DobbelenView() {
        initialisatieNodes();
        layoutNodes();
    }

    private void initialisatieNodes (){
        dobbelsteen1 = new ImageView();
        dobbelsteen2 = new ImageView();
        button = new Button("Werp");
        button.setPrefWidth(80);
    }

    private void layoutNodes (){
        this.setPadding(new Insets(10));
        this.setVgap(10);
        this.setHgap(10);

        this.add(dobbelsteen1,0,0);
        this.add(dobbelsteen2,1,0);
        this.add(button, 0, 1, 2, 1);
        GridPane.setHalignment(button, HPos.CENTER);
    }

    Button getButton() {
        return button;
    }

    ImageView getDobbelsteen1() {
        return dobbelsteen1;
    }

    ImageView getDobbelsteen2() {
        return dobbelsteen2;
    }
}
