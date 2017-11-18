package be.kdg.factuur;

public class Bestelling {
    private int klantNummer;
    private int artikelNummer;
    private int aantal;

    public Bestelling(int klantNummer, int artikelNummer, int aantal) {
        this.klantNummer = klantNummer;
        this.artikelNummer = artikelNummer;
        this.aantal = aantal;
    }

    public int getKlantNummer() {
        return klantNummer;
    }

    public int getArtikelNummer() {
        return artikelNummer;
    }

    public int getAantal() {
        return aantal;
    }
}
