package be.kdg;

import be.kdg.bordinterface.Berekenbaar;
import be.kdg.bordinterface.Bord;
import be.kdg.bordinterface.RondBord;
import be.kdg.bordinterface.VierkantBord;

public class TestBordInterface {
    public static void main(String[] args) {
        Berekenbaar rond = new RondBord("karton", "groen", 30);
        Berekenbaar vierkant = new VierkantBord("porcelijn", "wit", 20);
        Berekenbaar bord = new Bord("karton", "blauw");

        System.out.printf("%-8s = %s %.0fcm³%n", "rond", rond, rond.oppervlakte());
        System.out.printf("%-8s = %s %.0fcm²%n", "vierkant", vierkant, vierkant.oppervlakte());
        System.out.printf("%-8s = %s%n", "bord", bord);
    }
}

/*
rond     = karton    groen  707cm³
vierkant = porcelijn wit    400cm²
bord     = karton    blauw
*/