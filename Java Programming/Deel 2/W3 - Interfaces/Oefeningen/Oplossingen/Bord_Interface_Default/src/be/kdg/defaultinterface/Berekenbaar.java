package be.kdg.defaultinterface;

public interface Berekenbaar {
    public abstract double oppervlakte();

    default public double omtrekVierkantBord(double zijde) {
        return 4 * zijde;
    }

    default public double omtrekRondBord(double diameter) {
        double straal = diameter / 2.0;
        return 2 * Math.PI * straal;
    }
}

