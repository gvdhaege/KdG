package be.kdg.generics;

import java.util.Objects;

public class Persoon {
    private String naam;
    private int lengte;
    private int gewicht;

    public Persoon(String naam, int lengte, int gewicht) {
        this.naam = naam;
        this.lengte = lengte;
        this.gewicht = gewicht;
    }

    @Override
    public String toString() {
        return String.format("[%s, %dcm, %dkg]", naam, lengte, gewicht);
    }

    // Alternatieve versie met klasse Objects (vanaf JDK 7)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoon persoon = (Persoon) o;
        return lengte == persoon.lengte &&
                gewicht == persoon.gewicht &&
                Objects.equals(naam, persoon.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, lengte, gewicht);
    }
}
