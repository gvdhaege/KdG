package be.kdg.stackdemo;

/**
 * @author Kristiaan Behiels
 * @version 1.0 16/11/13
 */
public class Stack {
    private static final int MAX = 5;
    private String[] stack = new String[MAX];
    private int count;

    public void push(String string) throws IndexOutOfBoundsException {
        if (count == MAX) {
            throw new IndexOutOfBoundsException("De stack is vol!");
        }
        stack[count++] = string;
    }

    public String pop() throws IndexOutOfBoundsException {
        count--;
        if (count < 0) {
            throw new IndexOutOfBoundsException("De stack is leeg!");
        }
        return stack[count];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(stack[i]);
            if (i < count - 1) {
                builder.append(" - ");
            }
        }
        return builder.toString();
    }
}
