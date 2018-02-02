package be.kdg.datetime;

import java.time.LocalTime;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25/10/2014
 */
public class Loper implements Comparable<Loper>  {
    String naam;
    int rugnummer;
    LocalTime tijd;

    public Loper(String naam, int rugnummer) {
        this.naam = naam;
        this.rugnummer = rugnummer;
    }

    public void setTijd(LocalTime tijd) {
        this.tijd = tijd;
    }

    @Override
    public String toString() {
        return String.format("%-20s %5d %s", naam, rugnummer, tijd);
    }

    @Override
    public int compareTo(Loper andereLoper) {
        return tijd.compareTo(andereLoper.tijd);
    }
}
