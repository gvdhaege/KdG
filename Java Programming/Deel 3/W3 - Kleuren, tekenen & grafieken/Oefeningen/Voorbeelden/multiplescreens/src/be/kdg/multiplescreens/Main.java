package be.kdg.multiplescreens;

import be.kdg.multiplescreens.model.SimpleModel;
import be.kdg.multiplescreens.view.start.StartPresenter;
import be.kdg.multiplescreens.view.start.StartView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by vochtenh on 17/02/2016.
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        SimpleModel model = new SimpleModel();
        StartView view = new StartView();
        StartPresenter startPresenter = new StartPresenter(model,view);
        Scene scene = new Scene(view);
        primaryStage.setScene(scene);
        startPresenter.addWindowEventHandlers();
        primaryStage.setTitle("Ganzenbord");
        primaryStage.show();
        startPresenter.showLogin();
    }

    public static void main(String[] args) {
        launch();
    }
}
