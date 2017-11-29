public class Voertuig implements Rijden {
    private int aantalWielen;

    public Voertuig(int aantalWielen) {
        this.aantalWielen = aantalWielen;
    }

    public int getAantalWielen() {
        return aantalWielen;
    }

    @Override
    public String start() {
        return "Dit voertuig met " + aantalWielen + " wielen is gestart.";

    }

    @Override
    public String stop() {
        return "Dit voertuig met " + aantalWielen + " wielen is gestopt.";    }
}
