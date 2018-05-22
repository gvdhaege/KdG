package be.kdg.generics;

import java.util.Collection;

public class MyUtil {
    public static <T> String join(Collection<T> collection, String seperator) {
        String string = "";
        for (T element : collection) {
            string += element + seperator;
        }
        return string.substring(0, string.length() - 1);
    }
}
