package be.kdg;

import be.kdg.auto.Auto;

/*
Gebruik deze klasse om je code te testen. Hier mag je niets wijzigen.
 */
public class AutoTester {
    public static void main(String[] args) {
        Auto auto = new Auto("VW Golf", "BHZ456");
        System.out.println("Test van : " + auto);
        for (int i = 0; i < 30; i++) {
            auto.geefGas();
            auto.toonToerental();
        }
        System.out.println("REMMEN!!!");
        auto.rem();
        for (int i = 0; i < 3; i++) {
            auto.geefGas(3000);
            auto.toonToerental();
        }
        Auto kopie = new Auto(auto);
        System.out.println("\nkopie: " + kopie);

        // Demo equals
        System.out.println("Kopie is gelijk aan origineel: " + kopie.equals(auto));
    }
}

/*
Test van : VW Golf met kenteken BHZ456
200
400
600
800
1000
1200
1400
1600
1800
2000
2200
2400
2600
2800
3000
3200
3400
3600
3800
4000
4200
4400
4600
4800
5000
5200
5400
5600
5800
5800
REMMEN!!!
3000
5800
5800

kopie: VW Golf met kenteken BHZ456
*/