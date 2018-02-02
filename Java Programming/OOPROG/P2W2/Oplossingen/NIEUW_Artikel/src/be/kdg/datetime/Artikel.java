package be.kdg.datetime;

import java.time.LocalDate;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25/10/2014
 */
public class Artikel {
    String naam;
    int nummer;
    LocalDate productieDatum;

    public Artikel(String naam, int nummer, LocalDate productieDatum) {
        this.naam = naam;
        this.nummer = nummer;
        this.productieDatum = productieDatum;
    }

    public LocalDate getProductieDatum() {
        return productieDatum;
    }

    @Override
    public String toString() {
        return String.format("%-12s %04d %s", naam, nummer, productieDatum);
    }
}
