package be.kdg;

import be.kdg.werknemer.Arbeider;
import be.kdg.werknemer.Bediende;
import be.kdg.werknemer.Werknemer;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25-okt-2009
 */

/*
Deze klasse kan je gebruiken om de werking van de andere klassen uit te testen.
Je moet ze nog wel aanvullen met een for-lus (ev. for-each) om alle elementen van de tabel werknemers te doorlopen en af te drukken via de toString-methode.
Zie de verwachte afdruk hieronder.
 */
public class TestWerknemer {
    public static void main(String[] args) {
        Werknemer[] werknemers = {
            new Arbeider("Jos", 57082332149L, 38),
            new Arbeider("Els", 61030350468L, 40),
            new Bediende("Erik", 54110774131L, 1.6)
        };
//
        for (Werknemer werknemer : werknemers) {
            System.out.println(werknemer);
        }
    }
}

/*

Naam: Jos
Nummer: 57082332149
Loon: €475.0

Naam: Els
Nummer: 61030350468
Loon: €512.5

Naam: Erik
Nummer: 54110774131
Loon: €3840.0

*/

