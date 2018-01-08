package be.kdg.Race.Voertuigen;

/**
 * Created by venj on 8/12/2014.
 */
public class VoertuigException extends  Exception {
    private int snelheid;

    public VoertuigException(String message, int snelheid) {
        super(message);
        this.snelheid = snelheid;
    }

    @Override
    public String getMessage() {
        return String.format("%s (%d km/u)", super.getMessage(), this.snelheid);
    }
}
