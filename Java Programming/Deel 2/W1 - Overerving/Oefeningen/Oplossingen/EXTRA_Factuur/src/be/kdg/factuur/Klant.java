package be.kdg.factuur;

public class Klant{
    private int klantNummer;
    private boolean vasteKlant;
    private String naam;
    private Adres adres;

    public Klant(int klantNummer, boolean vasteKlant, String naam, Adres adres) {
        this.klantNummer = klantNummer;
        this.vasteKlant = vasteKlant;
        this.naam = naam;
        this.adres = adres;
    }

    public int getKlantNummer() {
        return klantNummer;
    }

    public boolean isVasteKlant() {
        return vasteKlant;
    }

    public String getNaam() {
        return naam;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setVasteKlant(boolean vasteKlant) {
        this.vasteKlant = vasteKlant;
    }

    public String toString() {
        return String.format("%s\n%s", naam, adres);
    }
}
