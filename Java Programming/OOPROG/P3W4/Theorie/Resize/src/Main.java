import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.ResizePresenter;
import view.ResizeView;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        final ResizeView view = new ResizeView();
        final ResizePresenter presenter = new ResizePresenter(view);

        primaryStage.setScene(new Scene(view));
        presenter.addWindowEventHandlers();
        primaryStage.setTitle("Resize me!");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
