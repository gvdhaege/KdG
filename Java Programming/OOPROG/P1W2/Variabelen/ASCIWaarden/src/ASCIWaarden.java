import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 1/10/2017 19:01
 */
public class ASCIWaarden {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);



        System.out.print("Geef een string in: ");
        String ingave = keyboard.nextLine();

        for (int i = 0; i < ingave.length(); i++) {
            char letter = ingave.charAt(i);
            int waarde = (int) ingave.charAt(i);
            System.out.println(letter + " heeft een ASCII waarde van " + waarde);
        }
    }
}
