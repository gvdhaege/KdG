package be.kdg.batman.view;

import be.kdg.batman.model.Game;
import be.kdg.batman.view.pow.PowPane;
import be.kdg.batman.view.wham.WhamPane;
import be.kdg.batman.view.zap.ZapPane;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class BatmanPresenter {
    private final Game model;
    private final PowPane view1;
    private final WhamPane view2;
    private final ZapPane view3;

    public BatmanPresenter(Game model, PowPane view1, WhamPane view2, ZapPane view3) {
        this.model = model;
        this.view1 = view1;
        this.view2 = view2;
        this.view3 = view3;

        this.addEventHandlers();
    }

    private void addEventHandlers() {
        EventHandler<MouseEvent> eventHandler = event -> {
            this.model.nextGamePhase();
            this.updateView();
        };

        this.view1.setOnMouseClicked(eventHandler);
        this.view2.setOnMouseClicked(eventHandler);
        this.view3.setOnMouseClicked(eventHandler);
    }

    private void updateView() {
        final BorderPane previousView;
        final BorderPane currentView;
        switch(this.model.getGamePhase()) {
            case POW:
                previousView = this.view3;
                currentView = this.view1;
                break;
            case WHAM:
                previousView = this.view1;
                currentView = this.view2;
                break;
            case ZAP:
                previousView = this.view2;
                currentView = this.view3;
                break;
            default:
                previousView = null;
                currentView = null;
        }
        final Scene scene = previousView.getScene();
        scene.setRoot(currentView);
    }
}
