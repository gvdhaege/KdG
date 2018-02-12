package be.kdg.texasholdem.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class GamePane extends VBox {
    private Label boardLabel;
    private ImageView[] boardImages;
    private Label pocketLabel;
    private ImageView[] pocketImages;
    private Label brLabel;
    private Label brValueLabel;
    private Button nextPhase;
    private Button restart;

    public GamePane() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.boardLabel = new Label("Board");
        this.boardImages = new ImageView[] {
                new ImageView(),
                new ImageView(),
                new ImageView(),
                new ImageView(),
                new ImageView()
        };
        this.pocketLabel = new Label("Pocket");
        this.pocketImages = new ImageView[] {
                new ImageView(),
                new ImageView()
        };
        this.brLabel = new Label("Betting Round: ");
        this.brValueLabel = new Label();
        this.nextPhase = new Button("Next Betting Round");
        this.restart = new Button("Restart");
    }

    private void layoutNodes() {
        this.setPadding(ViewConstants.INSETS);
        this.setSpacing(ViewConstants.SPACING);
        this.setAlignment(Pos.CENTER_LEFT);

        this.boardLabel.setFont(ViewConstants.LARGE_LABEL_FONT);
        this.pocketLabel.setFont(ViewConstants.LARGE_LABEL_FONT);
        this.brLabel.setFont(ViewConstants.LARGE_LABEL_FONT);
        this.brValueLabel.setFont(ViewConstants.LARGE_LABEL_FONT);
        this.brValueLabel.setTextFill(Color.BLUE);
        this.nextPhase.setMinWidth(160.0);
        this.restart.setMinWidth(160.0);

        final HBox boardPane = new HBox();
        boardPane.setSpacing(ViewConstants.SPACING);
        for (ImageView imageView : this.boardImages) {
            boardPane.getChildren().add(imageView);
        }

        final HBox pocketPane = new HBox();
        pocketPane.setSpacing(ViewConstants.SPACING);
        pocketPane.setAlignment(Pos.CENTER);
        for (ImageView imageView : this.pocketImages) {
            pocketPane.getChildren().add(imageView);
        }

        final HBox bettingRoundPane = new HBox();
        bettingRoundPane.getChildren().add(this.brLabel);
        bettingRoundPane.getChildren().add(this.brValueLabel);

        this.getChildren().add(this.boardLabel);
        this.getChildren().add(boardPane);
        this.getChildren().add(this.pocketLabel);
        this.getChildren().add(pocketPane);
        this.getChildren().add(bettingRoundPane);
        this.getChildren().add(this.nextPhase);
        this.getChildren().add(this.restart);
    }

    Button getNextPhase() {
        return nextPhase;
    }

    Button getRestart() {
        return restart;
    }

    Label getBrValueLabel() {
        return brValueLabel;
    }

    void setBoardImage(int index, Image cardImage) {
        this.boardImages[index].setImage(cardImage);
    }

    void setPocketImage(int index, Image cardImage) {
        this.pocketImages[index].setImage(cardImage);
    }
}
