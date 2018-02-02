package be.kdg.persoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */

/*
Deze klasse mag je zo overnemen.
 */
public class Personen {
    private final List<Persoon> personen;

    public Personen(List<Persoon> data) {
        personen = new ArrayList<>(data);
    }

    public List<Persoon> getPersonen() {
        return personen;
    }

    public void sorteer() {
        Collections.sort(personen);
    }
}
