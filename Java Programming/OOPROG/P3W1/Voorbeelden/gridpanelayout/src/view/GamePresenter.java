package view;

import model.GameModel;
import view.GameView;

public class GamePresenter
{
    private GameModel model;
    private GameView view;

    public GamePresenter(GameModel model, GameView view)
    {
        this.model = model;
        this.view = view;

        initialiseEventHandling();
    }

    private void initialiseEventHandling()
    {
        // Geen eventhandling in dit project.
        // Enkel demo van de GridPane.
    }
}
