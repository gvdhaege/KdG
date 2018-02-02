package be.kdg.klassen;

/**
 * @author Kristiaan Behiels
 * @version 1.0 14/11/13
 */
public class TestString {
    public static void main(String[] args) {
        String regel = "The quick brown fox jumps over the lazy dog";

        System.out.println("regel = " + regel);
        System.out.println("lengte = " + regel.length());

        System.out.println(regel.toUpperCase());
        System.out.println(regel.toLowerCase());

        String nieuw = regel.replace('a', 'o');
        System.out.println("nieuw = " + nieuw);

        int count = 0;    // alternatief: via indexOf
        for (int i = 0; i < regel.length(); i++) {
            if (regel.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}

/*
regel = The quick brown fox jumps over the lazy dog
lengte = 43
THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
the quick brown fox jumps over the lazy dog
nieuw = The quick brown fox jumps over the lozy dog
count = 3
*/