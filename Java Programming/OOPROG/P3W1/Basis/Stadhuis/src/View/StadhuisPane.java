package View;

import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;


public class StadhuisPane extends VBox {
    private RadioButton choiceNormal;
    private RadioButton choiceBlackWhite;
    private RadioButton choiceSepia;
    private ImageView imageStadhuis;

    public StadhuisPane() {
        initialisatieNodes();
        layoutNodes();
    }

    private void initialisatieNodes() {
        ToggleGroup choices = new ToggleGroup();
        this.setPadding(new Insets(15, 15, 15, 15));
        this.setSpacing(15);

        choiceNormal = new RadioButton("Normaal");
        choiceNormal.setToggleGroup(choices);
        choiceNormal.setSelected(true);

        choiceBlackWhite = new RadioButton("Zwart-Wit");
        choiceBlackWhite.setToggleGroup(choices);

        choiceSepia = new RadioButton("Sepia");
        choiceSepia.setToggleGroup(choices);

        imageStadhuis = new ImageView(new Image("View/images/stadhuis.jpg"));

    }

    private void layoutNodes() {
        this.getChildren().add(imageStadhuis);
        this.getChildren().add(choiceNormal);
        this.getChildren().add(choiceBlackWhite);
        this.getChildren().add(choiceSepia);
    }

    void resetEffect() {
        imageStadhuis.setEffect(null);
    }

    void applyBlackAndWhiteEffect() {
        ColorAdjust blackAndWhite = new ColorAdjust();
        blackAndWhite.setSaturation(-1.0);
        imageStadhuis.setEffect(blackAndWhite);
    }

    void applySepiaEffect() {
        SepiaTone sepiaTone = new SepiaTone();
        sepiaTone.setLevel(0.8);
        imageStadhuis.setEffect(sepiaTone);
    }


    RadioButton getChoiceNormal() {
        return choiceNormal;
    }

    RadioButton getChoiceBlackWhite() {
        return choiceBlackWhite;
    }

    RadioButton getChoiceSepia() {
        return choiceSepia;
    }
}
