package be.kdg;

import be.kdg.sorteerbaar.Getallen;
import be.kdg.sorteerbaar.Sorteerder;
import be.kdg.sorteerbaar.Woorden;

/**
 * @author Kristiaan Behiels
 * @version 1.0 31/10/13
 */
public class TestSorteerbaar {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 1, 10, 4, 3, 7, 6, 9};
        String[] eurolanden = {
                "Nederland", "België", "Frankrijk", "Duitsland",
                "Italië", "Spanje", "Finland", "Ierland", "Portugal",
                "Oostenrijk", "Luxemburg", "Griekeland", "Slovenië",
                "Cyprus", "Malta", "Slovakije", "Estland", "Letland"
        };

        Sorteerder getallen = new Getallen(numbers);
        System.out.println("getallen = " + getallen);
        getallen.sort();
        System.out.println("getallen = " + getallen);
        getallen.sortReversed();
        System.out.println("getallen = " + getallen);

        Sorteerder woorden = new Woorden(eurolanden);
        System.out.println("woorden = " + woorden);
        woorden.sort();
        System.out.println("woorden = " + woorden);
        woorden.sortReversed();
        System.out.println("woorden = " + woorden);
    }
}


/*
getallen = 5 8 2 1 10 4 3 7 6 9
getallen = 1 2 3 4 5 6 7 8 9 10
getallen = 10 9 8 7 6 5 4 3 2 1
woorden = Nederland België Frankrijk Duitsland Italië Spanje Finland Ierland Portugal Oostenrijk Luxemburg Griekeland Slovenië Cyprus Malta Slovakije Estland Letland
woorden = België Cyprus Duitsland Estland Finland Frankrijk Griekeland Ierland Italië Letland Luxemburg Malta Nederland Oostenrijk Portugal Slovakije Slovenië Spanje
woorden = Spanje Slovenië Slovakije Portugal Oostenrijk Nederland Malta Luxemburg Letland Italië Ierland Griekeland Frankrijk Finland Estland Duitsland Cyprus België

*/
