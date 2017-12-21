package girls;

import java.util.Objects;

public class Girl {
    private String naam;
    private int leeftijd;

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public Girl(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    @Override
    public String toString() {
        return naam + " " + leeftijd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Girl girl = (Girl) o;
        return leeftijd == girl.leeftijd &&
                Objects.equals(naam, girl.naam);
    }

    @Override
    public int hashCode() {

        return Objects.hash(naam, leeftijd);
    }
}
