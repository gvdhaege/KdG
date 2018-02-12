package be.kdg.AngryBirds.View;

import javafx.scene.control.CheckBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class AngryBirdsView extends BorderPane {
    private MenuBar mbrBar;
    private Menu mnuBestand;
    private MenuItem mniAfsluiten;
    private CheckBox chkVogel;

    public AngryBirdsView() {
        initializeNodes();
        layoutNodes();
    }

    //Geen access modifier gespecifieerd betekent: package proteced
    //Je kan dus deze getter enkel aanspreken binnen de package View. In concreto
    // kan in dit project enkel de AngryBirdsPresenter aan deze getter
    CheckBox getChkVogel() {
        return chkVogel;
    }

    MenuItem getMniAfsluiten(){
        return mniAfsluiten;
    }

    Menu getMnuBestand(){ return mnuBestand; }

    private void initializeNodes(){
        mbrBar = new MenuBar();
        mnuBestand = new Menu();
        mnuBestand.setText("Bestand");
        mniAfsluiten = new MenuItem();
        mniAfsluiten.setText("Afsluiten");
        chkVogel = new CheckBox();
        chkVogel.setText("vogel");
    }

    private void layoutNodes(){
        //In deze methode gaan we de controls (nodes) op de juiste plaats
        // op onze Pane zetten, alsook eventuele parent-childeren nodes instellen
        // zoals de menubar - menu's - menuitems per menu
        mbrBar.getMenus().add(mnuBestand);
        mnuBestand.getItems().add(mniAfsluiten);
        setTop(mbrBar);

        setCenter(chkVogel);
    }

}
