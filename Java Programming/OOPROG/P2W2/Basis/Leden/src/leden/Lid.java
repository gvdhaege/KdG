package leden;

public class Lid {
    private String naam;
    private Soort soort;
    private int lidnummer = 1000;
    private static int aantalLeden = 0;

    public Lid(String naam, Soort soort) {
        this.naam = naam;
        this.soort = soort;
        if (!soort.equals(Soort.STEUNEND)) {
            this.lidnummer += ++aantalLeden;
        } else {
            this.lidnummer = 0;
        }
    }

    public static int getAantalLeden() {
        return aantalLeden;
    }

    public int getLidnummer() {
        return lidnummer;
    }

    @Override
    public String toString() {
        return String.format("%d %-10s soort: %s", lidnummer, naam, soort);
    }
}
