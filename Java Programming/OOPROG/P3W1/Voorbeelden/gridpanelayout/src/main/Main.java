package main;

import model.GameModel;
import view.GameView;
import view.GamePresenter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        GameModel model = new GameModel();
        GameView view = new GameView();
        GamePresenter presenter = new GamePresenter(model, view);

        Scene scene = new Scene(view);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
