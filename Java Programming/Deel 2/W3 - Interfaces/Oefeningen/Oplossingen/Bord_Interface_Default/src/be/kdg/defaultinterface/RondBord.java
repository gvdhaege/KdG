package be.kdg.defaultinterface;

public class RondBord extends Bord {
    private double diameter;

    public RondBord(String materiaal, String kleur, double diameter) {
        super(materiaal, kleur);
        this.diameter = diameter;
    }

    @Override
    public double oppervlakte() {
        double straal = diameter / 2;
        return Math.PI * straal * straal;
    }
}
