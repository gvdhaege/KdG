package be.kdg.mytreeset;

import java.util.*;

/**
 * @author Kristiaan Behiels
 * @version 1.0 16/12/13
 */
public class Bevolking {
    private NavigableSet<Persoon> bevolking = new TreeSet<>();

    public Bevolking() {
        populate();
    }

    private void populate() {
        bevolking.add(new Persoon("Jos", 51));
        bevolking.add(new Persoon("Els", 46));
        bevolking.add(new Persoon("Karel", 48));
        bevolking.add(new Persoon("Jos", 55));
        bevolking.add(new Persoon("Marcel", 49));
        bevolking.add(new Persoon("Loes", 50));
    }

    public String toon() {
        StringBuilder builder = new StringBuilder();
        for (Persoon persoon : bevolking) {
            builder.append(persoon).append(" ");
        }
        return builder.toString();
    }

    public Persoon getEerste() {
        return bevolking.first();
    }

    public Persoon getLaatste() {
        return bevolking.last();
    }

    public Persoon getVolgende(Persoon persoon) {
        return bevolking.higher(persoon);
    }

    public Persoon getVorige(Persoon persoon) {
        return bevolking.lower(persoon);
    }

    public Persoon getCeiling(Persoon persoon) {
        return bevolking.ceiling(persoon);
    }

    public Persoon getFloor(Persoon persoon) {
        return bevolking.floor(persoon);
    }

    public String toonMetHigher() {
        StringBuilder builder = new StringBuilder();
        Persoon persoon = bevolking.first();
        while (persoon != null) {
            builder.append(persoon).append(" ");
            persoon = bevolking.higher(persoon);
        }
        return builder.toString();
    }

    public String toonMetDescendingIterator() {
        StringBuilder builder = new StringBuilder();
        Iterator iterator = bevolking.descendingIterator();  // zie JavaDoc NavigableSet
        while (iterator.hasNext()) {
            builder.append(iterator.next()).append(" ");
        }
        return builder.toString();
    }

    public String toonVolgensLeeftijd() {
        Set<Persoon> helper = new TreeSet<>(new Comparator<Persoon>() {
            @Override
            public int compare(Persoon p1, Persoon p2) {
                return p1.getLeeftijd() - p2.getLeeftijd();
            }
        });
        helper.addAll(bevolking);

        StringBuilder builder = new StringBuilder();
        for (Persoon persoon : helper) {
            builder.append(persoon).append(" ");
        }
        return builder.toString();
    }
}
