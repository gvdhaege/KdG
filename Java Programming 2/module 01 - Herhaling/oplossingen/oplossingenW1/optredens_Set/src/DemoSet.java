import data.OptredenData;
import model.Optreden;

import java.util.Set;
import java.util.TreeSet;

public class DemoSet {
    public static void main(String[] args) {
        Set<Optreden> optredenSet = OptredenData.maakSet();
        
        System.out.println("ZONDER DUBBELS EN ONGESORTEERD:");
        for(Optreden o: optredenSet) {
            System.out.println(o);
        }

        Set<Optreden> sortedSet = new TreeSet<Optreden>(optredenSet);
        System.out.println("\nGESORTEERD op naam:");
        for(Optreden o: sortedSet) {
            System.out.println(o);
        }
    }
}

/* Verwachte afdruk:
ZONDER DUBBELS EN ONGESORTEERD:
The Specials (Marquee, 13u10)--> *****
Empire of the Sun (Pyramid Marquee, 23u45)--> *****
Florence and the Machine (Marquee, 18u45)--> ***
Pink (Main Stage, 20u30)--> **
Muse (Main Stage, 19u)--> *****
Absynthe Minded (Pyramid Marquee, 21u45)--> *****
Editors (Main Stage, 16u)--> ****
Faithless (Main Stage, 14u30)--> *****

GESORTEERD op naam:
Absynthe Minded (Pyramid Marquee, 21u45)--> *****
Editors (Main Stage, 16u)--> ****
Empire of the Sun (Pyramid Marquee, 23u45)--> *****
Faithless (Main Stage, 14u30)--> *****
Florence and the Machine (Marquee, 18u45)--> ***
Muse (Main Stage, 19u)--> *****
Pink (Main Stage, 20u30)--> **
The Specials (Marquee, 13u10)--> *****
*/