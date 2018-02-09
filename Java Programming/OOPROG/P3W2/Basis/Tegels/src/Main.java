import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.TileModel;
import view.Presenter;
import view.TileView;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        final TileModel model = new TileModel();
        final TileView view = new TileView();
        new Presenter(model, view);

        primaryStage.setScene(new Scene(view));
        primaryStage.setTitle("Tegels");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
