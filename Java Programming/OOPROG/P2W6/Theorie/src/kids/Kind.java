package kids;

public class Kind implements Comparable<Kind> {
    private String naam;
    private int leeftijd;
    private int lengte;

    public Kind(String naam, int leeftijd, int lengte) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.lengte = lengte;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public int getLengte() {
        return lengte;
    }


    @Override
    public int compareTo(Kind anderKind) {
        return this.lengte - anderKind.lengte;
    }

    @Override
    public String toString() {
        return naam + "(" + leeftijd + "j) is " + lengte + "cm groot";
    }
}
