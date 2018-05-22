package kdg.herhaling;

public class Speler implements Comparable<Speler> {
    private int rugNummer;
    private String naam;
    private Adres adres;

    // 2.1 Maak beide constructors + een getter voor het rugNummer
    public Speler(int rugNummer, String naam, Adres adres) {
        this(rugNummer, naam, adres.getStraat(), adres.getPostNummer(), adres.getGemeente());
    }

    public Speler(int rugNummer, String naam, String straat, int postNummer, String gemeente) {
        this.rugNummer = rugNummer;
        this.naam = naam;
        this.adres = new Adres(straat, postNummer, gemeente);
    }

    public int getRugNummer() {
        return rugNummer;
    }

    // 2.2 Override de toString methode (zie gewenste uitvoer - werk met kolommen)
    @Override
    public String toString() {
        return String.format("%2d %-20s %-25s", rugNummer, naam, adres);
    }

    public int compareTo(Speler o) {
        return this.naam.compareTo(o.naam);
    }
}
