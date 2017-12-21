package be.kdg;

import be.kdg.minmax.Getallen;
import be.kdg.minmax.Strings;

/**
 * Deze klasse dient om je programma te testen. Hier mag je niets wijzigen.
 * Zie onderaan voor de verwachte afdruk.
 */
public class TestMinMax {
    public static void main(String[] args) {
        Getallen getallen = new Getallen();
        getallen.add(123);
        getallen.add(341);
        getallen.add(67);
        getallen.add(208);

        System.out.print("getallen: ");
        getallen.toon();
        System.out.println("kleinste: " + getallen.minimum());
        System.out.println("grootste: " + getallen.maximum());

        Strings dranken = new Strings();
        dranken.add("Cognac");
        dranken.add("Armagnac");
        dranken.add("Vodka");
        dranken.add("Jenever");

        System.out.print("dranken: ");
        dranken.toon();
        System.out.println("eerste: " + dranken.minimum());
        System.out.println("laatste: " + dranken.maximum());
    }
}

/*
getallen: 123 341 67 208
kleinste: 67
grootste: 341
dranken: Cognac Armagnac Vodka Jenever
eerste: Armagnac
laatste: Vodka
*/
