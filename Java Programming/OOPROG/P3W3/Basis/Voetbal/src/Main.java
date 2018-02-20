import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.Presenter;
import view.VoetbalView;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VoetbalView view = new VoetbalView();
        new Presenter(view);

        primaryStage.setScene(new Scene(view));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Voetbaltalent");
        primaryStage.setWidth(800.0);
        primaryStage.setHeight(600.0);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
