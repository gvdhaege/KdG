package be.kdg.Race.Voertuigen;

/**
 * Created by venj on 14/12/2014.
 */
public class Step implements  Voertuig {
    private int snelheid = 0;

    @Override
    public void versnel() throws VoertuigException {
        snelheid += getSnelheidsFactor();
    }

    @Override
    public void rem() throws VoertuigException {
        if(snelheid <= 0)
            throw  new VoertuigException("Step staat al stil, remmen kan niet meer", getSnelheid());
        snelheid -= getSnelheidsFactor();
    }

    @Override
    public String getOmschrijving() {
        return "Step";
    }

    @Override
    public int getSnelheid() {
        return snelheid;
    }

    @Override
    public int getSnelheidsFactor() {
        return 3;
    }

    @Override
    public String toString() {
        return String.format("%s rijdt nu %d km/u", getOmschrijving(), getSnelheid());
    }
}
