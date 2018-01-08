public class Artikel implements Comparable<Artikel> {
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Artikel artikel = (Artikel) object;

        return naam.equals(artikel.naam);

    }

    public int hashCode() {
        return naam.hashCode();
    }

    public int compareTo(Artikel anderArtikel) {
        return naam.compareTo(anderArtikel.naam);
    }
}
