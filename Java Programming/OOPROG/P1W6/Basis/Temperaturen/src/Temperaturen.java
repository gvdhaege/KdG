public class Temperaturen {
    public static final int AANTAL_TEMPERATUREN = 7;
    private double[] temperaturen = new double[AANTAL_TEMPERATUREN];
    private String[] dagen = {"maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag", "zondag"};

    public void voegTemperatuurToe(int indexWaarde, double temperatuur) {
        temperaturen[indexWaarde] = temperatuur;
    }

    public String getDag(int index) {
        return dagen[index];
    }

    public double getTemperatuur(int index) {
        return temperaturen[index];
    }

    public double bepaalGemiddeldeTemperatuur() {
        double som = 0;
        for (double temperatuur : temperaturen) {
            som += temperatuur;
        }
        return som / AANTAL_TEMPERATUREN;
    }
}
