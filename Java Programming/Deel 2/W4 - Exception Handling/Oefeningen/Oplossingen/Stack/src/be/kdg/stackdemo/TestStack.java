package be.kdg.stackdemo;

/**
 * @author Kristiaan Behiels
 * @version 1.0 16/11/13
 */
public class TestStack {
    public static void main(String[] args) {
        String[] alfabet = {"alfa", "bravo", "charlie", "delta", "echo", "foxtrot"};

        Stack stack = new Stack();
       try {
            for (String string : alfabet) {
                stack.push(string);
                System.out.println("Inhoud: " + stack);
            }
       } catch (IndexOutOfBoundsException ex) {
           System.out.println(ex.getMessage());
        }

        System.out.println("\nStack leegmaken.");
        try {
            while (true) {
                String string = stack.pop();
                System.out.println("Afgehaald: " + string);
                System.out.println("Inhoud: " + stack);
            }
       } catch (IndexOutOfBoundsException ex) {
           System.out.println(ex.getMessage());
        }
    }
}

/*
Inhoud: alfa
Inhoud: alfa - bravo
Inhoud: alfa - bravo - charlie
Inhoud: alfa - bravo - charlie - delta
Inhoud: alfa - bravo - charlie - delta - echo
De stack is vol!

Stack leegmaken.
Afgehaald: echo
Inhoud: alfa - bravo - charlie - delta
Afgehaald: delta
Inhoud: alfa - bravo - charlie
Afgehaald: charlie
Inhoud: alfa - bravo
Afgehaald: bravo
Inhoud: alfa
Afgehaald: alfa
Inhoud:
De stack is leeg!
*/
