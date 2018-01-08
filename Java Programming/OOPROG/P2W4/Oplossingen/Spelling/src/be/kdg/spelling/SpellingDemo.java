package be.kdg.spelling;

import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 2/12/13
 */
public class SpellingDemo {
    private static final String[] TEST_WOORDEN = {"onmiddellijk", "ogenblikkelijk"};

    public static void main(String[] args) {
        boolean fout = true;
        do {
            System.out.print("Geef een synoniem voor 'direct' in 'o...k': ");
            Scanner scanner = new Scanner(System.in);
            String woord = scanner.nextLine();

            try {
                if (woord.equalsIgnoreCase(TEST_WOORDEN[0]) ||
                    woord.equalsIgnoreCase(TEST_WOORDEN[1])) {
                    System.out.println("Correct!");
                    fout = false;
                } else {
                    throw new SpellingsException("o...k", woord);
                }
            } catch (SpellingsException ex) {
                System.out.println(ex.getMessage());
            }
        } while (fout);
    }
}
