package be.kdg.examen.klassement.archiefstukken;

import be.kdg.examen.klassement.archiefhouders.ArchiefHouder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// gegeven, mag je wijzigen
public final class Kaart extends Archiefstuk {

    public Kaart() {
        super(LocalDateTime.now());
    }

    @Override
    public double getOmvang() {
        return 0;
    }

    @Override
    public ArchiefHouder.Soort hoortIn() {
        return ArchiefHouder.Soort.KokerType;
    }

    // hier aanvullen
}