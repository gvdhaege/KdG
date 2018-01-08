package be.kdg.demo;

/**
 * @author Kristiaan Behiels
 * @version 1.0 13/12/13
 */
public class Persoon implements Comparable<Persoon> {
    private int id;
    private String naam;
    private Adres adres;

    public Persoon(int id, String naam, Adres adres) {
        this.id = id;
        this.naam = naam;
        this.adres = adres;
    }

    public int getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public Adres getAdres() {
        return adres;
    }

    @Override
    public boolean equals(Object anderePersoon) {
        if (this == anderePersoon) return true;
        if (anderePersoon == null || getClass() != anderePersoon.getClass()) return false;

        Persoon persoon = (Persoon) anderePersoon;

        return id == persoon.id;

    }

    @Override
    public int hashCode() {
        return id;
    }


    @Override
    public int compareTo(Persoon anderePersoon) {
        return id - anderePersoon.id;
    }

    @Override
    public String toString() {
        return String.format("%3d %-20s %s", id, naam, adres.toString());
    }
}
