package be.kdg.geboortelijst;

import be.kdg.geboortelijst.Geschenk;
import be.kdg.geboortelijst.exception.GeboorteLijstException;
import be.kdg.geboortelijst.exception.GeschenkException;

import java.util.Scanner;

/**
 * Mark Goovaerts
 * Datum: 2-12-13
 */
public class RunDemo {
    public static void main(String[] args) {
        GeboorteLijst lijstje = new GeboorteLijst("Josefien");
        lijstje.voegGeschenkToe(new Geschenk("buggy", 120));
        lijstje.voegGeschenkToe(new Geschenk("maxi cosy", 200));
        lijstje.voegGeschenkToe(new Geschenk("verzorgingskussen", 50));
        lijstje.voegGeschenkToe(new Geschenk("tutter", 1));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                lijstje.toon();
                System.out.print("Geef naam koper: ");
                String str1 = scanner.nextLine();
                System.out.print("Geef naam geschenk: ");
                String str2 = scanner.nextLine();
                lijstje.koop(str2, str1);
            } catch (IllegalArgumentException ex) {
                System.out.println("Foutief argument: " + ex.getMessage());
            } catch (GeboorteLijstException ex) {
                System.out.println("Probleem met de geboortelijst: " + ex.getMessage());
            } catch (GeschenkException ex) {
                System.out.println("Probleem met het geschenk: " + ex.getMessage());
            }
        }

    }
}
