import data.OptredenData;
import model.Optreden;
import model.OptredenComparator;

import java.util.Collections;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<Optreden> optredenList = OptredenData.maakList();

        System.out.println("ONGESORTEERD:");
        for(Optreden o: optredenList) {
            System.out.println(o);
        }

        Collections.sort(optredenList);
        System.out.println("\nGESORTEERD op sterren:");
        for(Optreden o: optredenList) {
            System.out.println(o);
        }

        Collections.sort(optredenList, new OptredenComparator());
        System.out.println("\nGESORTEERD op naam:");
        for(Optreden o: optredenList) {
            System.out.println(o);
        }
    }
}

/* Verwachte afdruk:
ONGESORTEERD:
Editors (Main Stage, 16u)--> ****
Empire of the Sun (Pyramid Marquee, 23u45)--> *****
Florence and the Machine (Marquee, 18u45)--> ***
The Specials (Marquee, 13u10)--> *****
Muse (Main Stage, 19u)--> *****
Faithless (Main Stage, 14u30)--> *****
Absynthe Minded (Pyramid Marquee, 21u45)--> *****
Pink (Main Stage, 20u30)--> **
Editors (Marquee, 21u20)--> ****
Faithless (Pyramid Marquee, 19u)--> *****

GESORTEERD op sterren:
Empire of the Sun (Pyramid Marquee, 23u45)--> *****
The Specials (Marquee, 13u10)--> *****
Muse (Main Stage, 19u)--> *****
Faithless (Main Stage, 14u30)--> *****
Absynthe Minded (Pyramid Marquee, 21u45)--> *****
Faithless (Pyramid Marquee, 19u)--> *****
Editors (Main Stage, 16u)--> ****
Editors (Marquee, 21u20)--> ****
Florence and the Machine (Marquee, 18u45)--> ***
Pink (Main Stage, 20u30)--> **

GESORTEERD op naam:
Absynthe Minded (Pyramid Marquee, 21u45)--> *****
Editors (Main Stage, 16u)--> ****
Editors (Marquee, 21u20)--> ****
Empire of the Sun (Pyramid Marquee, 23u45)--> *****
Faithless (Main Stage, 14u30)--> *****
Faithless (Pyramid Marquee, 19u)--> *****
Florence and the Machine (Marquee, 18u45)--> ***
Muse (Main Stage, 19u)--> *****
Pink (Main Stage, 20u30)--> **
The Specials (Marquee, 13u10)--> *****
*/