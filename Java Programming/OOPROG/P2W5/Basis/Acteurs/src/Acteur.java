import java.util.Objects;

public class Acteur implements Comparable<Acteur> {
    private String naam;
    private int geboorteJaar;

    public Acteur(String naam, int geboorteJaar) {
        this.naam = naam;
        this.geboorteJaar = geboorteJaar;
    }

    public String getNaam() {
        return naam;
    }

    public int getGeboorteJaar() {
        return geboorteJaar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acteur acteur = (Acteur) o;
        return geboorteJaar == acteur.geboorteJaar &&
                Objects.equals(naam, acteur.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, geboorteJaar);
    }

    @Override
    public int compareTo(Acteur acteur) {
        int leeftijdVerschil = geboorteJaar - acteur.getGeboorteJaar();
        if (leeftijdVerschil != 0) return leeftijdVerschil;
        return naam.compareTo(acteur.naam);
    }


    @Override
    public String toString() {
        return geboorteJaar + " " + naam;
    }
}
