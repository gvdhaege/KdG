package be.kdg.Race;

import be.kdg.Race.Voertuigen.*;
import be.kdg.Race.Weg.OnsEersteParcours;
import be.kdg.Race.Weg.Parcours;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by venj on 13/12/2014.
 */
public class Race {
    public static void main(String[] args) {
        Race onzeRace = new Race();
        onzeRace.doeRace();
        onzeRace.toonGemotoriseerdeVoertuigen();
    }

    private void doeRace(){
        //VUL AAN

    }

    private List<Voertuig> maakReeks1(){
        List<Voertuig> voertuigenLijst = new ArrayList<Voertuig>();
       //VUL AAN:

        return voertuigenLijst;
    }

    private List<Voertuig> maakReeks2(){
        List<Voertuig> voertuigenLijst = new ArrayList<Voertuig>();
        //VUL AAN:

        return voertuigenLijst;
    }

    private void toonGemotoriseerdeVoertuigen(){
        List<GemotoriseerdVoertuig> lijstje = new ArrayList<GemotoriseerdVoertuig>();
        /*
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
        */
    }
}
