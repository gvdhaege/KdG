package view;

import model.GameModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

//
// In de constructor wordt enkel 'initialiseEventHandling()' aangeroepen.
//

public class GamePresenter
{
    private GameModel model;    // In dit project wordt er niets gedaan in het model.
    private GameView view;

    public GamePresenter(GameModel model, GameView view)
    {
        this.model = model;
        this.view = view;

        initialiseEventHandling();
    }

    // Method die aan elke button een EventHandler hangt.
    //
    // Elke button wordt opgevraagd via de view.
    // De code in de handler wordt uitgevoerd wanneer het event zich voordoet.

    private void initialiseEventHandling()
    {
        view.getTopButton().setOnAction                             // Methode van class Button
        (                                                           // Argument
            // Lambda syntax, sinds Java 1.8
            (ActionEvent event)                                     // Als het een ActionEvent is,
            ->                                                      // dan moet je de volgende block uitvoeren :
            {
                System.out.println("Clicked on top button.");
            }
        );

        /*
        // Vroeger was de syntax veel complexer :

        view.getTopButton().setOnAction
        (
            new EventHandler<ActionEvent>()
            {
                @Override
                public void handle(ActionEvent event)
                {
                    System.out.println("Clicked on top button.");
                }
            }
        );
        */

        view.getLeftButton().setOnAction
        (
            (ActionEvent event)
            ->
            {
                System.out.println("Clicked on left button.");
            }
        );

        view.getCenterButton().setOnAction
        (
            (ActionEvent event)
            ->
            {
                System.out.println("Clicked on center button.");
            }
        );

        view.getRightButton().setOnAction
        (
            (ActionEvent event)
            ->
            {
                System.out.println("Clicked on right button.");
            }
        );

        view.getBottomButton().setOnAction
        (
            (ActionEvent event)
            ->
            {
                System.out.println("Clicked on bottom button.");
            }
        );
    }
}
