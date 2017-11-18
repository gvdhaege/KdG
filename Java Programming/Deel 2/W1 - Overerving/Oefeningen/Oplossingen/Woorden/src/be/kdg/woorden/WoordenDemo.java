package be.kdg.woorden;

import java.util.Arrays;

/**
 * @author Kristiaan Behiels
 * @version 1.0 24/10/13
 */
public class WoordenDemo {
    public static void main(String[] args) {
        Woord[] woorden = {
                new Woord("alfa"),
                new Woord("bravo"),
                new Woord("charlie"),
                new Woord("delta"),
                new Woord("echo")
        };

        System.out.println("Aantal woorden: " + Woord.getAantalWoorden());

        for (Woord woord : woorden) {
            System.out.println(woord.getWoord());
        }

        System.out.println("\nVerglijkingen:");

        Woord woord = new Woord("alfa");
        if (woorden[0].equals(woord)) {
            System.out.println(woorden[0].getWoord() + " = " + woord.getWoord());
        }

        woorden[0] = new Woord("echo");
        woord = new Woord("echo");
        if (woorden[0].equals(woord)) {
            System.out.println(woorden[0].getWoord() + " = " + woord.getWoord());
        }

        woorden[1].setWoord("sierra");
        woord = new Woord("sierra");
        if (woorden[1].equals(woord)) {
            System.out.println(woorden[1].getWoord() + " = " + woord.getWoord());
        }
    }
}

/*
Aantal woorden: 5
alfa
bravo
charlie
delta
echo

Verglijkingen:
alfa = alfa
echo = echo
sierra = sierra
*/
