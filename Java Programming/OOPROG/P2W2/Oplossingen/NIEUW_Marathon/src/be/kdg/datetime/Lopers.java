package be.kdg.datetime;

import java.util.Arrays;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25/10/2014
 */
public class Lopers {
    private static int aantalLopers;
    private Loper[] lopers;

    public Lopers(int aantalLopers) {
        lopers = new Loper[aantalLopers];
    }

    public void voegLoperToe(Loper loper) {
        lopers[aantalLopers++] = loper;
    }

    public static int getAantalLopers() {
        return aantalLopers;
    }

    public Loper[] getLopers() {
        return lopers;
    }

    public void sorteerVolgensTijd() {
        Arrays.sort(lopers);
    }
}
