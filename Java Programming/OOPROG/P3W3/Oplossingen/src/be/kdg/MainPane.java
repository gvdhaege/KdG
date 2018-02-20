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

        final Button raster = new Button("Raster");
        raster.setMinWidth(BUTTON_WIDTH);
        raster.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.raster.Main().start(new Stage())
                )
        );
        this.add(raster, 0, 0);

        final Button rasterUitbr = new Button("Raster Uitbr.");
        rasterUitbr.setMinWidth(BUTTON_WIDTH);
        rasterUitbr.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.raster_uitbreiding.Main().start(new Stage())
                )
        );
        this.add(rasterUitbr, 0, 1);

        final Button wtc = new Button("World Trade Center");
        wtc.setMinWidth(BUTTON_WIDTH);
        wtc.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.wtc.Main().start(new Stage())
                )
        );
        this.add(wtc, 0, 2);

        final Button simon = new Button("Engels");
        simon.setMinWidth(BUTTON_WIDTH);
        simon.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.engels.Main().start(new Stage())
                )
        );
        this.add(simon, 0, 3);

        final Button voetbal = new Button("Voetbal");
        voetbal.setMinWidth(BUTTON_WIDTH);
        voetbal.setOnAction(event ->
                Platform.runLater(() ->
                        new be.kdg.voetbal.Main().start(new Stage())
                )
        );
        this.add(voetbal, 0, 4);
    }
}
