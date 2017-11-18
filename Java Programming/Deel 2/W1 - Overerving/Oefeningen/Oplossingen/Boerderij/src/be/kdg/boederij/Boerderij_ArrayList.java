package be.kdg.boederij;

/**
 *  De klasse Boerderij bevat als enig attribuut een lijst van dieren (type ArrayList).
 */
import java.util.ArrayList;
import java.util.List;

public class Boerderij_ArrayList {
    private List<Dier> dieren;

    /**
     * Constructor voor de ArrayList
     */
    public Boerderij_ArrayList() {
        dieren = new ArrayList<>();
    }

    /**
     * Voeg een dier aan de lijst toe
     */
    public void voegDierToe(Dier dier) {
        dieren.add(dier);
    }

    /**
     * Geeft de volledige informatie over alle dieren (zie voorbeeld)
     * Voorbeeld: Bugs maakt geluid Snif, eet gras en graaft wel
     */
    public void toonDieren() {
        for (Dier dier : dieren) {
            System.out.println(dier);
        }
    }

    /**
     * Geeft de naam van het dier en het geluid dat het maakt voor alle dieren.
     * Voorbeeld: Bugs maakt geluid Snif
     */
    public void toonGeluiden() {
        for (Dier dier : dieren) {
            System.out.println(dier.getNaam() + " maakt geluid " + dier.getGeluid());
        }
    }

    /**
     * Geeft de naam van het dier en wat het eet voor alle dieren.
     * Voorbeeld: Bugs eet gras
     */
    public void toonVoeding() {
        for (Dier dier : dieren) {
            System.out.println(dier.getNaam() + " eet " + dier.getVoeding());
        }
    }

    /**
     *  Geeft true als er een dier met de te zoeken naam in de lijst voorkomt.
     */
    public boolean zoekDierOpNaam(String zoekNaam) {
        for (Dier dier : dieren) {
            String naam = dier.getNaam();
            if (zoekNaam.equalsIgnoreCase(naam)) {
                return true;
            }
        }
        return false;
    }

}
