package be.kdg.AngryBirds;

import be.kdg.AngryBirds.Model.AngryBirdsModel;
import be.kdg.AngryBirds.View.AngryBirdsPresenter;
import be.kdg.AngryBirds.View.AngryBirdsView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class AngryBirdApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Eerst maken we het model (data) aan
        AngryBirdsModel model = new AngryBirdsModel();
        //Dan maken we onze eerste view aan. Die view is een klasse
        // die overerft van een Pane en gaan we later als 'scene' gebruiken
        // op onze stage
        AngryBirdsView view = new AngryBirdsView();
        //We maken een presenter aan waaraan we zowel ons model alsook onze
        // view aan toewijzen.
        AngryBirdsPresenter presenter
                = new AngryBirdsPresenter(model, view);
        Scene scene = new Scene(view);
        primaryStage.setScene(scene);

        //Om het icoontje van onze application (venster) aan te passen, moeten
        // we eerst onze png file inlezen als een image.
        Image iconImage = new Image(model.getImagePath());
        //Een icoontje is gekoppeld aan een venster van een applicatie. Daarom moeten
        // we de stage aanpassen en aan de lijst van zijn icoontjes onze ingeladen
        // image aan toevoegen
        primaryStage.getIcons().add(iconImage);
        //Tot slot zetten we de titel van ons venster nog juist
        primaryStage.setTitle("Opdracht 1");
        primaryStage.show();
    }

    //Je bent niet verplicht deze main methode te schrijven, maar we raden dit toch
    //wel ten stelligste aan. Het grootste voordeel van deze toch zelf te schrijven is dat
    // als er een fout gebeurd in de methode 'start' (of in één van de methodes die opgeroepen
    // worden vanuit deze methode), je tenminste een duidelijke melding krijgt welke lijn code
    // gefaald is.
    //Als je deze main methode weglaat, krijg je vaak NIET de juiste foutmelding te zien maar
    // een algemene error (initialisatie-fout...)
    public static void main(String[] args) {
        Application.launch(args);
    }
}
