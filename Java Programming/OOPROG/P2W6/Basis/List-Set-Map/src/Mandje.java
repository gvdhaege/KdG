import java.io.PrintStream;
import java.util.*;

public class Mandje {
    private Map<String, Artikel> mandje;
    public Mandje() {
        mandje = new TreeMap<String, Artikel>();
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
        return mandje.remove(artikel.getNaam()) != null;
// remove geeft Artikel-object terug (of null indien key niet gevonden)
    }
    /*
    Deze methode toont de inhoud van het mandje, netjes in
    kolommen onder mekaar met de prijzen afgerond in centen
    */
    public void toon() {
        for (Artikel artikel : mandje.values()){
            printArtikel(artikel);
        }
    }

    private PrintStream printArtikel(Artikel artikel) {
        return System.out.format("%-19s €%4.2f\n", artikel.getNaam(), artikel.getPrijs());
    }

    /*
    Deze methode toont de inhoud van het mandje gesorteerd volgens
    dalende prijs, netjes in kolommen onder mekaar met de prijzen
    afgerond in centen. Maak hier gebruik van een inner klasse PrijsComparator.
    */
    public void toonGesorteerdVolgensPrijs() {
        List<Artikel> artikelsVolgensPrijs = new ArrayList<>(mandje.values());
        Collections.sort(artikelsVolgensPrijs, new PrijsComparator());
        for (Artikel artikel : artikelsVolgensPrijs){
            printArtikel(artikel);
        }
    }

    private class PrijsComparator implements Comparator<Artikel>{
        @Override
        public int compare(Artikel o1, Artikel o2) {
            return Double.compare(o2.getPrijs(), o1.getPrijs());
        }
    }
}