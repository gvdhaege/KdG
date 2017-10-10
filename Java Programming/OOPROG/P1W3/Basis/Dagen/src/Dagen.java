import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 21:27
 */
public class Dagen {
    public static void main(String[] args) {
        Calendar vandaag = new GregorianCalendar();
        String vandaagDisplay = vandaag.getDisplayName( Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
        int dagNummer = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef de naam van een dag: ");
        String dag = keyboard.nextLine().toLowerCase();

        dagNummer = getDagNummer(dagNummer, dag);
        System.out.println("dagNummer = " + dagNummer);
        System.out.println("Vandaag is het " + vandaagDisplay);
    }

    private static int getDagNummer(int dagNummer, String dag) {
        switch (dag) {
            case "maandag":
                dagNummer = 0;
                break;
            case "dinsdag":
                dagNummer = 1;
                break;
            case "woensdag":
                dagNummer = 2;
                break;
            case "donderdag":
                dagNummer = 3;
                break;
            case "vrijdag":
                dagNummer = 4;
                break;
            case "zaterdag":
                dagNummer = 5;
                break;
            case "zondag":
                dagNummer = 6;
                break;
            default:
                break;
        }
        return dagNummer;
    }
}
