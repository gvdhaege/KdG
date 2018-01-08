package be.kdg.demo;

import java.util.*;

/**
 * @author Kristiaan Behiels
 * @version 1.0 13/12/13
 */
public class Inwoners {
    private Map<Integer, Persoon> inwoners = new TreeMap<>();


    public Inwoners() {
        inwoners.put(45, new Persoon(45, "Jos De Volder", new Adres("Kerkstraat 10", 2900, "Schoten")));
        inwoners.put(32, new Persoon(32, "Jan De Schepper", new Adres("Tramstraat 148", 9052, "Gent")));
        inwoners.put(103, new Persoon(103, "Peter Nachtegaele", new Adres("Zeedijk 4", 8040, "Oostende")));
        inwoners.put(92, new Persoon(92, "Greet De Keyzer", new Adres("Dijkstraat 26",3500, "Hasselt")));
        inwoners.put(61, new Persoon(61, "Fons Verplaetse", new Adres("Wetstraat 8", 1000, "Brussel")));
    }

    @Override
    public String toString() {
        StringBuilder alleInwoners = new StringBuilder();
        for (Persoon persoon : inwoners.values()) {
            alleInwoners.append(persoon).append("\n");
        }
        return alleInwoners.toString();
    }

    public String volgensPostnummer() {
        List<Persoon> postNummers = new ArrayList<>(inwoners.values());
        Collections.sort(postNummers, new Comparator<Persoon>() {
            @Override
            public int compare(Persoon persoon, Persoon anderePersoon) {
                return persoon.getAdres().getPostNummer() - anderePersoon.getAdres().getPostNummer();
            }
        });

        StringBuilder alleInwoners = new StringBuilder();
        for (Persoon persoon : postNummers) {
            alleInwoners.append(persoon).append("\n");
        }
        return alleInwoners.toString();
      }
}
