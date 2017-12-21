package Kind;

import java.util.Comparator;

public class LeeftijdComparator implements Comparator<Kind> {

    @Override
    public int compare(Kind o1, Kind o2) {
        return o1.getLeeftijd() - o2.getLeeftijd();
    }
}
