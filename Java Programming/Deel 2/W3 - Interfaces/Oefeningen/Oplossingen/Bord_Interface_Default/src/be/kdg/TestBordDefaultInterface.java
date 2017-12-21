package be.kdg;

import be.kdg.defaultinterface.Berekenbaar;
import be.kdg.defaultinterface.Bord;
import be.kdg.defaultinterface.RondBord;
import be.kdg.defaultinterface.VierkantBord;

public class TestBordDefaultInterface {
    public static void main(String[] args) {
        Berekenbaar rond = new RondBord("karton", "groen", 30);
        Berekenbaar vierkant = new VierkantBord("porcelijn", "wit", 20);
        Berekenbaar bord = new Bord("karton", "blauw");

        System.out.printf("%-8s = %s %.0fcm²%n", "rond", rond, rond.oppervlakte());
        System.out.printf("%-8s = %s %.0fcm²%n", "vierkant", vierkant, vierkant.oppervlakte());
        System.out.printf("%-8s = %s%n", "bord", bord);

        System.out.printf("%nomtrek vierkant bord: %.0fcm%n", vierkant.omtrekVierkantBord(30));
        System.out.printf("omtrek rond bord: %.0fcm", rond.omtrekRondBord(30));
    }
}

/*
rond     = karton    groen  707cm³
vierkant = porcelijn wit    400cm²
bord     = karton    blauw

omtrek vierkant bord: 120cm
omtrek rond bord: 94cm
*/