package be.kdg.count;

import java.util.Objects;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    // Alternatieve versie met de klasse Objects (vanaf JDK 7)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoon persoon = (Persoon) o;
        return leeftijd == persoon.leeftijd &&
                Objects.equals(naam, persoon.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, leeftijd);
    }

    @Override
    public String toString() {
        return naam + " " + leeftijd;
    }
}
