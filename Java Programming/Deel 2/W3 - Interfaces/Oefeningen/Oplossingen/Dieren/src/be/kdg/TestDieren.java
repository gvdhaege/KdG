package be.kdg;

import be.kdg.dieren.*;

/**
 * In deze klasse moet (mag) je niets wijzigen. Ze dient alleen om
 * de werking van de overige klassen en interfaces te testen.
 * Zie ook de verwacht uitvoer onderaan.
 */
public class TestDieren {
    public static void main(String[] args) {
        Dieren dieren = new Dieren();

        dieren.add(new Arend("eagle", 2, 50, 160));
        dieren.add(new Struisvogel("struis", 6));
        dieren.add(new Zwaluw("schwalbe", 4, 120));
        dieren.toon();

         Dier dier = new Arend("eagle", 2, 50, 160);
         Vliegend vliegend = new Arend("eagle", 2, 50, 160);
         Eierleggend eierleggend = new Arend("eagle", 2, 50, 160);

        System.out.println(dier);
        System.out.println(vliegend);
        System.out.println(eierleggend);
     }
}

/*
Naam: eagle
Eieren: 2
Snelheid: 50 km/h
Duiksnelheid: 160 km/h

Naam: struis
Eieren: 6

Naam: schwalbe
Eieren: 4
Snelheid: 120 km/h

Naam: eagle
Eieren: 2
Snelheid: 50 km/h
Duiksnelheid: 160 km/h

Naam: eagle
Eieren: 2
Snelheid: 50 km/h
Duiksnelheid: 160 km/h

Naam: eagle
Eieren: 2
Snelheid: 50 km/h
Duiksnelheid: 160 km/h
*/


