package be.kdg.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static be.kdg.blackjack.SpeelKaart.KaartKleur;
import static be.kdg.blackjack.SpeelKaart.KaartWaarde;

/*
Vul de klasse als volgt aan:
De methode maakKaarten voegt aan de ArrayList 52 kaarten zodanig dat elke mogelijke speelkaart exact 1 keer voorkomt.
De kaarten worden geschud zodat ze in willekeurige volgorde staan.
Tip! maak gebruik van de values() enum-methode en schud de kaarten met Collections.shuffle.
De methode neemKaart geeft telkens de volgende kaart in de ArrayList kaarten. Hierbij maak je gebruik van teller.
Wanneer de laatste (52ste) kaart genomen is zet je de teller terug op 0 en schud je de kaarten opnieuw.
 */
public class Kaarten {
    private int teller = 0;
    private final List<SpeelKaart> kaarten = new ArrayList<>();

    public Kaarten() {
         maakKaarten();
    }
//
    private void maakKaarten() {
        KaartKleur[] kleuren = KaartKleur.values();
        KaartWaarde[] waarden = KaartWaarde.values();
        for (KaartKleur kleur : kleuren) {
            for (KaartWaarde waarde : waarden) {
                SpeelKaart kaart = new SpeelKaart(kleur, waarde);
                kaarten.add(kaart);
            }
        }
        Collections.shuffle(kaarten);
    }

    public SpeelKaart neemKaart() {
        SpeelKaart kaart = kaarten.get(teller++);
        if (teller == 52) {
            teller = 0;
            Collections.shuffle(kaarten);
        }
        return kaart;
    }
}
