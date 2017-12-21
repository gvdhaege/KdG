public class RondBord extends Bord{
    private double diameter;

    public RondBord(String materiaal, String kleur, double diameter) {
        super(materiaal, kleur);
        this.diameter = diameter;
    }

    public double oppervlakte() {
        double straal = diameter / 2;
        return Math.PI * straal * straal;
    }

    @Override
    public String toString() {
        return String.format("%-8s %s %3.0fcm²", "Rond", super.toString(), oppervlakte());
    }
}
