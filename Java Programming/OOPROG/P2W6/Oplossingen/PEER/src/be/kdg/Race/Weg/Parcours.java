package be.kdg.Race.Weg;

import be.kdg.Race.Voertuigen.GemotoriseerdVoertuig;
import be.kdg.Race.Voertuigen.Voertuig;
import be.kdg.Race.Voertuigen.VoertuigException;

import java.util.*;

/**
 * Created by venj on 8/12/2014.
 */
public abstract class Parcours {
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

    protected LinkedList<Onderdeel> route;

    public Parcours() {
        route = new LinkedList<Onderdeel>();
        maakParcours();
    }

    protected abstract void maakParcours();

    public void startRace(HashMap<String, List<Voertuig>> deelnemers) {

        for (String reeks : deelnemers.keySet()) {
            System.out.println("=================================");
            System.out.println("We starten met de reeks " + reeks);
            System.out.println("=================================");
            List<Voertuig> reeksDeelnemers = deelnemers.get(reeks);
            //Start alle gemotoriseerde voertuigen
           /* for (Voertuig deelnemer : reeksDeelnemers) {
                if (deelnemer instanceof GemotoriseerdVoertuig)
                    ((GemotoriseerdVoertuig) deelnemer).start();
            }*/

            //Haal het parkoor op een loop één voor één door het parcour
            ListIterator<Onderdeel> parcours = route.listIterator(0);
            while (parcours.hasNext()) {
                Onderdeel huidigOnderdeel = parcours.next();

                //Elk voertuig moet dit parkour overlopen
                Iterator<Voertuig> voertuigIterator = reeksDeelnemers.iterator();
                while (voertuigIterator.hasNext()) {
                    Voertuig huidigVoertuig = voertuigIterator.next();
                    try {
                        for (int i = 0; i < huidigOnderdeel.stappenVertragenVoor; i++) {
                            huidigVoertuig.rem();
                        }
                        if (huidigVoertuig.getSnelheid() > huidigOnderdeel.maximumSnelheid)
                            throw new VoertuigException(huidigVoertuig.getOmschrijving() + " gaat te snel", huidigVoertuig.getSnelheid());


                        for (int i = 0; i < huidigOnderdeel.stappenVersnellenNa; i++) {
                            huidigVoertuig.versnel();
                        }
                    } catch (VoertuigException ve) {
                        System.out.println("==> UIT KOERS: " + ve.getMessage());
                        voertuigIterator.remove();
                    }
                }

                System.out.println("Status na onderdeel " + huidigOnderdeel.name());
                for (Voertuig overblijvendVoertuig : reeksDeelnemers) {
                    System.out.println("    " + overblijvendVoertuig.toString());
                }
            }
        }
    }
}
