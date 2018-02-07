package be.kdg.pensioen;

import be.kdg.pensioen.model.Pensioen;
import be.kdg.pensioen.view.PensioenPresenter;
import be.kdg.pensioen.view.PensioenView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pensioen model = new Pensioen();
        PensioenView view = new PensioenView();
        PensioenPresenter presenter = new PensioenPresenter(model, view);

        // TODO: Alleen nog hoofding invullen
        Scene scene = new Scene(presenter.getView());
        primaryStage.setTitle("");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
