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

        final Button batman = new Button("Contact");
        batman.setMinWidth(BUTTON_WIDTH);
        batman.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.contact.Main().start(new Stage())
                )
        );
        this.add(batman, 0, 0);

        final Button contact = new Button("Resize");
        contact.setMinWidth(BUTTON_WIDTH);
        contact.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.resize.Main().start(new Stage())
                )
        );
        this.add(contact, 0, 1);

        final Button ssp = new Button("Boodschap");
        ssp.setMinWidth(BUTTON_WIDTH);
        ssp.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.boodschap.Main().start(new Stage())
                )
        );
        this.add(ssp, 0, 2);

        final Button memory = new Button("Studenten");
        memory.setMinWidth(BUTTON_WIDTH);
        memory.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.studenten.Main().start(new Stage())
                )
        );
        this.add(memory, 0, 3);

        final Button fly = new Button("Mailing list");
        fly.setMinWidth(BUTTON_WIDTH);
        fly.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.mailinglist.Main().start(new Stage())
                )
        );
        this.add(fly, 0, 4);
    }
}
