import java.util.Scanner;

public class Scrabble {
    public static void main(String[] args) {
        int[] letterwaarden = {
                1, 3, 3, 1, 1, 5,
                2, 2, 1, 4, 4, 2,
                3, 1, 1, 3, 10, 1,
                1, 1, 4, 4, 4, 8, 8, 6
        };
        char[] letters = new char[26];
        char letter = 'a';
        int woordwaarde = 0;

        for (int i = 0; i < letters.length; i++) {
            letters[i] = letter;
            letter++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een woord: ");
        String woord = scanner.nextLine().toUpperCase();

        for (int i = 0; i < woord.length(); i++) {
            char ch = woord.charAt(i);
            woordwaarde += letterwaarden[(int) ch - 65];
        }
        System.out.printf("De woordwaarde is %s", woordwaarde);
    }
}
