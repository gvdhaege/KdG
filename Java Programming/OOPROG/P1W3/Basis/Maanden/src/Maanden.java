import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 13:47
 */
public class Maanden {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String maand = "";
        int dagen = 0;

        System.out.print("Geef een maand in in de vorm van een cijfer (1 = januari): ");
        int maandNummer = keyboard.nextInt();
        System.out.print("Geef een jaar (met 4 cijfers): ");
        int jaartal = keyboard.nextInt();

        switch (maandNummer) {
            case 1:
                maand = "januari";
                dagen = 31;
                break;
            case 2:
                maand = "februari";
                dagen = isSchrikkeljaar(jaartal);
                break;
            case 3:
                maand = "maart";
                dagen = 31;
                break;
            case 4:
                maand = "april";
                dagen = 30;
                break;
            case 5:
                maand = "mei";
                dagen = 31;
                break;
            case 6:
                maand = "juni";
                dagen = 30;
                break;
            case 7:
                maand = "juli";
                dagen = 31;
                break;
            case 8:
                maand = "augustus";
                dagen = 31;
                break;
            case 9:
                maand = "september";
                dagen = 30;
                break;
            case 10:
                maand = "oktober";
                dagen = 31;
                break;
            case 11:
                maand = "november";
                dagen = 30;
                break;
            case 12:
                maand = "december";
                dagen = 31;
                break;
            default:
                break;
        }
        System.out.println("In " + jaartal + " heeft " + maand + " " + dagen + " dagen.");
    }

    private static int isSchrikkeljaar(int jaartal) {
        if ((jaartal % 400 == 0) || ((jaartal % 4 == 0) && (jaartal % 100 != 0))) {
            return 29;
        }
        return 28;
    }
}
