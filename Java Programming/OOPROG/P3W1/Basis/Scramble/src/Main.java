import Model.Scrambler;
import View.Presenter;
import View.ScramblerView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scrambler model = new Scrambler();
        ScramblerView view = new ScramblerView();
        Presenter presenter = new Presenter(model, view);
        Scene scene = new Scene(view);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Scramble");
        primaryStage.show();
    }
}
