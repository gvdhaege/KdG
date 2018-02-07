package be.kdg.stadhuis.view;

import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class StadhuisPane extends VBox {
    private static final Image IMAGE = new Image("be/kdg/stadhuis/view/images/stadhuis.jpg");

    private ImageView imageView;
    private RadioButton normal;
    private RadioButton blackAndWhite;
    private RadioButton sepia;

    public StadhuisPane() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.setPadding(new Insets(15.0, 15.0, 15.0, 15.0));
        this.setSpacing(15.0);

        this.imageView = new ImageView(IMAGE);

        final ToggleGroup group = new ToggleGroup();

        this.normal = new RadioButton("Normal");
        this.normal.setToggleGroup(group);
        this.normal.setSelected(true);

        this.blackAndWhite = new RadioButton("Black & White");
        this.blackAndWhite.setToggleGroup(group);

        this.sepia = new RadioButton("Sepia");
        this.sepia.setToggleGroup(group);
    }

    private void layoutNodes() {
        this.getChildren().add(this.imageView);
        this.getChildren().add(this.normal);
        this.getChildren().add(this.blackAndWhite);
        this.getChildren().add(this.sepia);
    }

    RadioButton getNormal() {
        return normal;
    }

    RadioButton getBlackAndWhite() {
        return blackAndWhite;
    }

    RadioButton getSepia() {
        return sepia;
    }

    void resetEffect() {
        this.imageView.setEffect(null);
    }

    void applyBlackAndWhiteEffect() {
        ColorAdjust blackAndWhite = new ColorAdjust();
        blackAndWhite.setSaturation(-1.0);
        this.imageView.setEffect(blackAndWhite);
    }

    void applySepiaEffect() {
        SepiaTone sepiaTone = new SepiaTone();
        sepiaTone.setLevel(0.8);
        this.imageView.setEffect(sepiaTone);
    }
}
