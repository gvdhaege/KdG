package be.kdg.mandje;

import java.io.Serializable;
import java.util.*;

/**
 * De klasse mandje bevat een verzameling van Artikel-objecten.
 * Aan deze verzameling moet je artikels kunnen toevoegen en ook
 * artikels kunnen uit verwijderen. Een artikel met dezelfde naam
 * kan slechts éénmaal toegevoegd worden.
 * <p/>
 * In dit geval bestaat de implementatie uit een TreeMap,
 * waarbij de key de naam van het artikel is en de value
 * het Artikel object.
 */
public class Mandje {
    private Map<String, Artikel> mandje;

    public Mandje() {
        mandje = new TreeMap<>();
    }

    /*
        Deze methode geeft de inhoud van het mandje (values van de Map)
        in de vorm van een List terug.
     */
    public List<Artikel> getMandje() {
        return new ArrayList<>(mandje.values());
    }

    /*
       Deze methode voegt een artikel aan het mandje toe
       (maar alleen als er nog geen artikel met dezelfde naam
       in voorkomt).
    */
    public void voegToe(Artikel artikel) {
        mandje.put(artikel.getNaam(), artikel);
    }

    /*
        Deze methode verwijdert een artikel uit het mandje.
        Indien het artikel verwijderd is geeft ze true terug,
        als het artikel niet gevonden werd geeft ze false terug.
    */
    public boolean verwijder(Artikel artikel) {
        // remove geeft Artikel-object terug (of null indien key niet gevonden)
        return mandje.remove(artikel.getNaam()) != null;
    }

    /*
        Deze methode toont de inhoud van het mandje, netjes in
        kolommen onder mekaar met de prijzen afgerond in centen
     */
    public void toon() {
        for (Artikel artikel : mandje.values()) {
            printArtikel(artikel);
        }
    }

    private void printArtikel(Artikel artikel) {
        System.out.format("%-16s €%4.2f\n", artikel.getNaam(), artikel.getPrijs());
    }

    /*
        Deze methode toont de inhoud van het mandje gesorteerd volgens
        dalende prijs, netjes in kolommen onder mekaar met de prijzen
        afgerond in centen
     */
    public void toonGesorteerdVolgensPrijs() {
        List<Artikel> artikels = new ArrayList<>(mandje.values());
        Collections.sort(artikels, new PrijsComparator());
        for (Artikel artikel : artikels) {
            printArtikel(artikel);
        }
    }

    private class PrijsComparator implements Comparator<Artikel> {
        public int compare(Artikel artikel, Artikel anderArtikel) {
            double prijs = artikel.getPrijs();
            double anderePrijs = anderArtikel.getPrijs();
            return Double.compare(anderePrijs, prijs);
        }
    }
}

/*
Appels           €2,20
Druiven          €1,95
Mandarijnen      €2,50
Passievruchten   €2,35
Peren            €1,99
Pruimen          €2,49

Gesorteerd volgens naam:
Appels           €2,20
Druiven          €1,95
Mandarijnen      €2,50
Passievruchten   €2,35
Peren            €1,99
Pruimen          €2,49

Gesorteerd volgens prijs:
Mandarijnen      €2,50
Pruimen          €2,49
Passievruchten   €2,35
Appels           €2,20
Peren            €1,99
Druiven          €1,95
*/