package be.kdg.dieren;

/**
 * De klasse Struisvogel implementeert de interfaces Dier en Eierleggend.
 * De attributen zijn naam (type String) en aantalEierenPerJaar (int).
 * Werk de klasse uit.
 */
public class Struisvogel implements Dier, Eierleggend {
    private String naam;
    private int aantalEierenPerJaar;

    public Struisvogel(String naam, int aantalEierenPerJaar) {
        this.naam = naam;
        this.aantalEierenPerJaar = aantalEierenPerJaar;
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalEierenPerJaar() {
        return aantalEierenPerJaar;
    }

    public String toString() {
        return String.format("Naam: %s\nEieren: %d\n", naam, aantalEierenPerJaar);
    }

}
