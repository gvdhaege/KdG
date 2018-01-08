public class Gemiddelde {
    private double som(double[] getallen) {
        double som = 0.0;
        for (double getal : getallen) {
            som += getal;
        }
        return som;
    }

    private double deel(double deeltal, double deler) throws RuntimeException {
        if (deler == 0) {
            throw new RuntimeException("Deling door nul");
        }
        return deeltal / deler;
    }

    public double getGemiddelde(double[] getallen) {
        try {
            return deel(som(getallen), getallen.length);
        } catch (RuntimeException e) {
            throw new RuntimeException("De lijst is leeg", e);
        }
    }
}
