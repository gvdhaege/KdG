package view;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

//
// Deze class erft over van TextField en bevat demo code die laat zien hoe
// je de input van het klavier kan verwerken.
//
// Het is zeker een goed idee om in je game over te erven van bestaande controls.
// Je hebt dan alles van die control, en je programmeert er je eigen game logic bij.
//

public class GameTextField extends TextField
{
    public GameTextField()
    {
        initialiseEventHandling();
    }

    private void initialiseEventHandling()
    {
        /*
        // Zet dit eerst in commentaar.
        setOnKeyPressed
        (
            (KeyEvent keyEvent)
                    ->
            {
                setText("");
            }
        );
        */

        setOnKeyReleased
        (
            (KeyEvent keyEvent)
            ->
            {
                System.out.println(keyEvent.getCode());

                switch (keyEvent.getCode()) {
                    case ENTER:
                        System.out.println("Enter key pressed");
                        break;
                    case TAB:
                        System.out.println("Tab key pressed");
                        break;
                    case LEFT:
                        System.out.println("Left arrow key pressed");
                        break;
                    case UP:
                        System.out.println("Up arrow key pressed");
                        if (keyEvent.isShiftDown()) {
                            System.out.println("Go faster, the shift key is down.");
                        }
                        break;
                    case RIGHT:
                        System.out.println("Right arrow key pressed");
                        break;
                    case DOWN:
                        System.out.println("Down arrow key pressed");
                        break;
                }
            }
        );
    }
}
