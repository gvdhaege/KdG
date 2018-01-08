package be.kdg.Race.Weg;

/**
 * Created by venj on 13/12/2014.
 */
public class Parcours {
    protected enum Onderdeel {
        RECHTDOOR(0, 2, 200),
        FLAUW_LINKS(1, 2, 90),
        FLAUW_RECHTS(1, 2, 90),
        LINKS(2, 1, 60),
        RECHTS(2, 1, 60),
        SCHERP_LINKS(4, 1, 40),
        SCHERP_RECHTS(4, 1, 40),
        FINISH(0, 0, 200);

        private int stappenVertragenVoor;
        private int stappenVersnellenNa;
        private int maximumSnelheid;

        Onderdeel(int tragerVoor, int snellerNa, int maximumSnelheid) {
            this.stappenVertragenVoor = tragerVoor;
            this.stappenVersnellenNa = snellerNa;
            this.maximumSnelheid = maximumSnelheid;
        }
    }
}
