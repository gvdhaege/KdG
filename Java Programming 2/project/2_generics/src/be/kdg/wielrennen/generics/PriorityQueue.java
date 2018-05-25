package be.kdg.wielrennen.generics;

import java.util.*;

/**
 * De klasse PriorityQueue is een gecustomiseerde implementatie van de Java Util versie.
 * Deze klasse kan elementen volgens het FIFO principe in de wachtrij zetten alsook er terug uithalen.
 *
 * @param <T> het element in de wachtrij
 * @author Steven Excelmans
 * @version 1.0
 */
public class PriorityQueue<T> implements FIFOQueue<T> {
    private int count;
    /**
     * Map met prioriteit en LinkedList met elementen.
     */
    private TreeMap<Integer, LinkedList<T>> map = new TreeMap<>(Comparator.reverseOrder());

    /**
     * Constructor om een PriorityQueue object aan te maken.
     */
    public PriorityQueue() {
        this.count = 0;
    }

    /**
     * Zet een element in de wachtrij volgens de opgegeven prioriteit, deze methode gaat eerst controleren of het element reeds bestaat.
     *
     * @param element  het element dat in de wachtrij gezet dient te worden
     * @param priority de prioriteit waarmee het element in de wachtrij dient gezet te worden
     * @return true als het element nog niet bestond en het succesvol is toegevoegd aan de wachtrij
     */
    @Override
    public boolean enqueue(T element, int priority) {
        for (LinkedList<T> ts : map.values()) {
            for (T t : ts) {
                if (element.equals(t)) {
                    return false;
                }
            }
        }
        if (map.containsKey(priority)) {
            count++;
            return map.get(priority).add(element);
        } else {
            map.put(priority, new LinkedList<T>());
            count++;
            return map.get(priority).add(element);
        }
    }

    /**
     * Geeft het element terug dat zich vooraan in de hoogste prioriteitsreeks bevindt.
     *
     * @return het element vooraan in de hoogste prioriteitsreeks, indien er geen element(en) bestaat null
     */
    @Override
    public T dequeue() {
        for (Integer integer : map.keySet()) {
            if (map.get(integer).size() == 0) {
                map.remove(integer);
            }
            if (map.get(map.firstKey()).size() > 0) {
                count--;
                return map.get(map.firstKey()).removeFirst();
            }
        }
        return null;
    }

    /**
     * Zoekt het element in de wachtrij.
     *
     * @param element het te zoeken element
     * @return het element indien dit gevonden is in de wachtrij, anders -1
     */
    @Override
    public int search(T element) {
        List<T> elements = new ArrayList<>();
        for (LinkedList<T> ts : map.values()) {
            elements.addAll(ts);
        }

        if (elements.contains(element)) {
            return elements.indexOf(element) + 1;
        } else {
            return -1;
        }
    }

    /**
     * @return het totaal aantal elementen in de wachtrij
     */
    @Override
    public int getSize() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (Integer integer : map.keySet()) {
            for (T t : map.get(integer)) {
                temp.append(String.format("%d: %s\n", integer, t));
            }
        }
        return temp.toString();
    }
}
