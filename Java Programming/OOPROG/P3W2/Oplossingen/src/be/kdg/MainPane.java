package be.kdg;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainPane extends GridPane {
    private static final double BUTTON_WIDTH = 200.0;

    public MainPane() {
        this.setPadding(new Insets(15.0, 15.0, 15.0, 15.0));
        this.setVgap(15.0);
        this.setHgap(15.0);

        final Button mailingList = new Button("Dobbelen");
        mailingList.setMinWidth(BUTTON_WIDTH);
        mailingList.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.dobbelen.Main().start(new Stage())
                )
        );
        this.add(mailingList, 0, 0);

        final Button rekenmachine = new Button("Rekenmachine");
        rekenmachine.setMinWidth(BUTTON_WIDTH);
        rekenmachine.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.rekenmachine.Main().start(new Stage())
                )
        );
        this.add(rekenmachine, 0, 4);

        final Button scramble = new Button("Scramble");
        scramble.setMinWidth(BUTTON_WIDTH);
        scramble.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.scramble.Main().start(new Stage())
                )
        );
        this.add(scramble, 0, 1);

        final Button stadhuis = new Button("Stadhuis");
        stadhuis.setMinWidth(BUTTON_WIDTH);
        stadhuis.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.stadhuis.Main().start(new Stage())
                )
        );
        this.add(stadhuis, 0, 2);

        final Button studenten = new Button("Studenten");
        studenten.setMinWidth(BUTTON_WIDTH);
        studenten.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.studenten.Main().start(new Stage())
                )
        );
        this.add(studenten, 0, 3);

        final Button tijd = new Button("Tijd");
        tijd.setMinWidth(BUTTON_WIDTH);
        tijd.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.tijd.Main().start(new Stage())
                )
        );
        this.add(tijd, 0, 5);

        final Button batman = new Button("Batman");
        batman.setMinWidth(BUTTON_WIDTH);
        batman.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.batman.Main().start(new Stage())
                )
        );
        this.add(batman, 0, 6);

        final Button formulier = new Button("Tegels");
        formulier.setMinWidth(BUTTON_WIDTH);
        formulier.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.tegels.Main().start(new Stage())
                )
        );
        this.add(formulier, 0, 7);

        final Button texasHoldem = new Button("Texas Hold'em");
        texasHoldem.setMinWidth(BUTTON_WIDTH);
        texasHoldem.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.texasholdem.Main().start(new Stage())
                )
        );
        this.add(texasHoldem, 0, 8);
    }
}
