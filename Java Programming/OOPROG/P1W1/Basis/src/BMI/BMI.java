package BMI;

import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 22/09/2017 18:43
 */
public class BMI {
    public static void main(String[] args) {
        String naam;
        double lengte;
        double gewicht;
        double BMI;
        String resultaatBMI = "";

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Geef je naam in: ");
        naam = keyboard.nextLine();
        System.out.print("Geef je lengte in (m): ");
        lengte = keyboard.nextDouble();
        System.out.print("Geef je gewicht in: ");
        gewicht = keyboard.nextDouble();

        BMI = gewicht / (lengte * lengte);

        if (BMI < 18.5) {
            resultaatBMI = "ondergewicht";
        }
        if (BMI >= 18.5 && BMI <= 24.9) {
            resultaatBMI = "normaal gewicht";
        }
        if (BMI >= 25 && BMI <= 29.9) {
            resultaatBMI = "overgewicht";
        }
        if (BMI >= 30 && BMI <= 39.9) {
            resultaatBMI = "zwaarlijvigheid";
        }
        if (BMI >= 40) {
            resultaatBMI = "obesitas";
        }
        System.out.println("Beste " + naam + ", je BMI bedraagt " + BMI + ". " + resultaatBMI);
    }
}
