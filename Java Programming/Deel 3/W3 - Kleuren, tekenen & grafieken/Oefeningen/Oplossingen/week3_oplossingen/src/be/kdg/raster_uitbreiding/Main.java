package be.kdg.raster_uitbreiding;

import be.kdg.raster_uitbreiding.model.RasterModel;
import be.kdg.raster_uitbreiding.view.Presenter;
import be.kdg.raster_uitbreiding.view.RasterView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        RasterModel model = new RasterModel();
        RasterView view = new RasterView();
        new Presenter(model, view);
        primaryStage.setScene(new Scene(view));
        primaryStage.setTitle("Raster Uitbreiding");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
