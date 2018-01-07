package be.kdg.examen.klassement.archiefstukken;

import be.kdg.examen.klassement.archiefhouders.ArchiefHouder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

// gegeven, mag je wijzigen
public final class Boek extends Archiefstuk {

    // gegeven
    private static final double KAFT_DIKTE = 0.006;
    private static final double PAPIER_DIKTE = 0.004;
    private final double lengte = 0.29, breedte = 0.21;

    // niet-gegeven
    private final int aantalPaginas;
    private final Random random = new Random();

    private double omvang;

    public Boek() {
        super(LocalDateTime.now());
        aantalPaginas = 10 + random.nextInt(1000);
        setOmvang(aantalPaginas);
    }

    private void setOmvang(int aantalPaginas) {
        double hoogte = (aantalPaginas * PAPIER_DIKTE) + 2 * KAFT_DIKTE;
        double oppervlakte = breedte * lengte;
        this.omvang = oppervlakte * hoogte;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return String.format("boek (%s, %4dp, %.2fm³)", getArchiveringsDatum().format(formatter), aantalPaginas, getOmvang());
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
