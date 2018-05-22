package stackimpl;

import java.util.ArrayList;
import java.util.List;

public class LimitedStack<E> {
    private final int capacity;
    private int count;
    private List<E> elements;

    public LimitedStack() {
        this(10); // default stack size
    }

    public LimitedStack(int size) {
        this.capacity = size > 0 ? size : 10;
        count = 0; // stack is aanvankelijk leeg
        elements = new ArrayList<>(size);
    }

    public void push(E nieuw) {
        if(count >= capacity) {
            throw new FullStackException("Stack is full; can not push " + nieuw);
        }
        elements.add(nieuw); //achteraan toevoegen
        count++;
    }

    public E pop() {
        if (count < 0) {
            throw new EmptyStackException("Stack is empty; can not pop");
        }
        count--;
        return elements.remove(count);
    }

    public E top() {
        if (count < 0) {
            throw new EmptyStackException("Stack is empty; can not pop");
        }
        return elements.get(count - 1); //vooraan tonen
    }

    public int capacity() {
        return capacity;
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < capacity; i++) {
            if (i < count) {
                sb.append(elements.get(i).toString());
            } else {
                sb.append("?");
            }
            if (i < capacity - 1) {
                sb.append(", ");
            } else {
                sb.append("]");
            }
        }
        return sb.toString();
    }
}
