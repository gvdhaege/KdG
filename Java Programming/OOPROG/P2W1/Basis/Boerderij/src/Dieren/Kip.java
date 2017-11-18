package Dieren;

public class Kip extends Dier {
    private int aantalEierenPerWEek;

    public Kip(String naam, int aantalEierenPerWEek) {
        super(naam, "Toktok", "mais");
        this.aantalEierenPerWEek = aantalEierenPerWEek;
    }

    @Override
    public String toString() {
        return super.toString() + " en legt " + aantalEierenPerWEek + " eieren per week";
    }
}
