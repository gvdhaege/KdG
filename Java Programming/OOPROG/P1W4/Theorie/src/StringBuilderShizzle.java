import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 9/10/2017 19:46
 */
public class StringBuilderShizzle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef voornaam en achternaam in: ");
        String tekst = scanner.nextLine();

        StringBuilder builderEen = new StringBuilder();
        builderEen.append(tekst.charAt(0));
        builderEen.append('.');
        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == ' ') {
                builderEen.append(tekst.charAt(i + 1));
                builderEen.append('.');
            }
        }

        StringBuilder builderTwee = new StringBuilder(tekst);
        builderTwee.reverse();

        StringBuilder builderDrie = new StringBuilder(tekst);
        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == 'e') {
                builderDrie.setCharAt(i, 'a');
            }
        }

        StringBuilder builderVier = new StringBuilder();
        List<Character> letters = new ArrayList<>();
        for (char letter : tekst.toCharArray()) {
            letters.add(letter);
        }
        Collections.shuffle(letters);

        for (char letter : letters){
            builderVier.append(letter);
        }



        System.out.println(builderEen);
        System.out.println(builderTwee);
        System.out.println(builderDrie);
        System.out.println(builderVier);
    }
}
