package be.kdg.Race.Weg;

/**
 * Created by venj on 13/12/2014.
 */
public class OnsEersteParcours extends Parcours {
    @Override
     protected void maakParcours() {
        route.clear();
        route.addFirst(Onderdeel.RECHTDOOR);
        route.add(Onderdeel.RECHTDOOR);
        route.add(Onderdeel.FLAUW_LINKS);
        route.add(Onderdeel.RECHTDOOR);
        route.add(Onderdeel.FLAUW_RECHTS);
        route.add(Onderdeel.SCHERP_RECHTS);
        route.add(Onderdeel.RECHTDOOR);
        route.add(Onderdeel.SCHERP_LINKS);
        route.add(Onderdeel.FINISH);
    }
}
