package be.kdg.examen.klassement.archiefstukken;

import be.kdg.examen.klassement.archiefhouders.ArchiefHouder;

import java.time.LocalDateTime;

// gegeven, mag je wijzigen
public final class Kaart extends Archiefstuk {

    // niet-gegeven
    public Kaart() {
        super(LocalDateTime.now());
    }

    @Override
    public ArchiefHouder.Soort hoortIn() {
        return ArchiefHouder.Soort.KokerType;
    }

    @Override
    public double getOmvang() {
        return 0;
    }
}