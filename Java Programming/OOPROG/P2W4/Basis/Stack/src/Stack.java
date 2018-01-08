public class Stack {
    private final int MAX = 5;
    private String[] stack = new String[MAX];
    private int count = 0;

    public void push(String nieuw) throws IndexOutOfBoundsException {
        try {
            stack[count] = nieuw;
            count++;
        } catch (Exception e) {
            throw new IndexOutOfBoundsException("De stack is vol!");
        }
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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(stack[i]);
            if (i < count - 1) {
                sb.append(" - ");
            }
        }
        return sb.toString();
    }
}
