package stackimpl;

public class LimitedNumericStack<E extends Number> extends LimitedStack<E> {

    public LimitedNumericStack() {
    }

    public LimitedNumericStack(int size) {
        super(size);
    }

    @Override
    public void push(E nieuw) {
        super.push(nieuw);
    }

    @Override
    public E pop() {
        return super.pop();
    }

    @Override
    public E top() {
        return super.top();
    }
}
