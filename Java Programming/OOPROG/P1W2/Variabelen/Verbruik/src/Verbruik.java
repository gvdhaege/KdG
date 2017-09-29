import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 29/09/2017 18:12
 */
public class Verbruik {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Geef de vorige kilometerstand: ");
        int kilometerstandVorig = keyboard.nextInt();
        System.out.print("Geef de huidige kilometerstand: ");
        int kilometerstandHuidig = keyboard.nextInt();
        System.out.print("Geef het aantal getankte liters: ");
        double getankteLiters = keyboard.nextDouble();

        int verschilKilometers = kilometerstandHuidig - kilometerstandVorig;
        double verbruik = (getankteLiters / verschilKilometers) * 100;

        System.out.print("Verbruik voor " + verschilKilometers + "km: ");
        System.out.printf("%.2f", verbruik);
        System.out.print(" liter/100km");
    }
}
