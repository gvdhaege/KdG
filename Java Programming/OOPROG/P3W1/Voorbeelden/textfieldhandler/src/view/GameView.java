package view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

//
// Demo van eventhandling in een TextField.
//
// GameView erft over van BorderPane.
//

public class GameView extends BorderPane
{
    private VBox centerBox;
    private GameTextField textField;

    public GameView()
    {
        centerBox = new VBox();
        centerBox.setAlignment(Pos.CENTER);
        textField = new GameTextField();
        textField.setMaxWidth(100);
        textField.setAlignment(Pos.CENTER);
        centerBox.getChildren().add(textField);

        setCenter(centerBox);

        setPrefSize(600,400);
        setStyle("-fx-background-color: darkslategray;");
    }

    // Getter van TextField. Wordt hier niet gebruikt.
    public TextField getTextField() { return textField; }

}
