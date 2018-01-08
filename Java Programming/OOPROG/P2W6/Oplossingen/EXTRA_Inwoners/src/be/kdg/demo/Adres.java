package be.kdg.demo;

/**
 * @author Kristiaan Behiels
 * @version 1.0 13/12/13
 */
public class Adres implements Comparable<Adres> {
    private String straat;
    private int postNummer;
    private String gemeente;

    public Adres(String straat, int postNummer, String gemeente) {
        this.straat = straat;
        this.postNummer = postNummer;
        this.gemeente = gemeente;
    }

    public String getStraat() {
        return straat;
    }

    public int getPostNummer() {
        return postNummer;
    }

    public String getGemeente() {
        return gemeente;
    }

    @Override
    public boolean equals(Object anderAdres) {
        if (this == anderAdres) return true;
        if (anderAdres == null || getClass() != anderAdres.getClass()) return false;

        Adres adres = (Adres) anderAdres;

        return postNummer == adres.postNummer && gemeente.equals(adres.gemeente) && straat.equals(adres.straat);
    }

    @Override
    public int hashCode() {
        int result = 31 * straat.hashCode() + postNummer;
        return 29 * result + gemeente.hashCode();
    }


    @Override
    public int compareTo(Adres anderAdres) {
        int postDelta = postNummer - anderAdres.postNummer;
        if (postDelta != 0) return postDelta;
        return straat.compareTo(anderAdres.straat);
    }

    @Override
    public String toString() {
        return String.format("%-20s %4d %-15s", straat, postNummer, gemeente);
    }
}
