package be.kdg.voertuig;

/**
 * De klasse MotorImpl implementeert de interface Motor (zie de het bestand
 * in dit project).
 */
public class MotorImpl implements Motor {
    private int aantalCilinders;
    private int cilinderInhoud; // in cc
    private int vermogen;  // in kW

    public MotorImpl(int aantalCilinders, int cilinderInhoud, int vermogen) {
        this.aantalCilinders = aantalCilinders;
        this.cilinderInhoud = cilinderInhoud;
        this.vermogen = vermogen;
    }

    public int getAantalCilinders() {
        return aantalCilinders;
    }

    public int getCilinderInhoud() {
        return cilinderInhoud;
    }

    public int getVermogen() {
        return vermogen;
    }

    public double getVermogenPerLiter() {
        return 1000.0 * vermogen / cilinderInhoud;
    }

    public String toString() {
        return String.format("%d cilinders %4dcc %3dkW", aantalCilinders, cilinderInhoud, vermogen);
    }
}
