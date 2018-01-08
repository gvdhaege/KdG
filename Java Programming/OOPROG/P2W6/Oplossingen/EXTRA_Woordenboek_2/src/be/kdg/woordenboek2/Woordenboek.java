package be.kdg.woordenboek2;

import java.util.*;

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
     * Een methode om een Set van de originele woorden terug te krijgen
     */
    public Set<String> getOrigineleWoorden() {
        return woorden.keySet();
    }

    /**
     * Een methode die de vertaling van een woord opvraagt.
     * Dit is de 'value' aan de hand van de 'key' opvragen.
     * Indien de key niet aanwezig is moet er een exception geworpen worden.
     */
    public String vertaal(String woord) throws RuntimeException {
        String vertaling = woorden.get(woord);
        if (vertaling == null) {
            throw new RuntimeException("Vertaling niet gevonden!");
        }
        return vertaling;
    }

    /**
     * Een methode die het aantal objectparen in de map teruggeeft.
     */
    public int aantalWoorden() {
        return woorden.size();
    }

    /**
     * Een methode die alle Nederlandse woorden als een Set teruggeeft.
     * Opgelet: de geretourneerde set moet read-only zijn!
     */
    public Set<String> nederlandseWoorden() {
        return Collections.unmodifiableSet(new HashSet<>(woorden.keySet()));
    }

    /**
     * Een methode die alle vertaalde woorden als een gesorteerde List teruggeeft.
     * Opgelet: de geretourneerde list moet read-only zijn!
     */
    public List<String> vertalingen() {
        List<String> woordenlijst = new ArrayList<>(woorden.values());
        Collections.sort(woordenlijst);
        return Collections.unmodifiableList(woordenlijst);
    }

}
