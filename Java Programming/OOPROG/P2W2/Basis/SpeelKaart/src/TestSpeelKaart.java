import kaart.SpeelKaart;

import static kaart.SpeelKaart.KaartKleur.*;
import static kaart.SpeelKaart.KaartWaarde.*;

public class TestSpeelKaart {
    public static void main(String[] args) {
        SpeelKaart kaart = new SpeelKaart(HARTEN, ZEVEN);
        System.out.println(kaart.getKleur() + " " + kaart.getWaarde() + " " + kaart.getGetalWaarde());

        kaart.setKaart(RUITEN, TIEN);
        System.out.println(kaart.toonWaarde());

        // versie 1
        System.out.println("\nAlles in letters:");
        for (int i = 0; i < 20; i++) {
            kaart.maakWillekeurigeKaart();
            System.out.printf("Kaart %2d: %-16s\n", (i + 1), kaart);
        }

        // versie 2
        System.out.println("\nTot en met 10 in cijfers:");
        for (int i = 0; i < 20; i++) {
            kaart.maakWillekeurigeKaart();
            System.out.printf("Kaart %2d: %-16s\n", (i + 1), kaart.toonWaarde());
        }
    }
}