package be.kdg.mandje;

import java.io.Serializable;
import java.util.*;

/**
 * De klasse mandje bevat een verzameling van Artikel-objecten.
 * Aan deze verzameling moet je artikels kunnen toevoegen en ook
 * artikels kunnen uit verwijderen. Een artikel met dezelfde naam
 * kan slechts éémaal toegevoegd worden.
 */
public class Mandje {
    private Set<Artikel> mandje;

    public Mandje() {
        mandje = new TreeSet<>();
    }

    /*
        Deze methode geeft de inhoud van het mandje in de vorm van
        een Set terug. De inhoud van het mandje zelf kan niet gewijzigd
        worden.
     */
    public Set<Artikel> getMandje() {
        return Collections.unmodifiableSet(mandje);
    }

    /*
       Deze methode voegt een artikel aan het mandje toe
       (maar alleen als er nog geen artikel met dezelfde naam
       in voorkomt).
    */
    public void voegToe(Artikel artikel) {
        mandje.add(artikel);
    }

    /*
        Deze methode verwijdert een artikel uit het mandje.
        Indien het artikel verwijderd is geeft ze true terug,
        als het artikel niet gevonden werd geeft ze false terug.
    */
    public boolean verwijder(Artikel artikel) {
        return mandje.remove(artikel);
    }

    /*
        Deze methode toont de inhoud van het mandje, netjes in
        kolommen onder mekaar, met de prijzen afgerond in centen
     */
    public void toon() {
        toonLijst(new ArrayList<>(mandje));
    }

    /*
       Deze methode toont de inhoud van het mandje
       volgens de prijs, van hoog naar laag.
    */
    public void toonVolgensPrijs() {
        List<Artikel> lijst = new ArrayList<>(mandje);
        Collections.sort(lijst, new PrijsComparator());
        toonLijst(lijst);
    }

    private class PrijsComparator implements Comparator<Artikel>  {
        public int compare(Artikel artikel, Artikel anderArtikel) {
            double prijs = artikel.getPrijs();
            double anderePrijs = anderArtikel.getPrijs();
            return Double.compare(anderePrijs, prijs);
        }
    }

    private void toonLijst(List<Artikel> lijst) {
        for (Artikel artikel : lijst) {
            System.out.format("%-16s €%4.2f\n", artikel.getNaam(), artikel.getPrijs());
        }
    }

}
