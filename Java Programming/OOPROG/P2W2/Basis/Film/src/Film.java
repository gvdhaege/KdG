import dragers.Drager;
import dragers.Geluid;

public class Film {
    private String titel;
    private int jaartal;
    private Drager drager;
    private Geluid geluid;

    public Film(String titel, int jaartal, Drager drager, Geluid geluid) {
        this.titel = titel;
        this.jaartal = jaartal;
        this.drager = drager;
        this.geluid = geluid;
    }

    @Override
    public String toString() {
        return String.format("%-18s %d %-9s %s",
                titel, jaartal, drager, geluid);
    }
}
