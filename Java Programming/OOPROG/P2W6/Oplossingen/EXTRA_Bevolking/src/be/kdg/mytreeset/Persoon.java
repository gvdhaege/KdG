package be.kdg.mytreeset;

/**
 * @author Kristiaan Behiels
 * @version 1.0 16/12/13
 */
public class Persoon implements Comparable<Persoon> {
    private String naam;
    private int leeftijd;

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    @Override
    public int compareTo(Persoon anderePersoon) {
        return naam.compareTo(anderePersoon.naam);
      /*  int delta = naam.compareTo(anderePersoon.naam);
         if (delta !=  0) return delta;
        return leeftijd - anderePersoon.leeftijd;   */
    }

    @Override
    public String toString() {
        return naam + "("  + leeftijd + ")";
    }


}
