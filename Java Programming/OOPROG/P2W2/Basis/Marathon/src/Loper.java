import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Loper implements Comparable<Loper> {
    private String naam;
    private int rugnummer;
    private LocalTime tijd;

    public Loper(String naam, int rugnummer) {
        this.naam = naam;
        this.rugnummer = rugnummer;
    }

    public void setTijd(LocalTime tijd) {
        this.tijd = tijd;
    }

    @Override
    public String toString() {
        return String.format("%-21s %d %s", naam, rugnummer, tijd);
    }

    @Override
    public int compareTo(Loper andereLoper) {
        return tijd.compareTo(andereLoper.tijd);
    }
}
