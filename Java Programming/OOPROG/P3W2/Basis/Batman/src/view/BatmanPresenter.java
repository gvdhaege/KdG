package view;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import model.Game;
import view.pow.PowPane;
import view.wham.WhamPane;
import view.zap.ZapPane;

public class BatmanPresenter {
    private Game model;
    private PowPane powView;
    private WhamPane whamView;
    private ZapPane zapView;

    public BatmanPresenter(Game model, PowPane powView, WhamPane whamView, ZapPane zapView) {
        this.model = model;
        this.powView = powView;
        this.whamView = whamView;
        this.zapView = zapView;

        addEventHandlers();
    }

    private void addEventHandlers() {
        powView.setOnMouseClicked(getMouseEventEventHandler());
        whamView.setOnMouseClicked(getMouseEventEventHandler());
        zapView.setOnMouseClicked(getMouseEventEventHandler());
    }

    private EventHandler<MouseEvent> getMouseEventEventHandler() {
        return event -> {
            model.nextGamePhase();
            updateView();
        };
    }

    private void updateView() {
        final BorderPane previous;
        final BorderPane current;

        switch (this.model.getGamePhase()) {
            case POW:
                previous = zapView;
                current = powView;
                break;
            case WHAM:
                previous = powView;
                current = whamView;
                break;
            case ZAP:
                previous = whamView;
                current = zapView;
                break;
            default:
                previous = null;
                current = null;
        }
        final Scene scene = previous.getScene();
        scene.setRoot(current);
    }
}


//4 AFHANDELEN EVENTS
//        De BatmanPresenter klasse zorgt voor de afhandeling van events. Telkens de gebruiker ergens in het venster klikt moet er overgegaan worden naar de volgende fase van het spel.
//        De volgorde is: powwhamzappowwhamzappowwhamzap... Met bijhorende view klassen: PowPane  WhamPane  ZapPane  PowPane  ...
//        • Zorg voor vier attributen: een attribuut voor het model en een attribuut elk van de drie views waar deze presenter mee werkt.
//        • Implementeer de constructor: zorg er voor dat elk van de vier attributen een waarde krijgt. Hiervoor gebruiken we vier parameters.
//        4.1 DemethodeaddEventHandlers
//        Voeg de methode addEventHandlers toe aan BatmanPresenter en zorg er voor dat ze opgeroepen wordt in de constructor.
//        In de methode addEventHandlers:
//        • Hang een event handler aan elk van de drie views. We hangen m.a.w. een event handler aan de views zelf (dit zijn BorderPanes) en niet aan controls binnenin de views.
//        • We willen dat onze event handler opgeroepen wordt wanneer de gebruiker met de muis
//        klikt in een view, dus we werken met setOnMouseClicked en niet met setOnAction! • De event handler doet het volgende:
//        1. Hetmodelwordtnaardevolgendespelfasegebracht(nextGamePhase).
//        2. DeupdateViewmethodewordtopgeroepen(zie4.2).
//        • Extra: Je kan werken met één instantie van de event handler en deze ene instantie
//        meegeven als parameter bij elke oproep van setOnMouseClicked. Op deze manier hoef je geen nieuwe event handler aan te maken voor elke setOnMouseClicked.
//        4.2 DemethodeupdateView
//        Voeg de methode updateView toe aan BatmanPresenter, we roepen deze methode niet op in
//        de constructor.
//        In de methode updateView:
//        • Raadpleeg het model om te achterhalen wat de huidige spelfase is.
//        • Op basis van de huidige spelfase bepaal je de vorige spelfase.
//        • Gebruik de view die hoort bij de vorige spelfase om een Scene object te verkrijgen:
//        Scene scene = someView.getScene();
//        • Op de Scene plaats je de view die hoort bij de huidige spelfase:
//        Scene.setRoot(anotherView);