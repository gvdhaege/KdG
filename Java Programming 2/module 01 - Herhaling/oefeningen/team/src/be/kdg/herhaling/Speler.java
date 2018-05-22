package be.kdg.herhaling;

public class Speler implements Comparable<Speler> {
    private int rugNummer;
    private String naam;
    private Adres adres;

    public Speler(int rugNummer, String naam, Adres adres) {
        this(rugNummer, naam, adres.getStraat(), adres.getPostNummer(), adres.getGemeente());
    }

    public Speler(int rugNummer, String naam, String straat, int postNummer, String gemeente) {
        this.naam = naam;
        this.rugNummer = rugNummer;
        this.adres = new Adres(straat, postNummer, gemeente);

    }

    public int getRugNummer() {
        return rugNummer;
    }

    @Override
    public String toString() {
        return String.format("%2d %-20s %-25s", rugNummer, naam, adres);
    }

    public int compareTo(Speler speler) {
        return this.naam.compareTo(speler.naam);
    }
}
