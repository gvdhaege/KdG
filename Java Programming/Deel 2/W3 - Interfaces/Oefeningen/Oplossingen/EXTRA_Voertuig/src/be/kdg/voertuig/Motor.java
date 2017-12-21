package be.kdg.voertuig;

/**
 * Aan deze interface mag (hoef) je niets te wijzigen.
 */
public interface Motor {
    int getAantalCilinders();

    int getCilinderInhoud();

    int getVermogen();

    double getVermogenPerLiter();
}
