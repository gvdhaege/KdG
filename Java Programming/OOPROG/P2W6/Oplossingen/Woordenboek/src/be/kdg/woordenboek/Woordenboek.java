package be.kdg.woordenboek;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Vul het nodige in deze klasse aan zodat de doeDemo-methode van de klasse
 * WoordenboekCreator kan uitgevoerd worden. Zie aldaar voor het verwachte resultaat.
 */
public class Woordenboek {
    private Map<String, String> woorden;

    /**
     * Constructor die een nieuwe HashMap maakt.
     */
    public Woordenboek() {
        woorden = new HashMap<>();
    }

    /**
     * Een methode om een woord samen met zijn vertaling aan de map toe te voegen.
     */
    public void voegWoordToe(String woord, String vertaling) {
        woorden.put(woord, vertaling);
    }

    /**
     * Een methode om een Set van de originele woorden terug te krijgen  (hier niet gebruikt)
     */
  //  public Set<String> getOrigineleWoorden() {
  //     return woorden.keySet();
  //  }

    /**
     * Een methode die de vertaling van een woord opvraagt.
     * Dit is de 'value' aan de hand van de 'key' opvragen.
     * Indien de key niet aanwezig is moet er een foutmelding teruggegeven worden.
     */
    public String vertaal(String woord) {
        String vertaling = woorden.get(woord);
        if (vertaling == null) {
            return "Vertaling niet gevonden";
        }
        return vertaling;
    }

    /**
     * Een methode die het aantal objectparen in de map teruggeeft.
     */
    public int aantalWoorden() {
        return woorden.size();
    }
}
