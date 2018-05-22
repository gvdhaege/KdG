package be.kdg.count;

import java.util.Collection;

// Op dit moment zijn beide methoden alleen geldig voor het type String
// en moeten ze beiden nog aangevuld worden met het eigenlijke tellen.

public class MyUtils {
    public static <T> int telFrequentie(T[] reeks, T teTellenElement) {
        int frequentie = 0;

        for (T element : reeks) {
            if (element.equals(teTellenElement)) {
                frequentie++;
            }
        }

        return frequentie;
    }

    public static <T> int telFrequentie(Collection<T> collection, T teTellenElement) {
        int frequentie = 0;

        for (T element : collection) {
            if (element.equals(teTellenElement)) {
                frequentie++;
            }
        }

        return frequentie;
    }
}
