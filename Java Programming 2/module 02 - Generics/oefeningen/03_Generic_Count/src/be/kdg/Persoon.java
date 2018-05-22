package be.kdg;

import java.util.Objects;

public class Persoon implements Comparable<Persoon> {
    private String naam;
    private int leeftijd;

    /**
     * Maakt een object van het type persoon
     * @param naam de voornaam van de persoon
     * @param leeftijd de leeftijd van de persoon
     */
    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

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
