package be.kdg.examen.klassement.archiefhouders;

import be.kdg.examen.klassement.archiefstukken.Archiefstuk;

// gegeven, mag je wijzigen
public class Koker implements ArchiefHouder {
    private final double HOOGTE = 0.450;
    private final double STRAAL = 0.25;

    private Archiefstuk kaart;

    @Override
    public double getMaxVolume() {
        return 2 * Math.PI * (STRAAL * STRAAL) * HOOGTE;
    }

    @Override
    public boolean isVol() {
        return kaart != null;
    }

    @Override
    public void stockeer(Archiefstuk archiefstuk) {
        kaart = archiefstuk;
    }


// hier aanvullen

}

