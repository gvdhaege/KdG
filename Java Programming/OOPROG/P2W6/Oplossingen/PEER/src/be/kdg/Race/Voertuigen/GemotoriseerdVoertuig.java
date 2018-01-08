package be.kdg.Race.Voertuigen;

/**
 * Created by venj on 8/12/2014.
 */
public abstract class GemotoriseerdVoertuig implements Voertuig, Comparable<GemotoriseerdVoertuig> {
    private class Motor {
        private int pk;

        public Motor(int pk) {
            this.pk = pk;
        }
    }

    private Motor motor;
    private int snelheid;
    private String merk;
    private String model;

    public GemotoriseerdVoertuig(int pk, String merk, String model) {
        this.motor = new Motor(pk);
        this.snelheid = 0;
        this.merk = merk;
        this.model = model;
    }

    public int getSnelheid(){
        return this.snelheid;
    }

    protected String getMerk() {
        return merk;
    }

    protected String getModel() {
        return model;
    }

    public String getOmschrijving(){
        return String.format("%s (%s %s)", this.getClass().getSimpleName(), this.getMerk(), getModel());
    }

    @Override
    public void versnel() throws VoertuigException {
            snelheid += this.getSnelheidsFactor();
    }

    @Override
    public void rem() throws VoertuigException {
            if(snelheid > 0)
                snelheid -= getSnelheidsFactor();
            else
                throw new VoertuigException(getOmschrijving() + " stond al stil!", snelheid);
    }

    @Override
    public String toString(){
            return String.format("%s rijdt nu tegen %d km/u"
                                     , getOmschrijving()
                                     , getSnelheid());
    }

    @Override
    public int getSnelheidsFactor() {
        return (motor.pk / 15);
    }

    @Override
    public int compareTo(GemotoriseerdVoertuig o) {
        int compareResult = this.getMerk().compareTo(o.getMerk());
        if(compareResult == 0)
            compareResult = this.getModel().compareTo(o.getModel());

        return compareResult;
    }
}


