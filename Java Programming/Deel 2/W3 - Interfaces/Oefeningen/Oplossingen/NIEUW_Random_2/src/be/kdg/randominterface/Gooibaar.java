package be.kdg.randominterface;

import java.util.Random;

/**
 * @author Kristiaan Behiels
 * @version 1.0 24/11/14
 *
 * De interface Gooibaar bevat als attribuut een static final object van het type Random met de naam generator.
 * Voorzie een static methode getGenerator.
 * Voorzie een default methode gooi die een willekeurige int waarde teruggeeft.
 */

public interface Gooibaar {
    final static Random generator = new Random();

    public static Random getGenerator() {
        return generator;
    }

    default public int gooi() {
        return generator.nextInt();
    }
}
