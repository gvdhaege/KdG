package be.kdg.palindroom;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */

/*
In deze klasse dien je twee static methoden aan te vullen.
De methode isPalindroom kijkt na of een afzonderlijk woord palindroom is,
met andere woorden als je de lettervolgorde omkeert heb je nog altijd hetzelfde woord.
De methode isZinPalindroom doet hetzelfde, maar voor een volledige zin, zonder rekening te houden met niet-lettertekens.
*/
public class Palindroom {

    // Met StringBuilder
    public static boolean isPalindroom(String string) {
        string = string.toLowerCase();
        StringBuilder omgekeerd = new StringBuilder(string);
        String andereString = omgekeerd.reverse().toString();
        return andereString.equals(string);
    }

    // Klassiek (alles kleine letters)
    public static boolean isPalindroomOud(String string) {
        string = string.toLowerCase();
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Met verwijderen van alle niet-letters
    public static boolean isZinPalindroom(String string) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if (Character.isLetter(letter)) {
                builder.append(letter);
            }
        }
        return isPalindroom(builder.toString());
    }
}
