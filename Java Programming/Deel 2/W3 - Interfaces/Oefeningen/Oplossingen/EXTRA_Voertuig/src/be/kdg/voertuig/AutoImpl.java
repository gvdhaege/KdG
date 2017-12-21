package be.kdg.voertuig;

/**
 * De klasse AutoImpl implementeert zowel de interface Auto (zie de het bestand
 * in dit project) en de interface Comparable (standaard Java interface).
 */
public class AutoImpl implements Auto, Comparable<AutoImpl> {
    private String merk;
    private String type;
    private Motor motor;
    private int gewicht;  // in kg

    public AutoImpl(String merk, String type, Motor motor, int gewicht) {
        this.merk = merk;
        this.type = type;
        this.motor = motor;
        this.gewicht = gewicht;
    }

    public String getMerk() {
        return merk;
    }

    public String getType() {
        return type;
    }

    public Motor getMotor() {
        return motor;
    }

    public int getGewicht() {
        return gewicht;
    }

    public double kgPerKw() {
        return gewicht / (double) motor.getVermogen();
    }

    public double getVermogenPerLiter() {
        return motor.getVermogenPerLiter();
    }

    public String toString() {
        return String.format("Merk en type: %-7s %s\nMotor: %s\nGewicht: %4dkg\nVermogen per liter; %.2f\nkg per kW: %.2f\n",
                merk, type, motor, gewicht, getVermogenPerLiter(), kgPerKw());
    }

    /**
     * Vergelijkt volgens het vermogen per liter.
     *
     * @param auto Een Auto object
     * @return int
     */
    public int compareTo(AutoImpl auto) {
        double mijn = getVermogenPerLiter();
        double ander = auto.getVermogenPerLiter();
        int difference = Double.compare(mijn, ander);
        if (difference == 0) return 0;
        return (difference < 0) ? -1 : 1;
    }
}
