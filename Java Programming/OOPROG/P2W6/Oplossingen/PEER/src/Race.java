import be.kdg.Race.Voertuigen.*;
import be.kdg.Race.Weg.*;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by venj on 8/12/2014.
 */

public class Race {
    private static boolean metUitbreiding1 = false;
    private static boolean metUitbreiding2 = false;
    private static boolean metUitbreiding3 = false;
    private static boolean metUitbreiding4 = true;

    public static void main(String[] args) {
        Race onzeRace = new Race();

        onzeRace.doeRace();

        if (metUitbreiding2)
            onzeRace.toonGemotoriseerdeVoertuigen();
    }

    private void doeRace() {
        HashMap<String, List<Voertuig>> reeksen = new HashMap<String, List<Voertuig>>();
        reeksen.put("Reeks 1", maakReeks1());
        reeksen.put("Auto-reeks", maakReeks2());
        Parcours p1 = null;

        if (metUitbreiding3)
            p1 = new RechtParcours();
        else
            p1 = new OnsEersteParcours();

        p1.startRace(reeksen);
    }

    private List<Voertuig> maakReeks1() {
        List<Voertuig> voertuigenLijst = new ArrayList<Voertuig>();
        voertuigenLijst.add(new Fiets());
        voertuigenLijst.add(new Vrachtwagen(250, "MAN", "TGL"));
        voertuigenLijst.add(new Auto(150, "Volvo", "S40"));
        if(metUitbreiding4){
            voertuigenLijst.add(new Step());
            voertuigenLijst.add(new Brommer("Yahama"));
        }
        else {
            voertuigenLijst.add(new Auto(50, "Fiat", "Panda"));
            voertuigenLijst.add(new Vrachtwagen(200, "DAF", "504"));

        }



        if (metUitbreiding1) {
            Collections.sort(voertuigenLijst, new Comparator<Voertuig>() {
                @Override
                public int compare(Voertuig o1, Voertuig o2) {
                    return o1.getOmschrijving().compareTo(o2.getOmschrijving());
                }
            });
        }

        return voertuigenLijst;
    }

    private List<Voertuig> maakReeks2() {
        List<Voertuig> voertuigenLijst = new ArrayList<Voertuig>();
        voertuigenLijst.add(new Auto(140, "Ford", "Fiesta"));
        voertuigenLijst.add(new Auto(110, "Opel", "Astra"));
        voertuigenLijst.add(new Auto(290, "Ferrari", "GTI4"));
        voertuigenLijst.add(new Auto(160, "Jaguar", "Revolution"));
        voertuigenLijst.add(new Auto(10, "Ford", "Slakka"));

        if (metUitbreiding1) {
            Collections.sort(voertuigenLijst, new Comparator<Voertuig>() {
                @Override
                public int compare(Voertuig o1, Voertuig o2) {
                    return o1.getOmschrijving().compareTo(o2.getOmschrijving());
                }
            });
        }

        return voertuigenLijst;
    }

    private void toonGemotoriseerdeVoertuigen() {
        List<GemotoriseerdVoertuig> lijstje = new ArrayList<GemotoriseerdVoertuig>();
        lijstje.add(new Auto(115, "Renault", "Twingo"));
        lijstje.add(new Auto(145, "Ford", "S-Max"));
        lijstje.add(new Vrachtwagen(250, "MAN", "TGX"));
        lijstje.add(new Auto(135, "Renault", "Scenic"));
        lijstje.add(new Auto(125, "Citroen", "Berlingo"));
        lijstje.add(new Auto(120, "Ford", "C-Max"));

        Collections.sort(lijstje);
        for (GemotoriseerdVoertuig gemotoriseerdVoertuig : lijstje) {
            System.out.println(gemotoriseerdVoertuig.toString());
        }
    }
}
