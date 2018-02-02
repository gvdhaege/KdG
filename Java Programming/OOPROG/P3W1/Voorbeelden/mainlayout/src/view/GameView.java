package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

//
// De class GameView erft over van BorderPane :
//
//      https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/BorderPane.html
//
// De 5 onderdelen van de borderpane worden opgevuld met HBoxen en VBoxen.
// Elke box bevat een button.
//

public class GameView extends BorderPane
{
    private HBox topBox;                // Horizontal Box.
    private VBox leftBox;               // Vertical Box.
    private VBox centerBox;
    private VBox rightBox;
    private HBox bottomBox;

    private Button topButton;           // 5 Buttons.
    private Button leftButton;
    private Button centerButton;
    private Button rightButton;
    private Button bottomButton;

    // Constructor.
    //
    // Bekijk goed de hiërarchische opbouw van de view.
    public GameView()
    {
        topBox = new HBox();                    // Aanmaken HBox.
        topBox.setAlignment(Pos.CENTER);        // De elementen in de HBox worden gecentreerd.
        topButton = new Button("Top");      // Aanmaken Button.
        topBox.getChildren().add(topButton);    // Toevoegen van de button aan de HBox, via getChildren().

        leftBox = new VBox();
        leftBox.setAlignment(Pos.CENTER);
        leftButton = new Button("Left");
        leftBox.getChildren().add(leftButton);

        centerBox = new VBox();
        centerBox.setAlignment(Pos.CENTER);
        centerButton = new Button("Center");
        centerBox.getChildren().add(centerButton);

        rightBox = new VBox();
        rightBox.setAlignment(Pos.CENTER);
        rightButton = new Button("Right");
        rightBox.getChildren().add(rightButton);

        bottomBox = new HBox();
        bottomBox.setAlignment(Pos.CENTER);
        bottomButton = new Button("Bottom");
        bottomBox.getChildren().add(bottomButton);

        setTop(topBox);                             // Zet de boxen op de juiste plaats in de BorderPane.
        setLeft(leftBox);                           // We erven over van Borderpane, deze methods zijn dus gekend.
        setCenter(centerBox);
        setRight(rightBox);
        setBottom(bottomBox);

        setPrefSize(600,400);              // Zet de size van de BorderPane.
        setStyle("-fx-background-color: darkslategray;");   // Zet de background color via CSS.
    }

    // Getters van de buttons, zie de presenter.
    public Button getTopButton()    { return topButton;     }
    public Button getLeftButton()   { return leftButton;    }
    public Button getCenterButton() { return centerButton;  }
    public Button getRightButton()  { return rightButton;   }
    public Button getBottomButton() { return bottomButton;  }
}
