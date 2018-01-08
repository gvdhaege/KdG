package HashMap.Opdracht2;

/**
 * Created by venj on 7/12/2014.
 */
public class Kind {
    private String naam;
    protected int leeftijd;
    private int lengte;

    public Kind(String naam, int leeftijd, int lengte) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.lengte = lengte;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return String.format("%s (%dj) is %dcm", naam, leeftijd, lengte);
    }
}
