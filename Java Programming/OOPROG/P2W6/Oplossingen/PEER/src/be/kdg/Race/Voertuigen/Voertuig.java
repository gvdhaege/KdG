package be.kdg.Race.Voertuigen;

/**
 * Created by venj on 8/12/2014.
 */
public interface Voertuig {
    void versnel() throws VoertuigException;
    void rem() throws VoertuigException;
    String getOmschrijving();
    int getSnelheid();

    default int getSnelheidsFactor() {
        return 5;
    }
}
