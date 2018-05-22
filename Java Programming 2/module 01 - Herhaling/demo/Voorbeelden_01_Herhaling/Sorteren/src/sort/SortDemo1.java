package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortDemo1 {
    public static final String[] woorden = {
            "Een", "twee", "Drie", "vier", "Vijf",
            "zes", "Zeven", "acht", "Negen", "tien"
    };

    public static void main(String[] args) {
        List<String> woordenlijst = new LinkedList<>(Arrays.asList(woorden));

        System.out.println(woordenlijst);
        // [Een, twee, Drie, vier, Vijf, zes, Zeven, acht, Negen, tien]

        List<String> sortedlist = new LinkedList<>(woordenlijst);
        Collections.sort(sortedlist);

        System.out.println(sortedlist);
        // [Drie, Een, Negen, Vijf, Zeven, acht, tien, twee, vier, zes]
    }
}