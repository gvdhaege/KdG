import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class AngryBirdsView extends BorderPane {
    private MenuBar menuBar;
    private Menu menu;
    private MenuItem menuItem;
    private CheckBox checkBox;

    public AngryBirdsView() {
        initialisatieNodes();
        layoutNodes();
    }

    private void initialisatieNodes() {
        Image image = new Image("images/angrybird.png");
        this.menuItem = new MenuItem("Afsluiten", new ImageView(image));
        this.menu = new Menu("Bestand", new ImageView(image), menuItem);
        this.menuBar = new MenuBar(menu);
//        Label label  = new Label("", new ImageView(image));
        this.checkBox = new CheckBox();
    }

    private void layoutNodes() {
        this.setTop(menuBar);
        BorderPane.setMargin(menuBar, new Insets(0.0, 0.0, 100.0, 0.0));
        this.setCenter(checkBox);
    }
}
