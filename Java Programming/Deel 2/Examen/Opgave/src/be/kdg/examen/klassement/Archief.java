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
    private final int aantalDozen;
    private final int aantalKokers;
    private final Map<ArchiefHouder.Soort, List<ArchiefHouder>> archiefHouders;

    private int kokerIndex = 0;
    private int dozenIndex = 0;

    // hier aanvullen

    // gegeven mag je wijzigen
    public Archief(int aantalDozen, int aantalKokers) {
        this.aantalDozen = aantalDozen;
        this.aantalKokers = aantalKokers;
        archiefHouders = new HashMap<>();
        archiefHouders.put(ArchiefHouder.Soort.DoosType, new ArrayList<>());
        archiefHouders.put(ArchiefHouder.Soort.KokerType, new ArrayList<>());
        initialiseerArchief(aantalDozen, aantalKokers);
    }

    // gegeven
    private void initialiseerArchief(int aantalDozen, int aantalKokers) {
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
        ArchiefHouder houder = bepaalHouder(archiefstuk);
        houder.stockeer(archiefstuk);
    }

    // gegeven
    private ArchiefHouder bepaalHouder(Archiefstuk archiefstuk) {
        List<ArchiefHouder> houders;
        ArchiefHouder houder;

        if (archiefstuk.hoortIn().equals(ArchiefHouder.Soort.KokerType)) {
            if (kokerIndex >= aantalKokers) {
                throw new ArchiveringsException("Archief: geen kokers meer beschikbaar");
            }
            houders = archiefHouders.get(ArchiefHouder.Soort.KokerType);
            houder = houders.get(kokerIndex++);
        } else {
            if (dozenIndex >= aantalDozen) {
                throw new ArchiveringsException("Archief: geen dozen meer beschikbaar");
            }
            houders = archiefHouders.get(ArchiefHouder.Soort.DoosType);
            houder = houders.get(dozenIndex);
            if (houder.isVol()) {
                houder = houders.get(dozenIndex++);
            }
        }
        return houder;
    }

    // gegeven
    public List<Boek> getSorteerdeBoeken() {
        List<Boek> alleBoeken = new ArrayList<>();
        List<ArchiefHouder> dozen = archiefHouders.get(ArchiefHouder.Soort.DoosType);
        for (ArchiefHouder archiefHouder : dozen) {
            Doos doos = (Doos) archiefHouder;
            List<Boek> boekenUitDeDoos = doos.getBoeken();
            alleBoeken.addAll(boekenUitDeDoos);
        }
        Collections.sort(alleBoeken);
        return alleBoeken;
    }

    private Inventaris getInventaris(){
        return new Inventaris(dozenIndex, kokerIndex);
    }

    @Override
    public String toString() {
        List<Boek> boeken = getSorteerdeBoeken();
        Inventaris inventaris = getInventaris();
        StringBuilder sb = new StringBuilder();
        sb.append("Inhoud archief: ").append("\n");
        sb.append("Aantal gebruikte dozen: " + inventaris.gebruikteDozen).append("\n");
        sb.append("Aantal gebruikte kokers: " + inventaris.gebruikteKokers).append("\n");
        for (Boek boek : boeken){
            sb.append(boek).append("\n");
        }

        return sb.toString();
    }

    class Inventaris {
        private final int gebruikteDozen;
        private final int gebruikteKokers;

        public Inventaris(int gebruikteDozen, int gebruikteKokers) {
            this.gebruikteDozen = gebruikteDozen;
            this.gebruikteKokers = gebruikteKokers;
        }
    }


    // hier aanvullen voor de andere vragen
}
