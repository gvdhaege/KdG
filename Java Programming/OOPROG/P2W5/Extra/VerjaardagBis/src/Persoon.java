import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persoon implements Comparable<Persoon> {
    private String naam;
    private LocalDate verjaardag;

    public Persoon(String naam, LocalDate verjaardag) {
        this.naam = naam;
        this.verjaardag = verjaardag;
    }

    public String getNaam() {
        return naam;
    }

    public LocalDate getVerjaardag() {
        return verjaardag;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM");
        return String.format("%-6s -> %s", naam, formatter.format(verjaardag));
    }

    @Override
    public int compareTo(Persoon anderePersoon) {
        int verschil = verjaardag.compareTo(anderePersoon.verjaardag);
        if (verschil != 0) {
            return verschil;
        }
        return naam.compareTo(anderePersoon.naam);
    }

}
