package be.kdg.werknemer;

/*
De abstracte klasse Werknemer bevat een constante met de naam UURLOON met de waarde 12.5.
Als attributen zijn er de naam (string) en het rijksregisternummer (long).
Voorzie een constructor die beide attributen van een waarde voorziet.
Voorzie een toString-methode die de naam en het rijksregisternummer als een string teruggeeft (zie verwachte uitvoer).
 */
public abstract class Werknemer {
    public static final double UURLOON = 12.5;
    private String naam;
    private long rijksregisternummer;

    public Werknemer(String naam, long nummer) {
        this.naam = naam;
        rijksregisternummer = nummer;
    }

    @Override
    public String toString() {
        return "\nNaam: " + naam + "\nNummer: " + rijksregisternummer;
    }
}

