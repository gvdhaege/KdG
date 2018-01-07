package be.kdg.examen.klassement;

import be.kdg.examen.klassement.archiefhouders.ArchiefHouder;
import be.kdg.examen.klassement.archiefhouders.Doos;
import be.kdg.examen.klassement.archiefhouders.Koker;
import be.kdg.examen.klassement.archiefstukken.Archiefstuk;
import be.kdg.examen.klassement.archiefstukken.Boek;
import be.kdg.examen.klassement.exceptions.ArchiveringsException;

import java.util.*;

// gegeven
public class Archief {

    // niet-gegeven
    // final attributen
    private final int aantalDozen;
    private final int aantalKokers;
    private final Map<ArchiefHouder.Soort, List<ArchiefHouder>> archiefHouders;
    // niet - gegeven
    // non-finals
    private int kokerIndex = 0;
    private int doosIndex = 0;

    // gegeven
    public Archief(int aantalDozen, int aantalKokers) {
        // niet-gegeven
        this.aantalDozen = aantalDozen;
        this.aantalKokers = aantalKokers;
        archiefHouders = new HashMap<>();
        archiefHouders.put(ArchiefHouder.Soort.DoosType, new ArrayList<>());
        archiefHouders.put(ArchiefHouder.Soort.KokerType, new ArrayList<>());

        initialiseerArchief(aantalDozen, aantalKokers);
    }

    // gegeven
    private void initialiseerArchief(int aantalDozen, int aantalKokers) {

        // niet-gegeven
        List<ArchiefHouder> dozen = archiefHouders.get(ArchiefHouder.Soort.DoosType);
        for (int i = 0; i < aantalDozen; i++) {
            dozen.add(new Doos());
        }

        List<ArchiefHouder> kokers = archiefHouders.get(ArchiefHouder.Soort.KokerType);
        for (int i = 0; i < aantalKokers; i++) {
            kokers.add(new Koker());
        }
    }

    // gegeven
    public void stockeer(Archiefstuk archiefstuk) {

        // niet-gegeven
        ArchiefHouder houder = bepaalHouder(archiefstuk);
        houder.stockeer(archiefstuk);
    }

    // gegeven
    private ArchiefHouder bepaalHouder(Archiefstuk archiefstuk) {

        List<ArchiefHouder> houders;
        ArchiefHouder houder;

        // niet-gegeven
        if (archiefstuk.hoortIn().equals(ArchiefHouder.Soort.KokerType)) {
            if (kokerIndex >= aantalKokers)
                throw new ArchiveringsException("Archief: geen kokers meer beschikbaar");
            houders = archiefHouders.get(ArchiefHouder.Soort.KokerType);
            houder = houders.get(kokerIndex++);
        } else {
            if (doosIndex >= aantalDozen)
                throw new ArchiveringsException("Archief: geen dozen meer beschikbaar");
            houders = archiefHouders.get(ArchiefHouder.Soort.DoosType);
            houder = houders.get(doosIndex);
            if (houder.isVol()) {
                houder = houders.get(doosIndex++);
            }
        }
        return houder;
    }

    // niet-gegeven
    public List<Boek> getGesorteerdeBoeken() {
        List<Boek> alleBoeken = new ArrayList<>();
        List<ArchiefHouder> dozen = archiefHouders.get(ArchiefHouder.Soort.DoosType);
        for (ArchiefHouder archiefHouder : dozen) {
            Doos doos = (Doos) archiefHouder;
            List<Boek> boekenUitDoos = doos.getBoeken();
            alleBoeken.addAll(boekenUitDoos);
        }
        Collections.sort(alleBoeken);
        return alleBoeken;
    }

    // niet-gegeven
    private Inventaris getInventaris() {
        return new Inventaris(doosIndex, kokerIndex);
    }

    // niet-gegeven
    @Override
    public String toString() {
        List<Boek> boeken = getGesorteerdeBoeken();
        Inventaris inventaris = getInventaris();
        StringBuilder output = new StringBuilder();
        output.append("Inhoud archief:").append("\n");
        output.append("Aantal gebruikte dozen: ").append(inventaris.gebruikteDozen).append("\n");
        output.append("Aantal gebruikte kokers: ").append(inventaris.gebruikteKokers).append("\n");
        for (Boek archiefstuk : boeken) {
            output.append(archiefstuk).append("\n");
        }
        return output.toString();
    }

    // niet-gegeven
    class Inventaris {
        private final int gebruikteDozen;
        private final int gebruikteKokers;

        public Inventaris(int gebruikteDozen, int gebruikteKokers) {
            this.gebruikteDozen = gebruikteDozen;
            this.gebruikteKokers = gebruikteKokers;
        }
    }
}
