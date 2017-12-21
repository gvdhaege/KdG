package be.kdg;

import be.kdg.planeten.Planeten;

/**
 * @author Kristiaan Behiels
 * @version 1.0 31/10/2013
 */

/*
Gebruik deze klasse om de klassen Planeet en Planeten te testen.
 */
public class TestPlaneten {
    public static void main(String[] args) {
        Planeten planeten = new Planeten();

        // Standaard volgorde
        System.out.println("Standaard volgorde:\n" + planeten);

        // Volgens diameter
        planeten.sorteer();
        System.out.println("Volgens diameter:\n" + planeten);

        // Volgens diameter (grootste eerst)
        planeten.sorteerDiameter();
        System.out.println("Volgens diameter (grootste eerst):\n" + planeten);

        // Alfabetisch
        planeten.sorteerNaam();
        System.out.println("Alfabetisch:\n" + planeten);

        // Volgens relatieve massa
        planeten.sorteerMassa();
        System.out.println("Volgens relatieve massa:\n" + planeten);
    }
}

/*
Standaard volgorde:
Mercurius     4800   0,1
Venus        12104   0,9
Aarde        12756   1,0
Mars          6794   0,1
Jupiter     142984 318,0
Saturnus    120536  95,0
Uranus       51118  15,0
Neptunus     49572  17,0

Volgens diameter:
Mercurius     4800   0,1
Mars          6794   0,1
Venus        12104   0,9
Aarde        12756   1,0
Neptunus     49572  17,0
Uranus       51118  15,0
Saturnus    120536  95,0
Jupiter     142984 318,0

Volgens diameter (grootste eerst):
Jupiter     142984 318,0
Saturnus    120536  95,0
Uranus       51118  15,0
Neptunus     49572  17,0
Aarde        12756   1,0
Venus        12104   0,9
Mars          6794   0,1
Mercurius     4800   0,1

Alfabetisch:
Aarde        12756   1,0
Jupiter     142984 318,0
Mars          6794   0,1
Mercurius     4800   0,1
Neptunus     49572  17,0
Saturnus    120536  95,0
Uranus       51118  15,0
Venus        12104   0,9

Volgens relatieve massa:
Jupiter     142984 318,0
Saturnus    120536  95,0
Neptunus     49572  17,0
Uranus       51118  15,0
Aarde        12756   1,0
Venus        12104   0,9
Mars          6794   0,1
Mercurius     4800   0,1
*/