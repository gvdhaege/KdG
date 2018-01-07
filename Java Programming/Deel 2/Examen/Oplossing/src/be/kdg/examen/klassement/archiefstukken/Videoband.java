package be.kdg.examen.klassement.archiefstukken;

import be.kdg.examen.klassement.archiefhouders.ArchiefHouder;

import java.time.LocalDateTime;

// gegeven, mag je wijzigen
public final class Videoband extends Archiefstuk {

    // gegeven
    private final double lengte = 0.187;
    private final double breedte = 0.103;
    private final double hoogte = 0.025;

    // niet-gegeven
    private final double omvang;

    public Videoband() {
        super(LocalDateTime.now());
        omvang = lengte * breedte * hoogte;
    }

    @Override
    public ArchiefHouder.Soort hoortIn() {
        return ArchiefHouder.Soort.DoosType;
    }

    @Override
    public double getOmvang() {
        return omvang;
    }
}
