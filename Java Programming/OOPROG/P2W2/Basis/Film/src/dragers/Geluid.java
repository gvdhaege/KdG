package dragers;

public enum Geluid {
    PCM("PCM"), DOLBY("Dolby"), DOLBY_HD("Dolby HD"), DTS("DTS"), DTS_HD("DTS HD");

    private String naam;

    Geluid(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return naam;
    }
}
