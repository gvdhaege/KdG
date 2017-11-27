public class Rechthoek extends Figuur {
    private double breedte;
    private double lengte;

    public Rechthoek(double breedte, double lengte){
        super("Rechthoek");
        this.breedte = breedte;
        this.lengte = lengte;
    }

    @Override
    public double omtrek() {
        return breedte * 2 + lengte * 2;
    }

    @Override
    public double oppervlakte() {
        return breedte * lengte;
    }

    @Override
    public void herschaal(int percentage) {
        breedte = breedte * percentage / 100;
        lengte = lengte * percentage /100;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Omtrek: %.2f - Oppervlakte: %.2f: ", omtrek(), oppervlakte());
    }
}
