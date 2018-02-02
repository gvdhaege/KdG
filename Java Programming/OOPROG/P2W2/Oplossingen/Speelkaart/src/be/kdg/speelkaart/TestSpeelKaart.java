package be.kdg.speelkaart;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */

import static be.kdg.speelkaart.SpeelKaart.KaartKleur.*;
import static be.kdg.speelkaart.SpeelKaart.KaartWaarde.*;

public class TestSpeelKaart {
    public static void main(String[] args) {
        SpeelKaart kaart = new SpeelKaart(HARTEN, ZEVEN);
        System.out.println(kaart.getKleur() + " " + kaart.getWaarde() + " " + kaart.getGetalWaarde());

        kaart.setKaart(RUITEN, TIEN);
        System.out.println(kaart.toonKaart());

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
            System.out.printf("Kaart %2d: %-16s\n", (i + 1), kaart.toonKaart());
        }
    }
}

/*
harten zeven 7
ruiten 10

Alles in letters:
Kaart  1: harten boer
Kaart  2: harten twee
Kaart  3: klaveren aas
Kaart  4: ruiten vier
Kaart  5: harten twee
Kaart  6: klaveren zes
Kaart  7: klaveren zeven
Kaart  8: ruiten aas
Kaart  9: schoppen vijf
Kaart 10: schoppen boer
Kaart 11: schoppen zes
Kaart 12: schoppen aas
Kaart 13: klaveren drie
Kaart 14: ruiten aas
Kaart 15: schoppen negen
Kaart 16: harten zeven
Kaart 17: ruiten vier
Kaart 18: klaveren boer
Kaart 19: klaveren heer
Kaart 20: klaveren aas

Tot en met 10 in cijfers:
Kaart  1: ruiten 10
Kaart  2: harten 4
Kaart  3: ruiten heer
Kaart  4: schoppen 10
Kaart  5: harten 6
Kaart  6: harten aas
Kaart  7: harten 8
Kaart  8: harten 5
Kaart  9: klaveren 9
Kaart 10: harten aas
Kaart 11: klaveren 3
Kaart 12: schoppen 6
Kaart 13: schoppen 9
Kaart 14: ruiten 10
Kaart 15: ruiten 5
Kaart 16: schoppen 5
Kaart 17: harten 8
Kaart 18: harten 6
Kaart 19: harten 6
Kaart 20: schoppen 9
*/