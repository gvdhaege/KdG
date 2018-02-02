package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


//
// Demonstratie van een GridPane in het center van een BorderPane.
//
//      http://docs.oracle.com/javafx/2/layout/builtin_layouts.htm
//
// Deze website is heel nuttig om gestart te geraken.
//
// Een overzicht van de css colors die javaFX kent :
//
//      https://www.htmlgoodies.com/tutorials/colors/article.php/3478961
//
// Een GridPane is een tabel met rijen en kolommen, vergelijk met Excel.

public class GameView extends BorderPane
{
    private HBox upperBox;
    private VBox leftBox;
    private VBox rightBox;
    private HBox lowerBox;

    private GridPane gamePane;                                           // Declaratie van de GridPane.

    public GameView()
    {
        // JavaFX css strings.
        String cssTBBorders = "-fx-font-size: 30; -fx-background-color: Darkgoldenrod;";
        String cssLRBorders = "-fx-font-size: 30; -fx-background-color: Darkcyan;";

        upperBox = new HBox();
        upperBox.setAlignment(Pos.CENTER);
        upperBox.setStyle(cssTBBorders);                                 // De background color van de HBox, via CSS.
        upperBox.getChildren().add(new Label("Top"));

        leftBox = new VBox();
        leftBox.setAlignment(Pos.CENTER);
        leftBox.setStyle(cssLRBorders);
        leftBox.getChildren().add(new Label("Left"));

        gamePane = new GridPane();                                       // Aanmaken van de GridPane.
        gamePane.setGridLinesVisible(true);                              // Hulp bij development.
        gamePane.setPadding(new Insets(10));              // Vergelijkbaar met CSS padding.
        ColumnConstraints column1 = new ColumnConstraints(200);     // First column : 200 pixels
        ColumnConstraints column2 = new ColumnConstraints(250);     // Second column : 250 pixels
        gamePane.getColumnConstraints().addAll(column1, column2);        // Voeg de columnconstraints toe.

        String cssGamePane = "-fx-font-size: 30; -fx-padding: 7;";
        Label userName = new Label("UserName:");
        userName.setStyle(cssGamePane);
        userName.setTextFill(Color.IVORY);
        gamePane.add(userName, 0, 0);                   // column 0, row 0
        Label age = new Label("Age:");
        age.setStyle(cssGamePane);
        age.setTextFill(Color.IVORY);
        gamePane.add(age, 0, 1);                        // column 0, row 1
        Label nationality = new Label("Nationality:");
        nationality.setStyle(cssGamePane);
        nationality.setTextFill(Color.IVORY);
        gamePane.add(nationality, 0, 2);
        Label hobbys = new Label("No hobby's.");
        hobbys.setStyle(cssGamePane);
        hobbys.setTextFill(Color.IVORY);
        gamePane.add(hobbys, 1, 5);                      // column 1, row 5

        rightBox = new VBox();
        rightBox.setAlignment(Pos.CENTER);
        rightBox.setStyle(cssLRBorders);
        rightBox.getChildren().add(new Label("Right"));

        lowerBox = new HBox();
        lowerBox.setAlignment(Pos.CENTER);
        lowerBox.setStyle(cssTBBorders);
        lowerBox.getChildren().add(new Label("Bottom"));

        setTop(upperBox);
        setLeft(leftBox);
        setCenter(gamePane);
        setRight(rightBox);
        setBottom(lowerBox);

        // Om de gridpane (gamePane) in het centrum van de center pane te zetten :
        gamePane.setAlignment(Pos.CENTER);

        setPrefSize(600,400);
        setStyle("-fx-background-color: darkslategray;");
    }
}
