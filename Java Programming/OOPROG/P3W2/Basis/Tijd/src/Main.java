import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.TimeModel;
import view.Presenter;
import view.TimeView;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        final TimeModel model = new TimeModel();
        final TimeView view = new TimeView();
        new Presenter(model, view);
        Scene scene = new Scene(view);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Tijd");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
