import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.GameBoard;
import view.GamePresenter;
import view.GameView;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        GameBoard gameBoard = new GameBoard();                                  // Aanmaken Model.
        GameView gameView = new GameView();                                     // Aanmaken View.
        GamePresenter gamePresenter = new GamePresenter(gameBoard, gameView);   // Aanmaken Presenter met model en view als argumenten.

        Scene scene = new Scene(gameView);                                      // Aanmaken Scene, met de view als argument.
        primaryStage.setScene(scene);                                           // Zet de scene op de stage.
        primaryStage.setTitle("MVP Chain");
        primaryStage.show();                                                    // Toon de scene.
    }

    public static void main(String[] args)
    {
        launch(args);                                                           // Wrapper method die de Application opstart.
    }
}
