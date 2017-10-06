import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 12:05
 */
public class Scrabble {

    public static void main(String[] args) {

        int punten = 0;
        String letter;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Geef een letter in: ");
        letter = keyboard.nextLine();

        switch(letter.toUpperCase()){

            case "A":
                punten += 1;
                break;
            case "B":
                punten += 3;
                break;
            default:
                break;
        }

        System.out.println("Aantal punten: " + punten);

    }
}
