package sort;

import java.util.Comparator;

public class MyStringComparator implements Comparator<String> {
    public int compare(String first, String second) {
        return second.compareToIgnoreCase(first);
    }
}

