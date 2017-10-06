import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 20:16
 */
public class LongToHex {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean doorgaan = true;

        while (doorgaan) {
            System.out.print("Geef een geheel getal (stop met 0): ");
            long geheelGetal = keyboard.nextLong();
            if (geheelGetal == 0) {
                doorgaan = false;
            } else {
                String hexadecimaal = Long.toHexString(geheelGetal);
                System.out.print(geheelGetal + " in hexadecimaal is " + hexadecimaal + "\n");
            }
        }
    }
}
