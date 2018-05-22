package model;

import java.util.Comparator;

public class OptredenComparator implements Comparator<Optreden> {
    @Override
    public int compare(Optreden o1, Optreden o2) {
        return o1.getNaam().compareTo(o2.getNaam());
    }
}
