import data.OptredenData;
import model.Optreden;

import java.util.List;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, List<Optreden>> optredenMap = OptredenData.maakMap();

        System.out.println("OVERZICHT per podium:");
        for (String podium : optredenMap.keySet()) {
            System.out.println("\n" + podium + ":");
            for (Optreden o : optredenMap.get(podium)) {
                System.out.println(o);
            }
        }
    }
}

/*
Verwachte afdruk:
OVERZICHT per podium:

Main Stage:
Faithless (Main Stage, 14u30)--> *****
Editors (Main Stage, 16u)--> ****
Muse (Main Stage, 19u)--> *****
Pink (Main Stage, 20u30)--> **

Marquee:
The Specials (Marquee, 13u10)--> *****
Florence and the Machine (Marquee, 18u45)--> ***
Editors (Marquee, 21u20)--> ****

Pyramid Marquee:
Faithless (Pyramid Marquee, 19u)--> *****
Absynthe Minded (Pyramid Marquee, 21u45)--> *****
Empire of the Sun (Pyramid Marquee, 23u45)--> *****

*/