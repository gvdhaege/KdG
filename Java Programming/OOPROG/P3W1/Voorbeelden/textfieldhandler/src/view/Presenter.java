package view;

import model.GameModel;

public class Presenter
{
    private GameModel model;
    private GameView view;

    public Presenter(GameModel model, GameView view)
    {
        this.model = model;
        this.view = view;

        // initialiseEventHandling();
    }

    private void initialiseEventHandling()
    {
        // De event handling wordt in de class GameTextField verwerkt.
    }
}
