package be.kdg.personen;

import java.util.*;

/**
 * @author Kristiaan Behiels
 * @version 1.0 28/11/2014 21:39
 */
public class Personen {
    private Map<Integer, Persoon> personen = new TreeMap<>();

    // Zorg ervoor dat bij een reeds aanwezige key de value niet overschreven wordt
    // Dit zou op één coderegel moeten kunnen, zoek in de documentatie van de Map interface
    public void voegToe(Persoon persoon) {
        personen.putIfAbsent(persoon.getId(), persoon);
    }

    // Geef alle in de map aanwezige values terug
    public Collection<Persoon> getValues() {
        return personen.values();
    }

    // Geef alle elementen terug voor de range van id waarden, ongeacht ze een value bevatten.
    public Collection<Persoon> getAll() {
        int minKey = Collections.min(personen.keySet());
        int maxKey = Collections.max(personen.keySet());

        Collection<Persoon> resultaat = new ArrayList<>();
        for (int i = minKey; i <= maxKey; i++) {
            Persoon persoon = personen.getOrDefault(i, new Persoon(i, "Onbekend", 0));
            resultaat.add(persoon);
        }
        return resultaat;
    }

    public void vervang(int id, Persoon persoon) {
        personen.replace(id, persoon);
    }

    public void vervangAls(int id, Persoon aanwezigePersoon, Persoon persoon) {
        personen.replace(id, aanwezigePersoon, persoon);
    }
}
