package synchronization;

public class Counter {
    private int count = 0;

    public synchronized void increment() { // synchronized toegevoegen
        count++;
    }

    public synchronized void decrement() { // synchronized toegevoegen
        count--;
    }

    public int getCount() {
        return count;
    }
}
