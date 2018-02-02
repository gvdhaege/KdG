package main;

import model.ColorManager;
import view.ColorView;
import view.Presenter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        ColorManager model = new ColorManager();            // Aanmaken Model.
        ColorView view = new ColorView();                   // Aanmaken View.
        Presenter presenter = new Presenter(model, view);   // Aanmaken Presenter met model en view als argumenten.

        Scene scene = new Scene(view);                      // Aanmaken Scene, met de view als argument.
        primaryStage.setScene(scene);                       // Zet de scene op de stage.
        primaryStage.setTitle("Colors");
        primaryStage.show();                                // Toon de scene.
    }

    public static void main(String[] args)
    {
        launch(args);                                       // Wrapper method die de Application opstart.
    }
}
