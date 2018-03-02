package be.kdg.mastermind.view.mastermind;

import be.kdg.mastermind.Log;
import be.kdg.mastermind.model.*;
import be.kdg.mastermind.view.about.AboutPresenter;
import be.kdg.mastermind.view.about.AboutView;
import be.kdg.mastermind.view.help.HelpPresenter;
import be.kdg.mastermind.view.help.HelpView;
import be.kdg.mastermind.view.settings.SettingsPresenter;
import be.kdg.mastermind.view.settings.SettingsView;
import javafx.animation.ScaleTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.util.Duration;

/**
 * Created by vochtenh on 16/02/2016.
 */
public class MastermindPresenter {
    private Mastermind model;
    private MastermindView view;

    public MastermindPresenter(Mastermind model, MastermindView view) {
        this.model = model;
        this.view = view;
        updateView();
        addEventHandlers();
    }


    private void updateView() {
        if (model.gameFinished()) {
            showFinishedDialog();
        }
        //show all guesses and all hints
        //all guesses:
        int counter = 0;
        for (Combination guess : model.getGuesses()) {
            int rowNrInView = model.getMaxNumberOfGuesses() - counter - 1;
            CombinationPresenter combinationPresenter = view.getGameboardView().getCombinationPresenters()[rowNrInView];
            combinationPresenter.setModel(guess);
            combinationPresenter.setIsEnabled(false);
            counter++;
        }
        //all hints
        counter = 0;
        for (Hint hint : model.getHints()) {
            int rowNrInView = model.getMaxNumberOfGuesses() - counter - 1;
            HintView hintView = view.getGameboardView().getHintViews()[rowNrInView];
            Circle[] circles = hintView.getCircles();
            for (int i = 0; i < hint.size(); i++) {
                if (hint.getHintColor(i) == HintColor.BLACK) {
                    circles[i].setFill(Color.BLACK);
                } else if (hint.getHintColor(i) == HintColor.WHITE) {
                    circles[i].setFill(Color.WHITE);
                }
                if (counter==model.getNumberOfGuessesDone()-1){
                    ScaleTransition st = new ScaleTransition(Duration.millis(500), circles[i]);
                    st.setFromX(0);
                    st.setToX(1);
                    st.setFromY(0);
                    st.setToY(1);
                    st.play();
                }
            }
            counter++;
        }
        int rowNrInView = model.getMaxNumberOfGuesses() - model.getNumberOfGuessesDone();
        CombinationPresenter combinationPresenter = view.getGameboardView().getCombinationPresenters()[rowNrInView - 1];
        combinationPresenter.setIsEnabled(true);
    }

    private void addEventHandlers() {
        addMenuEventHandlers();
        view.getBtnCheck().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //create new Combination object and doGuess!
                int rowNumber = model.getMaxNumberOfGuesses() - model.getNumberOfGuessesDone() - 1;
                CombinationPresenter combinationPresenter = view.getGameboardView().getCombinationPresenters()[rowNumber];
                Combination combination = combinationPresenter.getCombination();
                if (combination==null) return;
                try {
                    model.doGuess(combination);
                    updateView();
                } catch (MastermindException me) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Unable to make guess:");
                    alert.setContentText(me.getMessage());
                    alert.showAndWait();
                }
            }
        });
    }

    private void addMenuEventHandlers() {
        view.getMiExit().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });
        view.getMiAbout().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AboutView aboutView = new AboutView();
                new AboutPresenter(model, aboutView);
                Stage aboutStage = new Stage();
                aboutStage.initOwner(view.getScene().getWindow());
                aboutStage.initModality(Modality.APPLICATION_MODAL);
                Scene scene = new Scene(aboutView);
                scene.getStylesheets().add("stylesheets/style.css");
                aboutStage.setScene(scene);
                aboutStage.setX(view.getScene().getWindow().getX());
                aboutStage.setY(view.getScene().getWindow().getY() + 100);
                aboutStage.showAndWait();
            }
        });
        view.getMiSave().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    model.saveGame();
                } catch (MastermindException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Unable to save:");
                    alert.setContentText(e.getMessage());
                    alert.showAndWait();
                }
            }
        });
        view.getMiLoad().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    model.loadGame();
                    MastermindView newView = new MastermindView(model.getCombinationSize(), model.getMaxNumberOfGuesses());
                    view.getScene().setRoot(newView);
                    new MastermindPresenter(model, newView);
                    newView.getScene().getWindow().sizeToScene();
                } catch (MastermindException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Unable to save:");
                    alert.setContentText(e.getMessage());
                    alert.showAndWait();
                }
            }
        });
        view.getMiRules().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                HelpView helpView = new HelpView();
                new HelpPresenter(helpView);
                Stage helpStage = new Stage();
                helpStage.setTitle("Rules of the game");
                helpStage.initOwner(view.getScene().getWindow());
                helpStage.initModality(Modality.APPLICATION_MODAL);
                Scene scene = new Scene(helpView);
                scene.getStylesheets().add("stylesheets/style.css");
                helpStage.setScene(scene);
                helpStage.setX(view.getScene().getWindow().getX());
                helpStage.setY(view.getScene().getWindow().getY() + 100);
                helpStage.showAndWait();
            }
        });
        view.getMiSettings().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SettingsView settingsView = new SettingsView();
                SettingsPresenter presenter = new SettingsPresenter(model, settingsView);
                Stage settingsStage = new Stage();
                settingsStage.setTitle("Settings");
                settingsStage.initOwner(view.getScene().getWindow());
                settingsStage.initModality(Modality.APPLICATION_MODAL);
                Scene scene = new Scene(settingsView);
                scene.getStylesheets().add("stylesheets/style.css");
                settingsStage.setScene(scene);
                settingsStage.setX(view.getScene().getWindow().getX());
                settingsStage.setY(view.getScene().getWindow().getY() + 100);
                settingsStage.showAndWait();
                if (presenter.settingsChanged()) {
                    model.restart();
                    MastermindView newView = new MastermindView(model.getCombinationSize(), model.getMaxNumberOfGuesses());
                    view.getScene().setRoot(newView);
                    new MastermindPresenter(model, newView);
                    newView.getScene().getWindow().sizeToScene();
                }
            }
        });
        view.getMiRestart().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                model.restart();
                MastermindView newView = new MastermindView(model.getCombinationSize(), model.getMaxNumberOfGuesses());
                view.getScene().setRoot(newView);
                new MastermindPresenter(model, newView);
                newView.getScene().getWindow().sizeToScene();
            }
        });
    }

    private void showFinishedDialog() {
        Log.debug("showing finished");
        if (!model.gameFinished()) return;
        ChoiceDialog<String> again = new ChoiceDialog<String>("Ok", "Ok", "Nope");
        if (model.playerLost()) {
            again.setTitle("You Lost!");
            again.setHeaderText("The correct combination was:");
            CombinationView combinationView = new CombinationView();
            new CombinationPresenter(model.getRiddle(), combinationView);
            again.setGraphic(combinationView);
        } else {
            again.setTitle("You Won!");
            again.setGraphic(new ImageView("images/duim.png"));
            again.setHeaderText("You found it in " + model.getNumberOfGuessesDone() + " moves...");
        }
        again.setContentText("You wanna play again?");
        again.showAndWait();
        String result = again.getResult();
        if (result == null || result.equals("Nope")) {
            Platform.exit();
        } else {
            this.model = new Mastermind();
            MastermindView newView = new MastermindView(model.getCombinationSize(), model.getMaxNumberOfGuesses());
            view.getScene().setRoot(newView);
            new MastermindPresenter(model, newView);
        }
    }

    public void addWindowEventHandlers() {
        view.getScene().getWindow().setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setHeaderText("Save game?");
                alert.setContentText("Shall I save the current game?");
                alert.setTitle("Warning!");
                alert.getButtonTypes().clear();
                ButtonType no = new ButtonType("No");
                ButtonType yes = new ButtonType("Yes");
                ButtonType cancel = new ButtonType("Cancel");
                alert.getButtonTypes().addAll(cancel, no, yes);
                alert.showAndWait();
                if (alert.getResult().equals(cancel)) {
                    event.consume();
                } else if (alert.getResult().equals(yes)) {
                    try {
                        model.saveGame();
                    } catch (MastermindException e) {
                        alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Unable to save:");
                        alert.setContentText(e.getMessage());
                        alert.showAndWait();
                    }
                }
            }
        });
    }
}
