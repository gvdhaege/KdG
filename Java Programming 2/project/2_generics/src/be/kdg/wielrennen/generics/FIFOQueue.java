package be.kdg.wielrennen.generics;

public interface FIFOQueue<T> {
    boolean enqueue(T element, int priority);

    T dequeue();

    int search(T element);

    int getSize();
}
