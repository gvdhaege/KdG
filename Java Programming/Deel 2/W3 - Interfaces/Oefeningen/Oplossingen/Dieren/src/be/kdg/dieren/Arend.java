package be.kdg.dieren;

/**
 * De klasse Arend implementeert de interfaces Dier, Vliegend en Eierleggend.
 * De attributen zijn naam (type String) en aantalEierenPerJaar (int),
 * maxSnelheid (horizontale vluchtin km/h - type int) en duiksnelheid (idem).
 * Werk de klasse uit.
 */
public class Arend implements Dier, Vliegend, Eierleggend {
    private String naam;
    private int aantalEierenPerJaar;
    private int maxSnelheid;
    private int duiksnelheid;

    public Arend(String naam, int aantalEierenPerJaar, int maxSnelheid, int duiksnelheid) {
        this.naam = naam;
        this.aantalEierenPerJaar = aantalEierenPerJaar;
        this.maxSnelheid = maxSnelheid;
        this.duiksnelheid = duiksnelheid;
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

    public int getDuiksnelheid() {
        return duiksnelheid;
    }

    @Override
    public String toString() {
        return String.format("Naam: %s\nEieren: %d\nSnelheid: %d km/h\nDuiksnelheid: %d km/h\n",
                naam, aantalEierenPerJaar, maxSnelheid, duiksnelheid);
    }
}
