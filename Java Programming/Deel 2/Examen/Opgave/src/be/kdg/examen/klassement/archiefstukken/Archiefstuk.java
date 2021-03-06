package be.kdg.examen.klassement.archiefstukken;

import be.kdg.examen.klassement.archiefhouders.ArchiefHouder;

import java.time.LocalDateTime;

// gegeven, mag je wijzigen
public abstract class Archiefstuk implements Comparable<Archiefstuk> {

    // gegeven, mag je niet wijzigen
    private LocalDateTime archiveringsDatum;

    // gegeven, mag je niet wijzigen
    public Archiefstuk(LocalDateTime archiveringsDatum) {
        this.archiveringsDatum = archiveringsDatum;
    }

    public LocalDateTime getArchiveringsDatum() {
        return archiveringsDatum;
    }

    @Override
    public int compareTo(Archiefstuk o) {
        return Double.compare(getOmvang(), o.getOmvang());
    }

    public abstract double getOmvang();

    public abstract ArchiefHouder.Soort hoortIn();
    // hier aanvullen
}
