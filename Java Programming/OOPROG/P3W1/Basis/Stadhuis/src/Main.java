import View.Presenter;
import View.StadhuisPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StadhuisPane view = new StadhuisPane();
        Presenter presenter = new Presenter(view);
        Scene scene = new Scene(view);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Stadhuis");
        primaryStage.show();
    }
}
