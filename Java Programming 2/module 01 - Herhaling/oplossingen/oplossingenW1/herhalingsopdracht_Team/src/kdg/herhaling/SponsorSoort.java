package kdg.herhaling;

public enum SponsorSoort {
    // 4.1 Vul de enum aan, bij het afdrukken van de constanten LOKAAL en INTERNATIONAAL
    // moet je 'Lokaal' en 'Internationaal' bekomen.

    LOKAAL("Lokaal"), INTERNATIONAAL("Internationaal");

    private String naam;

    private SponsorSoort(String naam) {
        this.naam = naam;
    }

    public String toString() {
        return naam;
    }
}
