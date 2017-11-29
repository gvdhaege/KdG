public class Speelgoedtrein implements Rijden{
    private String merkNaam;

    public Speelgoedtrein(String merkNaam) {
        this.merkNaam = merkNaam;
    }

    public String getMerkNaam() {
        return merkNaam;
    }

    public void setMerkNaam(String merkNaam) {
        this.merkNaam = merkNaam;
    }

    @Override
    public String start() {
    return "Speelgoedtreintje van " + merkNaam + " is vertrokken.";
    }

    @Override
    public String stop() {
        return "Speelgoedtreintje van " + merkNaam + " is gestopt.";
    }
}
