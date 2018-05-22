package be.kdg.count;

import java.util.Collection;

public class MyUtils {
    public static <Type> int telFrequentie(Type[] reeks, Type teTellenElement) {
        int frequentie = 0;
        for (Type element : reeks) {
            if (teTellenElement.equals(element)) {
                frequentie++;
            }
        }
        return frequentie;
    }

    public static <T> int telFrequentie(Collection<T> collection, T teTellenElement) {
        int frequentie = 0;
        for (T element : collection) {
            if (teTellenElement.equals(element)) {
                frequentie++;
            }
        }
        return frequentie;
    }
}
