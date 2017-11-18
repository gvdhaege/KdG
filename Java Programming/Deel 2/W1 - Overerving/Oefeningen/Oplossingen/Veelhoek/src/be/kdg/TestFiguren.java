package be.kdg;

import be.kdg.veelhoek.*;

/**
 * @author Kristiaan Behiels
 * @version 1.1 21-okt-2013
 */

/*
Gebruik deze klasse om de overige klassen te testen.
 */
public class TestFiguren {
   public static void main(String[] args) {
        Figuren figuren = new Figuren();

        //getAantal testen:
        System.out.println("Aantal voor toevoegen: " + figuren.getAantal());

        //toevoegen testen:
        figuren.voegFiguurToe(new Driehoek("rood", 6, 4));
        figuren.voegFiguurToe(new Rechthoek("blauw", 5, 10));
        figuren.voegFiguurToe(new Vierkant("geel", 8));
        figuren.voegFiguurToe(new Driehoek("zwart", 2, 8));

        //getAantal opnieuw testen:
        System.out.println("Aantal na toevoegen: " + figuren.getAantal());

        //We nemen er de derde uit:
        Veelhoek derde = figuren.neemFiguurWeg(2);
        System.out.println("\nDe derde veelhoek is:\n" + derde.toString());

        //getAantal opnieuw testen:
        System.out.println("Aantal na wegnemen: " + figuren.getAantal());

        //toString testen:
        System.out.println("\nAlle figuren:\n" + figuren.toString());
    }
}

/* Verwachte afdruk:

Aantal voor toevoegen: 0
Aantal na toevoegen: 4

De derde veelhoek is:
VIERKANT (geel)
    zijde: 8.0
    oppervlakte: 64.0
Aantal na wegnemen: 3

Alle figuren:
RECHTHOEK (blauw)
    lengte: 10.0
    breedte: 5.0
    oppervlakte: 50.0
VIERKANT (geel)
    zijde: 8.0
    oppervlakte: 64.0
DRIEHOEK (zwart)
    basis: 2.0
    hoogte: 8.0
    oppervlakte: 8.0

*/
