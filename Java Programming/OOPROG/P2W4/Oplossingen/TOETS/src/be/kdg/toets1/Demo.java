package be.kdg.toets1;

/**
 * @author Kristiaan Behiels
 * @version 1.0 15/11/13
 */
public class Demo {
    private int value;

    public Demo(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Negatieve waarde!");
        }
        this.value = value;
    }

    public static void main(String[] args) {
        try {
            Demo object = new Demo(-1);
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
    }
}


