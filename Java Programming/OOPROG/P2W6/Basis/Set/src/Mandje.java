import java.util.*;

public class Mandje {
    private Set<Artikel> mandje;

    public Mandje() {
        this.mandje = new TreeSet<Artikel>();
    }

    public Set<Artikel> getMandje() {
        return Collections.unmodifiableSet(mandje);
    }

    public void voegToe(Artikel artikel) {
        if (!mandje.contains(artikel)) {
            mandje.add(artikel);
        }
    }

    public boolean verwijderArtikel(Artikel artikel) {
        return mandje.remove(artikel);
    }

    public void toon(){
        toonAlsLijst(new ArrayList<>(mandje));
    }

    public void toonAlsLijst(List<Artikel> artikels) {
        for (Artikel artikel : artikels) {
            System.out.printf("%-16s €%.2f\n", artikel.getNaam(), artikel.getPrijs());
        }
    }

    public void sorteerVolgensNaam() {
        List<Artikel> artikelList = new ArrayList<>(mandje);
        Collections.sort(artikelList);
        toonAlsLijst(artikelList);
    }

    public void toonVolgensPrijs() {
        List<Artikel> artikelList = new ArrayList<>(mandje);
        Collections.sort(artikelList, new PrijsComparator());
        toonAlsLijst(artikelList);
    }

    private class PrijsComparator implements Comparator<Artikel> {
        @Override
        public int compare(Artikel o1, Artikel o2) {
            return Double.compare(o2.getPrijs(), o1.getPrijs());
        }
    }
}
