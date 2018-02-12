package be.kdg.texasholdem;

import be.kdg.texasholdem.view.GamePane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import be.kdg.texasholdem.model.Game;
import be.kdg.texasholdem.view.Presenter;

public class Main extends Application {
    @Override
    public void start(Stage mainStage) {
        final Game model = new Game();
        final GamePane view = new GamePane();
        new Presenter(model, view);
        mainStage.setScene(new Scene(view));
        mainStage.setTitle("Texas Hold'em");
        mainStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
