package be.kdg.batman;


import be.kdg.batman.model.Game;
import be.kdg.batman.view.BatmanPresenter;
import be.kdg.batman.view.pow.PowPane;
import be.kdg.batman.view.wham.WhamPane;
import be.kdg.batman.view.zap.ZapPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Game model = new Game();
        PowPane powView = new PowPane();
        WhamPane whamView = new WhamPane();
        ZapPane zapView = new ZapPane();
        new BatmanPresenter(model, powView, whamView, zapView);
        Scene scene = new Scene(powView);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Batman");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
