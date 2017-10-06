import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 20:02
 */
public class HexToLong {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean doorgaan = true;

        while (doorgaan) {
            System.out.print("Geef een hexadecimaal getal (stop met 0): ");
            String hexadecimaal = keyboard.nextLine();
            if (hexadecimaal.equals("0")) {
                doorgaan = false;
            } else {
                Long decimaal = Long.parseLong(hexadecimaal, 16);
                System.out.print(hexadecimaal + " in decimaal is " + decimaal + "\n");
            }
        }
    }
}
