public class Vierkant extends Figuur implements Herschaalbaar {
    private double zijde;

    public Vierkant(double zijde) {
        super("Vierkant");
        this.zijde = zijde;
    }

    public double omtrek() {
        return 4 * zijde;
    }

    public double oppervlakte() {
        return zijde * zijde;
    }

    public void herschaal(int percentage){
        zijde = zijde * percentage / 100;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Omtrek: %.2f - Oppervlakte: %.2f: ", omtrek(), oppervlakte());
    }

}
