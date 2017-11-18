package be.kdg.factuur;

import java.util.ArrayList;
import java.util.List;

public class Artikels {
    private List<Artikel> artikels = new ArrayList<>();

    public void voegToe(Artikel artikel) {
        artikels.add(artikel);
    }

    public List<Artikel> getArtikels() {
        return artikels;
    }

    public Artikel zoekOpArtikelNummer(int artikelNummer) {
        Artikel teZoeken = null;
        for (Artikel artikel : artikels) {
            if (artikel.getArtikelNummer() == artikelNummer) {
                teZoeken = artikel;
            }
        }
        return teZoeken;
    }


}
