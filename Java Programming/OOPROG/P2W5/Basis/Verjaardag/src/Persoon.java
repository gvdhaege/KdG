public class Persoon implements Comparable<Persoon> {
    private String naam;
    private Datum verjaardag;

    public Persoon(String naam, int dag, Datum.Maand maand) {
        this.naam = naam;
        this.verjaardag = new Datum(dag, maand);
    }

    public Persoon(String naam, Datum verjaardag) {
        this.naam = naam;
        this.verjaardag = verjaardag;
    }

    public String getNaam() {
        return naam;
    }

    public Datum getVerjaardag() {
        return verjaardag;
    }

    @Override
    public String toString() {
        return String.format("%-8s -> %s", naam, verjaardag);
    }

    @Override
    public int compareTo(Persoon anderePersoon){
        int verschil = this.verjaardag.compareTo(anderePersoon.verjaardag);
        if (verschil != 0){
            return verschil;
        }
        return naam.compareTo(anderePersoon.naam);
    }
}
