package sort;

import java.util.*;

public class SortDemo3 {
    public static final String[] woorden = {
            "Een", "twee", "Drie", "vier", "Vijf",
            "zes", "Zeven", "acht", "Negen", "tien"
    };

    public static void main(String[] args) {
        List<String> woordenlijst = new LinkedList<>(Arrays.asList(woorden));

        System.out.println(woordenlijst);
        // [Een, twee, Drie, vier, Vijf, zes, Zeven, acht, Negen, tien]

        List<String> sortedlist = new LinkedList<>(woordenlijst);
        Collections.sort(sortedlist, new MyStringComparator());

        System.out.println(sortedlist);
        // [Zeven, zes, Vijf, vier, twee, tien, Negen, Een, Drie, acht]
    }
}
