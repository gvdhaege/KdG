import java.util.Scanner;

public class LettersTellen {
    public static void main(String[] args) {
        final int AANTAL_LETTERS = 26;

        char[] letters = new char[AANTAL_LETTERS];
        int[] tellers = new int[AANTAL_LETTERS];

        char letter = 'a';
        int totaalLetters = 0;

        Scanner scanner = new Scanner(System.in);

        //letterarray vullen
        for (int i = 0; i < AANTAL_LETTERS; i++) {
            letters[i] = letter;
            letter++;
        }

        System.out.print("Tik een zin in: ");
        String zin = scanner.nextLine().toLowerCase();

        System.out.print("Letterfrequenties:");
        //loopen over zin
        for (int i = 0; i < zin.length(); i++) {
            char karakter = zin.charAt(i);
            //loopen over letters
            for (int j = 0; j < letters.length; j++) {
                if (karakter == letters[j]) {
                    tellers[j]++;
                    totaalLetters++;
                    break;
                }
            }
        }

        for (int i = 0; i < AANTAL_LETTERS; i++) {
            if (i % 6 == 0) {
                System.out.println();
            }
            System.out.printf("%c --> %dx\t", letters[i], tellers[i]);
        }
        System.out.println("\nTotaal aantal letters: " + totaalLetters);
    }
}
