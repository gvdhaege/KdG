package be.kdg.persoon;

/**
 * @author Kristiaan Behiels
 * @version 1.0 24/10/13
 */
public class Persoon {
    private int id;
    private String naam;

    public Persoon(int id, String naam) {
        this.id = id;
        this.naam = naam;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Persoon persoon = (Persoon) object;

        return id == persoon.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%4d %-10s", id, naam);
    }
}


