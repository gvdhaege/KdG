package be.kdg.boederij;

/**
 * De klasse Dier is de superklasse van Kip, Koe en Konijn.
 * Ze bevat de attributen 'naam', 'geluid' en 'voeding', alle van het type String.
 */

public class Dier {
    private String naam;
    private String geluid;
    private String voeding;

    /**
     * Constructor met drie String parameters.
     */
    public Dier(String naam, String geluid, String eet) {
        this.naam = naam;
        this.geluid = geluid;
        this.voeding = eet;
    }

    /**
     *  Voorzie hier een getter voor elk van de attributen.
     */
    public String getNaam() {
        return naam;
    }

    public String getGeluid() {
        return geluid;
    }

    public String getVoeding() {
        return voeding;
    }

    /**
     * Voorzie een toString methode (zie voorbeeld)
     * Voorbeeld: Bugs maakt geluid Snif, voeding gras.
     */
    public String toString() {
        return naam + " maakt geluid " + geluid + ", eet " + voeding;
    }
}