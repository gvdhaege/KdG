package Speelkaarten;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BoekKaarten {
    private List<Speelkaart> kaarten;

    public BoekKaarten() {
        kaarten = new LinkedList<>();
        int aantal = 0;
        for (Speelkaart.Kleur kleur : Speelkaart.Kleur.values()) {
            for (Speelkaart.Waarde waarde : Speelkaart.Waarde.values()) {
                kaarten.add(new Speelkaart(kleur, waarde));
            }
        }
    }

    public void schudden(){
        Collections.shuffle(kaarten);
    }

    public void tonen(){
        for (int i = 0; i < kaarten.size(); i++) {
            System.out.printf("%-19s%s", kaarten.get(i),
                    ((i + 1) % 4 == 0) ? "\n" : " ");
        }
    }
}
