package be.kdg.dieren;

/**
 * De klasse Zwaluw implementeert de interfaces Dier, Eierleggend en Vliegend.
 * De attributen zijn naam (type String) en aantalEierenPerJaar (int) en
 * maxSnelheid (horizontale vluchtsnelheid in km/h).
 * Werk de klasse uit.
 */
public class Zwaluw implements Dier, Eierleggend, Vliegend {
    private String naam;
    private int aantalEierenPerJaar;
    private int maxSnelheid;

    public Zwaluw(String naam, int aantalEierenPerJaar, int maxSnelheid) {
        this.naam = naam;
        this.aantalEierenPerJaar = aantalEierenPerJaar;
        this.maxSnelheid = maxSnelheid;
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalEierenPerJaar() {
        return aantalEierenPerJaar;
    }

    public int getMaxVliegsnelheid() {
        return maxSnelheid;
    }

    @Override
    public String toString() {
        return String.format("Naam: %s\nEieren: %d\nSnelheid: %3d km/h\n", naam, aantalEierenPerJaar, maxSnelheid);
    }
}
