import java.util.Random;
import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 1/10/2017 19:25
 */
public class VerhaspelNaam {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        StringBuilder verhaspeld = new StringBuilder();
        int counter = 0;

        while (counter < 3) {
            System.out.print("Geef je naam: ");
            String naam = keyboard.nextLine();

            for (int i = 0; i < naam.length(); i++) {
                char letter = naam.charAt(random.nextInt(naam.length()));
                if (Character.isAlphabetic(letter)) verhaspeld.append(letter);
            }
            System.out.println("Hallo " + naam + " je verhaspelde naam is " + verhaspeld);
            verhaspeld.setLength(0);
            counter++;
        }
    }
}
