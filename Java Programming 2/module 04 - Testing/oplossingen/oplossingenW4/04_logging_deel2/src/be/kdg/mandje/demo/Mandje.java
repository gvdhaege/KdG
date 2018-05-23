package be.kdg.mandje.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mandje {
    private static final Logger logger = Logger.getLogger("be.kdg.mandje.demo.Mandje");
    private List<Artikel> mandje;

    public Mandje() {
        mandje = new ArrayList<>();
    }

    public void voegToe(Artikel artikel) {
        if (!mandje.contains(artikel)) {
            mandje.add(artikel);
            logger.log(Level.INFO, "Artikel {0} toegevoegd.", artikel.getNaam());
        } else {
            logger.log(Level.WARNING, "Artikel {0} NIET toegevoegd.", artikel.getNaam());
        }
    }

    public void verwijder(Artikel artikel) {
        mandje.remove(artikel);
        logger.log(Level.WARNING, "Artikel {0} met prijs €{1} verwijderd.", new Object[] {artikel.getNaam(), artikel.getPrijs()});
    }

    public void sorteerVolgensNaam() {
        Collections.sort(mandje);
    }

    public void sorteerVolgensPrijs() {
        mandje.sort(new Comparator<Artikel>() {
            @Override
            public int compare(Artikel artikel, Artikel anderArtikel) {
                return Double.compare(artikel.getPrijs(), anderArtikel.getPrijs());
            }
        });
    }

    public void toon() {
        for (Artikel artikel : mandje) {
            System.out.format("%-16s €%4.2f\n", artikel.getNaam(), artikel.getPrijs());
        }
    }
}

