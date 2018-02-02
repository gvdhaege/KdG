package be.kdg.film;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */
public enum Geluid {
   PCM("PCM"), DOLBY("Dolby"), DOLBY_HD("Dolby HD"), DTS("DTS"), DTS_HD("DTS HD");

   private String naam;

    private Geluid(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return naam;
    }
}
