package Dieren;

public class Koe extends Dier {
    private int aantalLiterMelkPerDag;

    public Koe(String naam, int aantalLiterMelkPerDag) {
        super(naam, "Boeboe", "gras");
        this.aantalLiterMelkPerDag = aantalLiterMelkPerDag;
    }

    @Override
    public String toString() {
        return super.toString() + " en geeft " + aantalLiterMelkPerDag + " liter melk per dag";
    }
}
