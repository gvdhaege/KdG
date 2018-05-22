package be.kdg.herhaling;

public enum SponsorSoort {
    LOKAAL("Lokaal"), INTERNATIONAAL("Internationaal");

    private String naam;

    SponsorSoort(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return naam;
    }
}
