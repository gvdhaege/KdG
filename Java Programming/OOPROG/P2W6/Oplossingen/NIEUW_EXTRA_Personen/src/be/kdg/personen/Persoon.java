package be.kdg.personen;

/**
 * @author Kristiaan Behiels
 * @version 1.0 28/11/2014 21:36
 */
public class Persoon {
    int id;
    String naam;
    int leeftijd;

    public Persoon(int id, String naam, int leeftijd) {
        this.id = id;
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public int getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    @Override
    public String toString() {
        return String.format("%4d %-9s %3d", id, naam, leeftijd);
    }
}
