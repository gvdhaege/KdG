import data.Artikel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MandjeList {
    private List<Artikel> mandje;

    public MandjeList() {
        mandje = new ArrayList<Artikel>();
    }

    public List<Artikel> getMandje() {
        return Collections.unmodifiableList(mandje);
    }

    public void voegToe(Artikel artikel) {
        if (!mandje.contains(artikel)) {
            mandje.add(artikel);
        }
    }

    public boolean verwijder(Artikel artikel) {
        return mandje.remove(artikel);
    }

    public void sorteerVolgensNaam() {
        Collections.sort(mandje);
    }

    public void sorteerVolgensPrijs() {
        Collections.sort(mandje, new PrijsComparator());
    }

    public void toon() {
        StringBuilder resultaat = new StringBuilder();
        for (Artikel artikel : mandje) {
            resultaat.append(String.format("%-19s €%3.2f\n", artikel.getNaam(), artikel.getPrijs()));
        }
        System.out.println(resultaat);
    }

    private class PrijsComparator implements Comparator<Artikel> {
        public int compare(Artikel artikel, Artikel anderArtikel) {
            return Double.compare(anderArtikel.getPrijs(), artikel.getPrijs());
        }
    }
}