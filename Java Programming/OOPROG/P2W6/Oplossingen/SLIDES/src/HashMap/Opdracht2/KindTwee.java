package HashMap.Opdracht2;

/**
 * Created by venj on 7/12/2014.
 */
public class KindTwee {
    private String naam;
    protected int leeftijd;
    private int lengte;

    public KindTwee(String naam, int leeftijd, int lengte) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.lengte = lengte;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        KindTwee kindTwee = (KindTwee) object;

        return naam.equals(kindTwee.naam);

    }

    @Override
    public int hashCode() {
        return naam.hashCode();
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return String.format("%s (%dj) is %dcm", naam, leeftijd, lengte);
    }
}
