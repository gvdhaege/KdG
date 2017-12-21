package be.kdg;


import be.kdg.abstractinterface.Berekenbaar;
import be.kdg.abstractinterface.RondBord;
import be.kdg.abstractinterface.VierkantBord;

public class TestBordAbstractInterface {
    public static void main(String[] args) {
        Berekenbaar rond = new RondBord("karton", "groen", 30);
        Berekenbaar vierkant = new VierkantBord("porcelijn", "wit", 20);
        //  Berekenbaar bord = new Bord("karton", "blauw");   <-- dit kan niet!

        System.out.printf("%-8s = %s %.0fcm²%n", "rond", rond, rond.oppervlakte());
        System.out.printf("%-8s = %s %.0fcm²%n", "vierkant", vierkant, vierkant.oppervlakte());
    }
}

 /*
rond     = karton    groen  707cm²
vierkant = porcelijn wit    400cm²
*/
