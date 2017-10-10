import java.util.Random;
import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 9/10/2017 19:46
 */
public class StringBuilderShizzle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Geef voornaam en achternaam in:");
        String tekst = scanner.nextLine();

        StringBuilder builderEen = new StringBuilder(tekst);
//        builderEen.;
        System.out.println(builderEen);

        StringBuilder builderTwee = new StringBuilder(tekst);
        builderTwee.reverse();
        System.out.println(builderTwee);

        StringBuilder builderDrie = new StringBuilder(tekst);
//        builderDrie.r
        System.out.println(builderDrie);

        StringBuilder builderVier = new StringBuilder(tekst);

        System.out.println(builderVier);
    }
}
