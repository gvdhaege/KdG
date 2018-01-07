package be.kdg.examen.klassement.archiefhouders;

import be.kdg.examen.klassement.archiefstukken.Archiefstuk;

// gegeven, mag je wijzigen
public class Koker implements ArchiefHouder {

    // gegeven, mag je wijzigen
    private final double straal = 0.25;
    private final double hoogte = 0.450;

    // niet-gegeven
    private Archiefstuk kaart;

    // niet-gegeven
    @Override
    public void stockeer(Archiefstuk archiefstuk) {
        kaart = archiefstuk;
    }

    @Override
    public double getVolume() {
        return 2 * Math.PI * straal * straal * hoogte;
    }

    public boolean isVol() {
        return kaart == null ? false : true;
    }
}

