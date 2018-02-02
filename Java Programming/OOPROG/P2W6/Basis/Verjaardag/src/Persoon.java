import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persoon {
    private LocalDate verjaardag;
    private String naam;

    public Persoon(LocalDate verjaardag, String naam) {
        this.verjaardag = verjaardag;
        this.naam = naam;
    }

    public LocalDate getVerjaardag() {
        return verjaardag;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM");
        return String.format("%-12s %s", naam, verjaardag.format(formatter));
    }
}
