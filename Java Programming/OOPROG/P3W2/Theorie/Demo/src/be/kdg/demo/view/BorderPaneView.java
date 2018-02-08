package be.kdg.demo.view;

import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class BorderPaneView extends BorderPane {
    private TextArea dictee;
    private MenuItem afsluiten;
    private Label status;
    public BorderPaneView() {
        this.initialiseNodes();
        this.layoutNodes();
    }
    private void initialiseNodes() {
        this.dictee = new TextArea();
        this.afsluiten = new MenuItem("Exit");
        this.status = new Label("Waiting for text.");
        this.status.setStyle("-fx-background-color: orange");
    }
    private void layoutNodes() {
        Menu bestandMenu = new Menu("Bestand", null, afsluiten);
        MenuBar menuBar = new MenuBar(bestandMenu);
        this.setCenter(dictee);
        this.setTop(menuBar);
        this.setBottom(status);
        status.setMaxWidth(Double.MAX_VALUE);
    }
}
