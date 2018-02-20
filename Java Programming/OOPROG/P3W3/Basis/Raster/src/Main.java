import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.RasterModel;
import view.Presenter;
import view.RasterView;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        RasterModel model = new RasterModel();
        RasterView view = new RasterView();
        new Presenter(model, view);

        primaryStage.setScene(new Scene(view));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Raster");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
