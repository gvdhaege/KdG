package be.kdg.examen.klassement;

import be.kdg.examen.klassement.archiefhouders.ArchiefHouder;
import be.kdg.examen.klassement.archiefstukken.Archiefstuk;

import java.util.ArrayList;
import java.util.List;

// gegeven
public class Archief {

    // hier aanvullen

    // gegeven mag je wijzigen
    public Archief(int aantalDozen, int aantalKokers) {

        initialiseerArchief(aantalDozen, aantalKokers);
    }

    // gegeven
    private void initialiseerArchief(int aantalDozen, int aantalKokers) {

    }

    // gegeven
    public void stockeer(Archiefstuk archiefstuk) {

    }

    // gegeven
    private ArchiefHouder bepaalHouder(Archiefstuk archiefstuk) {
        // gegeven
        List<ArchiefHouder> houders;
        ArchiefHouder houder = null;

        // archiefstuk is een Kaart
        // aanvullen

        // archiefstuk is GEEN Kaart
        // aanvullen

        return houder;
    }

    // gegeven
    public List<Archiefstuk> getSorteerdeBoeken() {
        List<Archiefstuk> alleBoeken = new ArrayList<>();

        return alleBoeken;
    }


    // hier aanvullen voor de andere vragen
}
