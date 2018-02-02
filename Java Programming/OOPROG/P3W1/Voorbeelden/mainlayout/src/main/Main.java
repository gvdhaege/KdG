package main;

import model.GameModel;
import view.GameView;
import view.GamePresenter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Model View Presenter met JavaFX.
//
// Bekijk de architectuur van het project.
// Deze organisatie laat toe om de verschillende modules zo volledig mogelijk van elkaar te scheiden.
// Alleen maar voordelen : snel te begrijpen, goed te onderhouden.
//
// package main     : het main programma.
// package model    : alles wat met data te maken heeft.
// package view     : de user interface en de interactie met de user.

// Elke JavaFX applicatie vertrekt van een class, hier 'Main' genoemd, die overerft van 'Application'
// en 2 methods bevat:
//
//      main()  : zoals steeds het startpunt van je programma.
//      start() : hierin wordt de applicatie opgebouwd, op een hiërarchische manier.
//
//                      Application -> Stage -> Scene -> View (= BorderPane)
//

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        // We maken een model en een view aan, en geven die mee aan de presenter.
        // De presenter is de manager van je applicatie : vangt user acties op en reageert.
        GameModel model = new GameModel();
        GameView view = new GameView();
        new GamePresenter(model, view);     // Anoniem object, want we hebben geen object nodig in deze class.

        Scene scene = new Scene(view);      // GameView erft over van BorderPane, kan dus meegegeven worden aan Scene.

        // JavaFX is opgebouwd naar analogie van een theater.
        // Je begint met een Stage en daarop zet je een Scene.
        primaryStage.setScene(scene);
        primaryStage.setTitle("MainLayout");
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);                       // Wrapper method die de Application opstart.
    }
}
