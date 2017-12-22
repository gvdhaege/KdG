package data;

import java.util.Objects;

public class Artikel implements Comparable<Artikel>{
    private String naam;
    private double prijs;

    public Artikel(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artikel artikel = (Artikel) o;
        return Double.compare(artikel.prijs, prijs) == 0 &&
                Objects.equals(naam, artikel.naam);
    }

    @Override
    public int hashCode() {

        return Objects.hash(naam, prijs);
    }

    @Override
    public int compareTo(Artikel artikel){
        return this.naam.compareTo(artikel.naam);
    }
}
