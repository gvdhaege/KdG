package be.kdg.examen.klassement.archiefhouders;

import be.kdg.examen.klassement.archiefstukken.Archiefstuk;

// gegeven, mag je wijzigen
public interface ArchiefHouder {

    // gegeven
    enum Soort {
        DoosType, KokerType;
    }

    // niet-gegeven
    void stockeer(Archiefstuk archiefstuk);

    default double vullingsGraad() {return 1.0;}

    double getVolume();

    boolean isVol();

}
