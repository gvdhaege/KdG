import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 13:57
 */
public class Kader {
    public static void main(String[] args) {
        String symbool;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef het symbool: ");
        symbool = keyboard.nextLine();

        System.out.print("Geef de lengte (2..60): ");
        int lengte = keyboard.nextInt();
        if (lengte < 2 || lengte > 60){
            System.out.println("Foutieve lengte");
            return;
        }

        System.out.print("Geef de breedte (2..20): ");
        int breedte = keyboard.nextInt();
        if (breedte < 2 || breedte > 20){
            System.out.println("Foutieve breedte");
            return;
        }

        for (int i = 1; i <= breedte; i++) {
            System.out.println();
            if (i == 1 || i == breedte) {
                for (int j = 1; j <= lengte; j++) {
                    System.out.print(symbool);
                }
            } else {
                for (int j = 1; j <= lengte; j++) {
                    if (j == 1 || j == lengte - 1) {
                        System.out.print(symbool);
                    }
                    System.out.print(" ");

                }
            }
        }
    }
}