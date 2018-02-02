package be.kdg.klassen;

import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 13/10/13
 *          <p/>
 *          Zie ook P1W4 als EXTRA
 *          Zie ook P1W6
 */
public class StringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een zin in: ");
        String zin = scanner.nextLine().trim();

        System.out.println("Deze zin heeft een lengte van " + zin.length() + " characters.");

        String hoofdletters = zin.toUpperCase();
        System.out.println(hoofdletters);

        String kleineLetters = zin.toLowerCase();
        System.out.println(kleineLetters);

        char eersteLetter = zin.charAt(0);
        System.out.println("eerste letter: " + eersteLetter);

        char laatsteLetter = zin.charAt(zin.length() - 1);
        System.out.println("laatste letters: " + laatsteLetter);

        String eersteHelft = zin.substring(0, zin.length() / 2);
        System.out.println(eersteHelft);

        String vervangLetterO = zin.replaceAll("o", "_");  // alleen kleine letter 'o'
        System.out.println(vervangLetterO);

        String zonderSpaties = zin.replace(" ", "");
        System.out.println(zonderSpaties);

        // Verwijder alle klinkers uit de string
        String result = "";
        for (int i = 0; i < zin.length(); i++) {
            char ch = zin.charAt(i);
            switch (ch) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    break;
                default:
                    result += ch;
            }
        }
        System.out.println(result);

        // Verwijder alle klinkers uit de string  (regEx versie)
        String zonderKlinkers = zin.replaceAll("(?i)[aeiou]", "");  // (?i) = case-insensitive in Java
        System.out.println(zonderKlinkers);
    }
}

/*
THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
the quick brown fox jumps over the lazy dog
eerste letter: T
laatste letters: g
The quick brown fox j
The quick br_wn f_x jumps _ver the lazy d_g
Thequickbrownfoxjumpsoverthelazydog
Th qck brwn fx jmps vr th lzy dg
*/