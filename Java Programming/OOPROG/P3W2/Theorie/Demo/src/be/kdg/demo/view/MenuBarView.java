package be.kdg.demo.view;

import javafx.geometry.Insets;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class MenuBarView extends BorderPane {
    private MenuItem afsluiten;
    public MenuBarView() {
        this.initialiseNodes();
        this.layoutNodes();
    }
    private void initialiseNodes() {
        this.afsluiten = new MenuItem("Afsluiten");
    }
    private void layoutNodes() {
        final Menu bestandMenu = new Menu("Bestand", null, this.afsluiten);
        final MenuBar menuBar = new MenuBar(bestandMenu);
        this.setTop(menuBar);
        BorderPane.setMargin(menuBar, new Insets(0.0, 0.0, 100.0, 0.0));
    }
}
