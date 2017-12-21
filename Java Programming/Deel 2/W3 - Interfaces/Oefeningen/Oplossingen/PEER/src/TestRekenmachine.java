import rekenen.Rekenmachine;
import rekenen.plugins.*;

import java.util.Scanner;

/**
 * Mark Goovaerts
 * Datum: 25-11-13
 * Johan Ven
 * Datum 16-11-14 (review AC14-15)
 *   => Anonieme klasse toegevoegd + gebruik innerclass (help-file) + extra controle na stap 3.1
 */
public class TestRekenmachine {
    private static Rekenmachine mijnCalc = new Rekenmachine();

    public static void main(String[] args) {

        mijnCalc.installeer(new Optelling());
        mijnCalc.installeer(new Aftrekking());
        mijnCalc.installeer(new Vermenigvuldiging());
        mijnCalc.installeer(new Deling());
        mijnCalc.installeer(new Macht());

        /*
        System.out.println("===== UITVOER NA 3.1 =====");
        doeBerekeningEnDrukAf("+", 5, 2);
        doeBerekeningEnDrukAf("-", 5, 2);
        doeBerekeningEnDrukAf("*", 5, 2);
        doeBerekeningEnDrukAf("/", 5, 2);
        doeBerekeningEnDrukAf("^", 5, 2);
        doeBerekeningEnDrukAf("?", 5, 2);
        System.out.println(mijnCalc.toString());
        */

        //Opgave 3.3
        Plugin maximum = new Plugin() {
            @Override
            public String getCommand() {
                return "MAX";
            }

            @Override
            public double bereken(double x, double y) {
                return x > y ? x : y;
            }

            @Override
            public String getAuteur() {
                return "Anoniem";
            }
        };

        Plugin minimum = new Plugin() {
            @Override
            public String getCommand() {
                return "MIN";
            }

            @Override
            public double bereken(double x, double y) {
                return x < y ? x : y;
            }

            @Override
            public String getAuteur() {
                return "Anoniem";
            }
        };

        mijnCalc.installeer(maximum);
        mijnCalc.installeer(minimum);

        //System.out.println("===== UITVOER NA 3.2 =====");
        System.out.println("Welkom bij het dynamische rekenmachine! ");
        Rekenmachine.Help onzeHelpFile = mijnCalc.new Help();

        System.out.println("Help voor gebruikers: " + onzeHelpFile.voorGebruikers());
        System.out.println("Help voor dev's: " + onzeHelpFile.voorOntwikkelaars());
        Scanner kb = new Scanner(System.in);

        System.out.println(mijnCalc);
        String ingevoerdCommando = "";
        do {
            System.out.print("\nWelk berekening wenst U uit te voeren (zie plugins, <ENTER> om te stoppen)? ");
            ingevoerdCommando = kb.nextLine();
            if (!ingevoerdCommando.equals("")) {
                System.out.print("Geef twee getallen in (gescheiden door een spatie): ");
                double getal1 = kb.nextDouble();
                double getal2 = kb.nextDouble();
                kb.nextLine();

                double result = mijnCalc.bereken(ingevoerdCommando, getal1, getal2);
                System.out.printf("%.2f %s %.2f = %.2f\n", getal1, ingevoerdCommando, getal2, result);
            }
        } while (!ingevoerdCommando.equals(""));

        System.out.println("==== LOG ==== ");
        System.out.println(mijnCalc.getLog());
    }

    private static void doeBerekeningEnDrukAf(String commando, double getal1, double getal2) {
        System.out.printf("%f %s %f = %f\n", getal1, commando, getal2
                , mijnCalc.bereken(commando, getal1, getal2));
    }
}
