package be.kdg.voertuig;

/**
 * Aan deze interface mag (hoef) je niets te wijzigen.
 */
public interface Auto {
    String getMerk();

    String getType();

    Motor getMotor();

    int getGewicht();

    double kgPerKw();

    double getVermogenPerLiter();
}
