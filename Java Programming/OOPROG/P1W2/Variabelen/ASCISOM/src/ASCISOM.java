import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 1/10/2017 18:54
 */
public class ASCISOM {

    public static void main(String[] args) {

        int counter = 0;

        Scanner keyboard = new Scanner(System.in);


        while (counter <= 3){
            System.out.print("Geef een regel tekst in: ");
            String regelTekst = keyboard.nextLine();
            int som = 0;
            int regelLengte = regelTekst.length();
            for (int i = 0; i < regelLengte; i++) {
                som += (int)regelTekst.charAt(i);
            }
            System.out.println("som = " + som);
            counter++;
        }
        keyboard.reset();
    }
}
