package view;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/*

De view class erft over van BorderPane.
    Je kan alle methods van BorderPane gebruiken.
    De view wordt meegegeven aan de Scene in class Main.

De view bevat ENKEL grafische controls en methods.

*/

public class GameView extends BorderPane
{
    private TextField textField_1;
    private TextField textField_2;
    private TextField textField_3;

    public GameView()
    {
        setPrefSize(750, 500);
        setStyle("-fx-background-color: #2F4F4F;");

        setCenter(getHBox());
    }

    private HBox getHBox()
    {
        HBox hBox = new HBox();

        textField_1 = new TextField();
        textField_1.setAlignment(Pos.CENTER);
        textField_1.setStyle("-fx-font-size:16px;");
        textField_1.setStyle("-fx-background-color:darkgray;");
        textField_2 = new TextField();
        textField_2.setAlignment(Pos.CENTER);
        textField_2.setStyle("-fx-font-size:16px;");
        textField_1.setStyle("-fx-background-color:darkgray;");
        textField_3 = new TextField();
        textField_3.setAlignment(Pos.CENTER);
        textField_3.setStyle("-fx-font-size:16px;");
        textField_1.setStyle("-fx-background-color:darkgray;");

        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(textField_1, textField_2, textField_3);

        return hBox;
    }

    public TextField getTextField_1()   { return textField_1; }
    public TextField getTextField_2()   { return textField_2; }
    public TextField getTextField_3()   { return textField_3; }
}
