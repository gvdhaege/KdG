package be.kdg.strings;

import java.util.Arrays;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25-10-13
 */
public class StringsDemo {
    public static void main(String[] args) {
        String[] woorden = {
           "alfa", "sierra", "bravo", "oscar", "zulu", "november"
        };

        boolean isGelijk = woorden[0] == "alfa";
        boolean isEqual = woorden[0].equals("alfa");
        boolean isNietGelijk = woorden[0] == new String("alfa");

        System.out.println("alfa == alfa --> " +  isGelijk);
        System.out.println("alfa equals alfa --> " +  isEqual);
        System.out.println("alfa == new String(\"alfa\") --> " + isNietGelijk);

        // Sorteer de woorden alfabetisch
        Arrays.sort(woorden);

        // Druk de woorden onder elkaar af via for each lus
        System.out.println("\nGesorteerd:");
        for (String woord : woorden) {
            System.out.println(woord);
        }
    }
}
