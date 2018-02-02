package be.kdg.film;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */
public class Film {
    private String titel;
    private int jaar;
    private Drager drager;
    private Geluid geluid;

    public Film(String titel, int jaar, Drager drager, Geluid geluid) {
        this.titel = titel;
        this.jaar = jaar;
        this.drager = drager;
        this.geluid = geluid;
    }

    @Override
    public String toString() {
        return String.format("%-20s %4d %-8s %s", titel, jaar, drager, geluid);
    }
}
