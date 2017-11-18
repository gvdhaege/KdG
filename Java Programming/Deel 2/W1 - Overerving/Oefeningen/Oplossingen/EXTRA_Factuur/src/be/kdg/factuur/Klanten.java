package be.kdg.factuur;

import java.util.ArrayList;
import java.util.List;

public class Klanten {
    private List<Klant> klanten = new ArrayList<>();

    public void voegToe(Klant artikel) {
        klanten.add(artikel);
    }

    public List<Klant> getKlanten() {
        return klanten;
    }

    public Klant zoekOpKlantNummer(int klantNummer) {
        Klant teZoeken = null;
        for (Klant artikel : klanten) {
            if (artikel.getKlantNummer() == klantNummer) {
                teZoeken = artikel;
            }
        }
        return teZoeken;
    }
}
