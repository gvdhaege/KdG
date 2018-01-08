package be.kdg.Race.Weg;

/**
 * Created by venj on 14/12/2014.
 */
public class RechtParcours extends Parcours {
    @Override
    protected void maakParcours() {
        for (int i = 0; i < 10; i++) {
            route.addFirst(Onderdeel.RECHTDOOR);
        }
        route.addLast(Onderdeel.FINISH);
    }
}
