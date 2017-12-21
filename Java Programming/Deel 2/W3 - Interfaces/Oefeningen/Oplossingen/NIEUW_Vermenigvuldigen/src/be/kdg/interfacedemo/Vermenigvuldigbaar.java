package be.kdg.interfacedemo;

/**
 * @author Kristiaan Behiels
 * @version 1.0 23/11/2014 12:28
 */
public interface Vermenigvuldigbaar {
    int vermenigvuldig(int x, int y);

    default int kwadraat(int x) {
        return vermenigvuldig(x, x);
    }

    default int derdeMacht(int x) {
        return vermenigvuldig(vermenigvuldig(x, x), x);
    }
}
