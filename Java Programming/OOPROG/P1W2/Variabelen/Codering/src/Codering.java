import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 1/10/2017 19:42
 */
public class Codering {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Geef een bericht: ");
        String bericht = keyboard.nextLine();
        bericht = bericht.toUpperCase();
        StringBuilder gecodeerd = new StringBuilder(bericht);

        System.out.print("Hoeveel letters herschuiven? : ");
        int plaatsen = keyboard.nextInt();

        for (int i = 0; i < gecodeerd.length() ; i++) {
            char letter = gecodeerd.charAt(i);
            if (letter >= 'A' && letter <= 'Z'){
                letter += plaatsen;
                if (letter > 'Z'){
                    letter -= 26;
                }
                gecodeerd.setCharAt(i, letter);
            }
        }

        System.out.print("Gecodeerd bericht: ");
        System.out.println(gecodeerd.toString());

        //showoff reasons - no need since can print original message.toUppercase();

        for (int i = 0; i < gecodeerd.length() ; i++) {
            char letter = gecodeerd.charAt(i);
            if (letter >= 'A' && letter <= 'Z'){
                letter -= plaatsen;
                if (letter < 'A'){
                    letter += 26;
                }
                gecodeerd.setCharAt(i, letter);
            }
        }

        System.out.print("Gedecodeerd bericht: ");
        System.out.println(gecodeerd.toString());
    }
}
