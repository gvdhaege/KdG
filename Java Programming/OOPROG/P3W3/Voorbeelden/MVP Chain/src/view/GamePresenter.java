package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import model.Cell;
import model.GameBoard;

/*
De class GamePresenter is de manager van het spel.
Hij heeft een referentie naar het gameboard en naar de view.

Deze class vangt de zetten van de speler op, door op de juiste manier
de gameboard en gameview objecten aan te sturen.

In deze class worden daarvoor de eventhandlers aangemaakt.

*/

public class GamePresenter
{
    private GameBoard gameBoard;
    private GameView gameView;

    public GamePresenter(GameBoard gameBoard, GameView gameView)
    {
        this.gameBoard = gameBoard;
        this.gameView = gameView;

        initialiseEventHandlers();
    }

    private void initialiseEventHandlers()
    {
        gameView.getTextField_1().setOnAction
        (
            new EventHandler<ActionEvent>()
            {
                @Override
                public void handle(ActionEvent event)
                {
                    // Private method, zie onderaan.
                    processInput(
                        gameBoard.getCell_1(),
                        gameView.getTextField_1(),
                        Integer.parseInt(gameView.getTextField_1().getText()));
                }
            }
        );
        gameView.getTextField_2().setOnAction
        (
            new EventHandler<ActionEvent>()
            {
                @Override
                public void handle(ActionEvent event)
                {
                    processInput(
                        gameBoard.getCell_2(),
                        gameView.getTextField_2(),
                        Integer.parseInt(gameView.getTextField_2().getText()));
                }
            }
        );
        gameView.getTextField_3().setOnAction
        (
            new EventHandler<ActionEvent>()
            {
                @Override
                public void handle(ActionEvent event)
                {
                    processInput(
                        gameBoard.getCell_3(),
                        gameView.getTextField_3(),
                        Integer.parseInt(gameView.getTextField_3().getText()));
                }
            }
        );
    }

    /*
    De method processInput heeft 3 argumenten :
        de huidige cell,
        het huidige textfield,
        en de ingeven waarde.

    Afhankelijk van de waarde van de input wordt :
        de kleur van het textfield en       // Update van de view
        de status van de cell               // Update van het model
    aangepast.

    */

    private void processInput(Cell cell, TextField textField, int input)
    {
        if (input > cell.getLimit())
            textField.setStyle(gameBoard.getCell_1().getColorTooHigh());
        else if (input < cell.getLimit())
            textField.setStyle(gameBoard.getCell_1().getColorTooLow());
        if (input == cell.getLimit())
            textField.setStyle(gameBoard.getCell_1().getColorCorrect());

        // State van de cell updaten
        cell.setAnswered(true);
    }
}
