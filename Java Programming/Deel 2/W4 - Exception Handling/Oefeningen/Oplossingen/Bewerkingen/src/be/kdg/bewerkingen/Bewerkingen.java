package be.kdg.bewerkingen;

import java.util.ArrayList;
import java.util.List;

/*
 De klasse Bewerkingen bevat de volgende attributen:
    - een int met de naam getalEen
    - een int met de naam getalTwee
    - een tabel met de naam lijst met elementen van het type int
 Voorzie een constructor die beide int's een waarde geeft.
 Voorzie een void methode doeBewerkingen die een throw van een ArithmeticException kan doen.
 Deze methode maakt een tabel aan en voegt daar dan in volgorde de som, het verschil,
 het product en het quotiënt van getalEen en getalTwee aan toe.
 Voorzie een methode toonResultaat waarbij de tabel doorlopen wordt en respectievelijk de som,
 het verschil, het product en het quotiënt wordt afgedrukt (zie uitvoer)
 */
public class Bewerkingen {
    private int getalEen;
    private int getalTwee;
    private int[] lijst = new int[4];

    public Bewerkingen(int getalEen, int getalTwee) {
        this.getalEen = getalEen;
        this.getalTwee = getalTwee;
    }

    public void doeBewerkingen() throws ArithmeticException {
        lijst[0] = getalEen + getalTwee;
        lijst[1] = getalEen - getalTwee;
        lijst[2] = getalEen * getalTwee;
        lijst[3] = getalEen / getalTwee;
    }

    public void toonResultaat() {
        for (int i = 0; i < lijst.length; i++) {
            String bewerking = "";
            switch (i) {
                case 0: bewerking = "Som:"; break;
                case 1: bewerking = "Verschil:"; break;
                case 2: bewerking = "Product:"; break;
                case 3: bewerking = "Quotiënt:"; break;
            }
            System.out.printf("%-10s %d%n", bewerking, lijst[i] );
        }
    }
}
