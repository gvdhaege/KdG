package be.kdg.factuur;

public class Artikel {
    private int artikelNummer;
    private String naam;
    private double prijs;

    public Artikel(int artikelNummer, String naam, double prijs) {
        this.artikelNummer = artikelNummer;
        this.naam = naam;
        this.prijs = prijs;
    }

    public int getArtikelNummer() {
        return artikelNummer;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public String toString() {
        return String.format("%4d %-20s €%5.2f", artikelNummer, naam, prijs);
    }
}
