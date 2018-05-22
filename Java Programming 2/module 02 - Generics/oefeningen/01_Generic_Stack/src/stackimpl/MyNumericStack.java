package stackimpl;

public class MyNumericStack<E extends Number> {
    private LimitedStack<E> myStack;

    public MyNumericStack() {
        this.myStack = new LimitedStack<>();
    }

    public void push(E nummer) {
        myStack.push(nummer);
    }

    public E top() {
        return myStack.top();
    }

    public int capacity() {
        return myStack.capacity();
    }

    public int size() {
        return myStack.size();
    }

    public E pop() {
        return myStack.pop();
    }

    @Override
    public String toString() {
        return myStack.toString();
    }
}
