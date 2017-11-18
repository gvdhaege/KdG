package be.kdg.factuur;

public class Adres {
    private String straat;
    private int postNummer;
    private String gemeente;

    public Adres(String straat, int postNummer, String gemeente) {
        this.straat = straat;
        this.postNummer = postNummer;
        this.gemeente = gemeente;
    }

    public String toString() {
        return String.format("%s \n%d %s", straat, postNummer, gemeente);
    }
}
