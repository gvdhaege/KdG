package be.kdg.wielrennen.generics;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeMap;

public class PriorityQueue<T> implements FIFOQueue<T> {
    private TreeMap<Integer, LinkedList<T>> map = new TreeMap<>(Comparator.reverseOrder());

    //TODO search, dequeue, ... from 2.4

    public PriorityQueue() {
    }

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
            return map.get(priority).add(element);
        } else {
            map.put(priority, new LinkedList<T>());
            return map.get(priority).add(element);
        }
    }

    @Override
    public T dequeue() {
        int hoogstePrio = Integer.MAX_VALUE;
        for (Integer integer : map.keySet()) {
            if (integer < hoogstePrio) {
                hoogstePrio = integer;
            }
        }
        if (map.get(hoogstePrio).get(0) != null) {
            return map.get(hoogstePrio).get(0);
        } else {
            return null;
        }
    }

    @Override
    public int search(T element) {
        for (LinkedList<T> ts : map.values()) {
            if (ts.contains(element)) {
                return ts.indexOf(element);
            }
        }
        return -1;
    }

    @Override
    public int getSize() {
        return map.size();
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
