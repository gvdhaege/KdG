package be.kdg.examen.klassement.archiefstukken;

import be.kdg.examen.klassement.archiefhouders.ArchiefHouder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

// gegeven, mag je wijzigen
public final class Boek extends Archiefstuk {
    private static final double LENGTE_PAPIER = 0.29;
    private static final double BREEDTE_PAPIER = 0.21;
    private static final double DIKTE_PAGINA = 0.004;
    private static final double DIKTE_KAFT = 0.006;
    private final Random random = new Random();

    private final int aantalPaginas;
    private double afmetingen;

    public Boek() {
        super(LocalDateTime.now());
        this.aantalPaginas = 10 + random.nextInt(1000);
        setAfmetingen(this.aantalPaginas);
    }

    private void setAfmetingen(int aantalPaginas) {
        double hoogte = (aantalPaginas * DIKTE_PAGINA) + (2 * DIKTE_KAFT);
        double oppervlakte = LENGTE_PAPIER * BREEDTE_PAPIER;
        this.afmetingen = oppervlakte * hoogte;
    }

    @Override
    public double getOmvang() {
        return afmetingen;
    }

    @Override
    public ArchiefHouder.Soort hoortIn() {
        return ArchiefHouder.Soort.DoosType;
    }

    @Override
    public String toString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return String.format("boek (%s, %4dp, %.2fm²)", getArchiveringsDatum().format(dateTimeFormatter), aantalPaginas, getOmvang());
    }
    // hier aanvullen
}
