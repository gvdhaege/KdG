import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 30/09/2017 12:51
 */
public class Cijfers2 {

    public static void main(String[] args) {

        int som = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Geef een geheel getal dat uit 4 cijfers bestaat (1000..9999): ");
        String geheelGetal = keyboard.nextLine();

        for (int i = 0; i < geheelGetal.length(); i++) {
            som += Character.getNumericValue(geheelGetal.charAt(i));
        }


        System.out.print("De som van de afzonderlijke cijfers is " + som);
    }
}
