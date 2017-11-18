package be.kdg.boederij;

/**
 *  De klasse Boerderij bevat als attributen een lijst van dieren (maximaal 10 elementen via constante) en een aantal (type int).
 */

public class Boerderij {
    private static final int MAX = 10;

    private Dier[] dieren = new Dier[MAX];
    private int aantalDieren;

    /**
     * Default constructor voor de lijst
     */
    public Boerderij() {
    }

    /**
     * Voeg een dier aan de lijst toe
     */
    public void voegDierToe(Dier dier) {
        dieren[aantalDieren++] = dier;
    }

    /**
     * Geeft de volledige informatie over alle dieren (zie voorbeeld)
     * Voorbeeld: Bugs maakt geluid Snif, eet gras en graaft wel
     */
    public void toonDieren() {
        for (int i = 0; i < aantalDieren; i++) {
            System.out.println(dieren[i]);
        }
    }

    /**
     * Geeft de naam van het dier en het geluid dat het maakt voor alle dieren.
     * Voorbeeld: Bugs maakt geluid Snif
     */
    public void toonGeluiden() {
        for (int i = 0; i < aantalDieren; i++) {
            System.out.println(dieren[i].getNaam() + " maakt geluid " + dieren[i].getGeluid());
        }
    }

    /**
     * Geeft de naam van het dier en wat het eet voor alle dieren.
     * Voorbeeld: Bugs eet gras
     */
    public void toonVoeding() {
        for (int i = 0; i < aantalDieren; i++) {
            System.out.println(dieren[i].getNaam() + " eet " + dieren[i].getVoeding());
        }
    }

    /**
     *  Geeft true als er een dier met de te zoeken naam in de lijst voorkomt.
     */
    public boolean zoekDierOpNaam(String zoekNaam) {
        for (int i = 0; i < aantalDieren; i++) {
            String naam = dieren[i].getNaam();
            if (zoekNaam.equalsIgnoreCase(naam)) {
                return true;
            }
        }
        return false;
    }

}