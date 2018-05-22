package data;

import model.Optreden;

import java.util.*;

public class OptredenData {
    private static Optreden[] optredens = {
            new Optreden("Editors", "Main Stage", 16, 0, 4),
            new Optreden("Empire of the Sun", "Pyramid Marquee", 23, 45, 5),
            new Optreden("Florence and the Machine", "Marquee", 18, 45, 3),
            new Optreden("The Specials", "Marquee", 13, 10, 5),
            new Optreden("Muse", "Main Stage", 19, 0, 5),
            new Optreden("Faithless", "Main Stage", 14, 30, 5),
            new Optreden("Absynthe Minded", "Pyramid Marquee", 21, 45, 5),
            new Optreden("Pink", "Main Stage", 20, 30, 2),
            new Optreden("Editors", "Marquee", 21, 20, 4),
            new Optreden("Faithless", "Pyramid Marquee", 19, 0, 5)
            };

    public static Map<String, List<Optreden>> maakMap() {
        Map<String, List<Optreden>> myMap = new TreeMap<>();

        for(Optreden o : optredens) {
            List<Optreden> myList;
            if(myMap.containsKey(o.getPodium())) {
                myList = myMap.get(o.getPodium());
            }
            else {
                myList = new ArrayList<>();
            }
            myList.add(o);
            Collections.sort(myList);
            myMap.put(o.getPodium(), myList);
        }

        return myMap;
    }
}

/*
Verwachte afdruk:
OVERZICHT per podium:

Marquee:
The Specials (Marquee, 13u10)--> *****
Florence and the Machine (Marquee, 18u45)--> ***
Editors (Marquee, 21u20)--> ****

Pyramid Marquee:
Faithless (Pyramid Marquee, 19u)--> *****
Absynthe Minded (Pyramid Marquee, 21u45)--> *****
Empire of the Sun (Pyramid Marquee, 23u45)--> *****

Main Stage:
Faithless (Main Stage, 14u30)--> *****
Editors (Main Stage, 16u)--> ****
Muse (Main Stage, 19u)--> *****
Pink (Main Stage, 20u30)--> **
*/