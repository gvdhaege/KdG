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
        final Button batman = new Button("Dobbelen");
        batman.setMinWidth(BUTTON_WIDTH);
        batman.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.dobbelen.Main().start(new Stage())
                )
        );
        this.add(batman, 0, 0);

        final Button dobbelstenen = new Button("Scramble");
        dobbelstenen.setMinWidth(BUTTON_WIDTH);
        dobbelstenen.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.scramble.Main().start(new Stage())
                )
        );
        this.add(dobbelstenen, 0, 1);

        final Button formulier = new Button("Studenten");
        formulier.setMinWidth(BUTTON_WIDTH);
        formulier.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.studenten.Main().start(new Stage())
                )
        );
        this.add(formulier, 0, 2);

        final Button rekenmachine = new Button("Stadhuis");
        rekenmachine.setMinWidth(BUTTON_WIDTH);
        rekenmachine.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.stadhuis.Main().start(new Stage())
                )
        );
        this.add(rekenmachine, 0, 3);

        final Button ssp = new Button("Rekenmachine");
        ssp.setMinWidth(BUTTON_WIDTH);
        ssp.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.rekenmachine.Main().start(new Stage())
                )
        );
        this.add(ssp, 0, 4);
    }
}
