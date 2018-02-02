package view;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

// De view erft over van BorderPane.
//
// BorderPane is een layoutmanager : die helpt je bij het managen van je layout.
//
//      Plaatsing van de verschillende grafische elementen (controls).
//      Automatische scaling wanneer je het scherm vergroot of verkleint.

public class ColorView extends BorderPane
{
    private Button coloredButton;                        // JavaFX Button class.

    public ColorView()
    {
        coloredButton = new Button("Click Me !");   // Initialisatie van de button.
        coloredButton.setPrefWidth(150);                // Set width van de button.
        coloredButton.setPrefHeight(50);                // Set height van de button.

        setCenter(coloredButton);                       // Plaatsing van de button op de BorderPane.
        setPrefSize(250, 200);        // Set size van de BorderPane.
    }

    Button getColoredButton()                           // Getter voor de Button.
    {
        return coloredButton;
    }
}
