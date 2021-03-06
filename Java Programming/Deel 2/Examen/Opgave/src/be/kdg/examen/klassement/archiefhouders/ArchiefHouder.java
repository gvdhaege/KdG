package be.kdg.examen.klassement.archiefhouders;

import be.kdg.examen.klassement.archiefstukken.Archiefstuk;

public interface ArchiefHouder {
    enum Soort {
        DoosType, KokerType
    }

    default double vullingsGraad() {
        return 1.0;
    }

    void stockeer(Archiefstuk archiefstuk);

    double getMaxVolume();

    boolean isVol();
}
