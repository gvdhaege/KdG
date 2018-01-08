package be.kdg.verjaardagen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Kristiaan Behiels
 * @version 1.0 12/12/2014 21:54
 */
public class Persoon {
    private LocalDate verjaardag;
    private String naam;

    public Persoon(LocalDate verjaardag, String naam) {
        this.verjaardag = verjaardag;
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public LocalDate getVerjaardag() {
        return verjaardag;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM");
        String datum = verjaardag.format(formatter);
        return String.format("%-10s %s", naam, datum);
    }
}
