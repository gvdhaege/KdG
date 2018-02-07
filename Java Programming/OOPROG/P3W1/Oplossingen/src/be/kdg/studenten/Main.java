package be.kdg.studenten;

import be.kdg.studenten.model.StudentAdministratie;
import be.kdg.studenten.view.Presenter;
import be.kdg.studenten.view.StudentView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by vochtenh on 25/01/2016.
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        StudentAdministratie model = new StudentAdministratie();
        StudentView view = new StudentView();
        Presenter presenter = new Presenter(model, view);
        Scene scene = new Scene(view);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Studenten");
        primaryStage.show();
    }
}
