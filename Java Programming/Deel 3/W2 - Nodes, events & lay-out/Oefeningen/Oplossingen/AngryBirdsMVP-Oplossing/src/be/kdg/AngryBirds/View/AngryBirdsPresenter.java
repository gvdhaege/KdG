package be.kdg.AngryBirds.View;

import be.kdg.AngryBirds.Model.AngryBirdsModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AngryBirdsPresenter {
    private AngryBirdsModel model;
    private AngryBirdsView view;

    public AngryBirdsPresenter(AngryBirdsModel model
                                , AngryBirdsView view) {
        this.model = model;
        this.view = view;
        updateView();
        addEventHandlers();
    }

    private void updateView(){
        //We gaan de te tonen image inladen in het geheugen. Dit doen we door
        // aan ons Model te vragen op welke locatie (path) de image staat
        Image img = new Image(model.getImagePath());
        //Nu hebben we een image ingeladen in het geheugen en kunnen deze gebruiken als 'bron'
        //om deze te tonen op het scherm.

        //Om een image te kunnen tonen op het scherm, moeten we een imageview
        // aanmaken. Deze imageview wijzen we dan toe aan onze checkbox via de methode
        // setGraphic
        ImageView imvCheckBox = new ImageView(img);
        view.getChkVogel().setGraphic(imvCheckBox);

        //Om dezelfde image te kunnen tonen op een andere plaats in onze view,
        //moeten we een nieuwe ImageView aanmaken. Een specifieke ImageView kan maar op één plaats
        //getoond worden in een view, maar je kan wel meerdere keren dezelfde ingeladen
        // image gebruiken over verschillende imageviews heen.
        ImageView imvAfsluiten = new ImageView(img);
        view.getMniAfsluiten().setGraphic(imvAfsluiten);

        ImageView imvBestand = new ImageView(img);
        view.getMnuBestand().setGraphic(imvBestand);
    }

    private void addEventHandlers(){
        view.getMniAfsluiten().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
    }
}
