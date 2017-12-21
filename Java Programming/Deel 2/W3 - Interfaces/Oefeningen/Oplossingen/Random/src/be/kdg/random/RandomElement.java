package be.kdg.random;

import java.util.Random;

/*
De klasse RandomElement bevat als attribuut een private static final object van het type Random met de naam generator.
Het wordt bij creatie van de klasse meteen gemaakt.
Voorzie een static methode getGenerator.
Voorzie een methode gooi die een willekeurige int waarde teruggeeft.
 */
public class RandomElement implements Gooibaar {
    private final static Random generator = new Random();

    public static Random getGenerator() {
        return generator;
    }

    public int gooi() {
        return generator.nextInt();
    }
}
