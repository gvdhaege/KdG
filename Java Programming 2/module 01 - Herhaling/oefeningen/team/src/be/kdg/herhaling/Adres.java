package be.kdg.herhaling;

public class Adres {
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

    public String toString() {
        return String.format("%-20s %4d %s", straat, postNummer, gemeente);
    }
}
