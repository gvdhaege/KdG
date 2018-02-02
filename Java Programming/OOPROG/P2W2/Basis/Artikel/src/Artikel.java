import java.time.LocalDate;

public class Artikel {
    private String naam;
    private int nummer;
    private LocalDate productieDatum;

    public Artikel(String naam, int nummer, LocalDate productieDatum) {
        this.naam = naam;
        this.nummer = nummer;
        this.productieDatum = productieDatum;
    }

    public LocalDate getProductieDatum() {
        return productieDatum;
    }

    @Override
    public String toString() {
        return String.format("%-12s %04d %s", naam, nummer, productieDatum);
    }
}
