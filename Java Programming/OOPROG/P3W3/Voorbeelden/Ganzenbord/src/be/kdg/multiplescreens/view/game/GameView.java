package be.kdg.multiplescreens.view.game;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

/**
 * Created by vochtenh on 17/02/2016.
 */
public class GameView extends BorderPane {
    private MenuItem miAbout;

    public GameView() {
        miAbout = new MenuItem("About");
        layoutNodes();
    }

    private void layoutNodes() {
        setCenter(new ImageView(new Image("resources/images/ganzenbord.jpg")));
        Menu mnHelp = new Menu("Help");
        mnHelp.getItems().addAll(miAbout);
        MenuBar menuBar = new MenuBar(mnHelp);
        setTop(menuBar);
    }

    MenuItem getMiAbout() {
        return miAbout;
    }
}
