import Model.Dobbelen;
import View.DobbelenView;
import View.Presenter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Dobbelen model = new Dobbelen();
        DobbelenView view = new DobbelenView();
        Presenter presenter = new Presenter(model, view);
        Scene scene = new Scene(view);

        primaryStage.setTitle("Dobbelen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
