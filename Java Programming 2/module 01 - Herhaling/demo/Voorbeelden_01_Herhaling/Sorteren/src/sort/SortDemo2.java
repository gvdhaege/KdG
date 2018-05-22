package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortDemo2 {
    public static final String[] woorden = {
            "Een", "twee", "Drie", "vier", "Vijf",
            "zes", "Zeven", "acht", "Negen", "tien"
    };

    public static void main(String[] args) {
        List<String> woordenlijst = new LinkedList<>(Arrays.asList(woorden));

        System.out.println(woordenlijst);
        // [Een, twee, Drie, vier, Vijf, zes, Zeven, acht, Negen, tien]

        List<String> sortedlist = new LinkedList<>(woordenlijst);
        Collections.sort(sortedlist, String.CASE_INSENSITIVE_ORDER);

        System.out.println(sortedlist);
        // [acht, Drie, Een, Negen, tien, twee, vier, Vijf, zes, Zeven]    }
    }
}
