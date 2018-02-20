import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.Presenter;
import view.WTCView;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        WTCView view = new WTCView();
        new Presenter(view);

        primaryStage.setScene(new Scene(view));
        primaryStage.setTitle("New York - before and after 09/11 ...");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
