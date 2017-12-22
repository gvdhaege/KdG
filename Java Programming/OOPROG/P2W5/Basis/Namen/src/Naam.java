public class Naam implements Comparable<Naam> {
    private final String naam;
    private final String voornaam;

    public Naam(String naam, String voornaam) {
        this.naam = naam;
        this.voornaam = voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    @Override
    public String toString() {
        return voornaam + " " + naam;
    }

    @Override
    public int compareTo(Naam andereNaam) {
        return this.naam.compareTo(andereNaam.naam);
    }
}
