package be.kdg;

import be.kdg.leden.Leden;
import be.kdg.leden.Lid;

import static be.kdg.leden.Soort.*;
/*
Vul deze klasse aan zodat je de onderstaande uitvoer bekomt.
Tip. Je hebt een for-lus nodig.
 */
public class TestLeden {
    public static void main(String[] args) {
        Leden leden = new Leden();

        leden.voegLidToe(new Lid("Jos", GEWOON));
        leden.voegLidToe(new Lid("Bart", ERELID));
        leden.voegLidToe(new Lid("Helmut", STEUNEND)); // lidnummer = 0
        leden.voegLidToe(new Lid("Marie", GEWOON));
        leden.voegLidToe(new Lid("Emma", GEWOON));
        leden.voegLidToe(new Lid("Hagar", ERELID));
// tot hier
        System.out.println("Aantal actieve leden: " + Lid.getAantalLeden());

        for (int i = 0; i < leden.size(); i++) {
            Lid lid = leden.getLid(i);
            if (lid.getLidNummer() != 0) {
                System.out.println(leden.getLid(i));
            }
        }

    }
}

/*
Aantal actieve leden: 5
 1001 Jos         soort: gewoon
 1002 Bart        soort: erelid
 1003 Marie       soort: gewoon
 1004 Emma        soort: gewoon
 1005 Hagar       soort: erelid
*/