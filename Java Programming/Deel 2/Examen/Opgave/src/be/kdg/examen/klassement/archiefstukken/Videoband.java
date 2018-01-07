package be.kdg.examen.klassement.archiefstukken;

import be.kdg.examen.klassement.archiefhouders.ArchiefHouder;

import java.time.LocalDateTime;

// gegeven, mag je wijzigen
public final class Videoband extends Archiefstuk {
    private static final double LENGTE_BAND = 0.187;
    private static final double BREEDTE_BAND = 0.103;
    private static final double HOOGTE_BAND = 0.025;

    private double afmetingen;

    public Videoband() {
        super(LocalDateTime.now());
        setAfmetingen();
    }

    private void setAfmetingen() {
        this.afmetingen = LENGTE_BAND * BREEDTE_BAND * HOOGTE_BAND;
    }

    @Override
    public double getOmvang() {
        return afmetingen;
    }

    @Override
    public ArchiefHouder.Soort hoortIn() {
        return ArchiefHouder.Soort.DoosType;
    }

    // hier aanvullen
}
