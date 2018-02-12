import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Game;
import view.BatmanPresenter;
import view.pow.PowPane;
import view.wham.WhamPane;
import view.zap.ZapPane;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Game model = new Game();
        PowPane powView = new PowPane();
        WhamPane whamView = new WhamPane();
        ZapPane zapView = new ZapPane();
        new BatmanPresenter(model, powView, whamView, zapView);

        primaryStage.setScene(new Scene(powView));
        primaryStage.setTitle("Batman");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
