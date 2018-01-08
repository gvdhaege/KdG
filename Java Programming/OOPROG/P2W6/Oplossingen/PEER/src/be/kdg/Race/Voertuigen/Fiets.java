package be.kdg.Race.Voertuigen;

/**
 * Created by venj on 8/12/2014.
 */
public class Fiets implements Voertuig {
    private int snelheid;
    private final int MAX_SNELHEID = 30;

    @Override
    public void versnel() throws VoertuigException{
        if(snelheid + getSnelheidsFactor() > MAX_SNELHEID)
            throw new VoertuigException("Ai, we gaan te hard doortrappen, dat mag niet", snelheid + getSnelheidsFactor());

       snelheid += getSnelheidsFactor();
    }

    @Override
    public void rem() throws VoertuigException {
        if(snelheid <= 0)
            throw new VoertuigException("'k Sta al stil, dus remmen gaat niet meer!", snelheid);

        snelheid -= getSnelheidsFactor();
    }

    @Override
    public int getSnelheid(){
        return snelheid;
    }


    @Override
    public String getOmschrijving() {
        return "Fietske";
    }

    @Override
    public String toString(){
       return String.format("%s rijdt nu tegen %d km/u", getOmschrijving(), snelheid);
    }
}
