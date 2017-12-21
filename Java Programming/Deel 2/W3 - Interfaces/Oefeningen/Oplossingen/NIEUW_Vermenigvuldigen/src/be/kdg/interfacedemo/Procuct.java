package be.kdg.interfacedemo;

/**
 * @author Kristiaan Behiels
 * @version 1.0 23/11/2014 12:35
 */
public class Procuct implements Vermenigvuldigbaar {
    @Override
    public int vermenigvuldig(int x, int y) {
        return x * y;
    }
}
