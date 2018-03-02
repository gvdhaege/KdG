package be.kdg.mastermind.view.mastermind;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

/**
 * Hoofdscherm van de applicatie. Omvat het menu, het spelbord en de check knop.
 */
public class MastermindView extends BorderPane {
    private MenuItem miExit;
    private MenuItem miRestart;
    private MenuItem miSave;
    private MenuItem miLoad;
    private MenuItem miSettings;
    private MenuItem miAbout;
    private MenuItem miRules;

    private GameboardView gameboardView;
    private Button btnCheck;


    public MastermindView(int combinationSize, int maxNumberOfGuesses) {
        initialiseNodes(combinationSize, maxNumberOfGuesses);
        layoutNodes();
    }

    private void initialiseNodes(int combinationSize, int maxNumberOfGuesses) {
        //menu
        miExit = new MenuItem("Exit");
        miAbout = new MenuItem("About");
        miRules = new MenuItem("Rules");
        miSettings = new MenuItem("Settings");
        miSave = new MenuItem("Save");
        miLoad = new MenuItem("Load");
        miRestart = new MenuItem("Restart");
        //
        gameboardView = new GameboardView(combinationSize, maxNumberOfGuesses);
        btnCheck = new Button("Check");
        btnCheck.setPrefWidth(100);
    }

    private void layoutNodes() {
        Menu menuGame = new Menu("Game",null,miSettings, miSave, miLoad, new SeparatorMenuItem(),miRestart,miExit);
        Menu menuHelp = new Menu("Help",null, miRules,miAbout);
        MenuBar menuBar = new MenuBar(menuGame,menuHelp);
        setTop(menuBar);
        setCenter(gameboardView);
        setBottom(btnCheck);
        BorderPane.setAlignment(btnCheck, Pos.CENTER);
        setMargin(btnCheck, new Insets(0, 10, 10, 10));
        setMargin(gameboardView, new Insets(10));
    }

    Button getBtnCheck() {
        return btnCheck;
    }

    GameboardView getGameboardView() {
        return gameboardView;
    }

    MenuItem getMiExit() {
        return miExit;
    }

    MenuItem getMiRestart() {
        return miRestart;
    }

    MenuItem getMiLoad() {
        return miLoad;
    }

    MenuItem getMiSave() {
        return miSave;
    }

    MenuItem getMiSettings() {
        return miSettings;
    }

    MenuItem getMiAbout() {
        return miAbout;
    }

    MenuItem getMiRules() {
        return miRules;
    }
}
