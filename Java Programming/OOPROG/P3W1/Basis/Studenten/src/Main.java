import Model.StudentAdministratie;
import View.Presenter;
import View.StudentView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StudentAdministratie model = new StudentAdministratie();
        StudentView view = new StudentView();
        Presenter presenter = new Presenter(model, view);
        Scene scene = new Scene(view);

        primaryStage.setTitle("Studenten");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
