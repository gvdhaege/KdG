package be.kdg.figuren;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kristiaan Behiels
 * @version 1.1 21-okt-2013
 */

/*
Deze klasse heeft als attributen een tabel van objecten van de klasse RuimteFiguur met de naam figuren.
Voorzie een constructor die de tabel figuren maakt (voorzie 5 elementen).
Voorzie een methode om voor elk van de figuren de toonFiguur-methode op te roepen.
Zie de klasse TestRuimteFiguren voor de verwachte afdruk.
 */

public class RuimteFiguren {
    private RuimteFiguur[] figuren;

    public RuimteFiguren() {
        figuren = new RuimteFiguur[5];
        vulTabel();
    }

    private void vulTabel() {
        figuren[0] = new Bol();
        figuren[1] = new Kubus(2.0);
        figuren[2] = new Cilinder("groen", 2.0, 5.0);
        figuren[3] = new Kubus("geel", 3.0);
        figuren[4] = new Bol("rood", 2.0);
    }

    public void toonFiguren() {
        for (RuimteFiguur figuur : figuren) {
            figuur.toonFiguur();
        }
    }
}

