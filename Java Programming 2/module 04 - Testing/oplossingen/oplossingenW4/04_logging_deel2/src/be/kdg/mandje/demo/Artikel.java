package be.kdg.mandje.demo;

import java.util.Objects;

public class Artikel implements Comparable<Artikel> {
    private String naam;
    private double prijs;

    public Artikel(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    String getNaam() {
        return naam;
    }

    double getPrijs() {
        return prijs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artikel artikel = (Artikel) o;
        return Objects.equals(naam, artikel.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam);
    }

    @Override
    public int compareTo(Artikel anderArtikel) {
        return this.naam.compareTo(anderArtikel.naam);
    }
}
