import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.EngelsModel;
import view.EngelsView;
import view.Presenter;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        EngelsModel model = new EngelsModel();
        EngelsView view = new EngelsView();
        new Presenter(model, view);

        primaryStage.setScene(new Scene(view));
        primaryStage.setTitle("Engels");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
