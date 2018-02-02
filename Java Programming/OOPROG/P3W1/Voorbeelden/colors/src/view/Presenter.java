package view;

import model.ColorManager;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

//
// De class Presenter zorgt voor de interactie tussen Model en View.
// Het model en de view worden als argumenten meegegeven aan de Presenter.
//

public class Presenter
{
    // 2 variabelen.
    private ColorManager model;
    private ColorView view;

    // Constructor initialiseert de variabelen.
    // Update dan de view en zet alles klaar voor de afhandeling van de user-events.
    public Presenter(ColorManager model, ColorView view)
    {
        this.model = model;
        this.view = view;

        updateView();
        initialiseEventHandling();
    }

    // Zet de kleur van de button op de volgende kleur.
    //
    // Noteer : JavaFX kent CSS. Komt later nog aan bod.
    private void updateView()
    {
        switch (model.getCurrentColor())                                            // Interactie met het model.
        {
            case RED:
                view.getColoredButton().setStyle("-fx-background-color: red");      // Interactie met de view.
                break;
            case GREEN:
                view.getColoredButton().setStyle("-fx-background-color: green");    // Interactie met de view.
                break;
            case ORANGE:
                view.getColoredButton().setStyle("-fx-background-color: orange");   // Interactie met de view.
                break;
        }
    }

    // Zet alles klaar om te reageren op events.
    //
    // We vragen aan de view de button op, via de getter.
    // Dan roepen we op die button de method setOnAction aan.
    // Daarin staat een EventHandler met de method handle().
    private void initialiseEventHandling()
    {
        view.getColoredButton().setOnAction         // Method van Button.
        (                                           // Argument
            (ActionEvent event)
            ->
            {
                model.next();                       // Zet de button op de volgende kleur.
                updateView();                       // Roep updateView aan, obv de nieuwe situatie.
            }
        );
    }
}
