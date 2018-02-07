import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Pensioen;
import view.PensioenPresenter;
import view.PensioenView;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pensioen model = new Pensioen();
        PensioenView view = new PensioenView();
        PensioenPresenter presenter = new PensioenPresenter(model, view);

        Scene scene = new Scene(presenter.getView());
        primaryStage.setTitle("Pensioenjaar");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
