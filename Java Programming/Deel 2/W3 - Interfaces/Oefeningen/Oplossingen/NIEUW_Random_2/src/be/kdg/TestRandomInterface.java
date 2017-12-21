package be.kdg;

import be.kdg.randominterface.Dobbelsteen;
import be.kdg.randominterface.Gooibaar;
import be.kdg.randominterface.Munt;

/*
In de klassieke tabel elements heb je twee objecten, een Dobbelsteen object en een Munt object.
Vul de testklasse als volgt aan. Genereer eerst 10 dobbelsteenworpen en druk ze op één regel af.
Genereer vervolgens 10 muntworpen, druk hier "kop" of "munt" af in plaats van 0 of 1.
Je maakt elke keer gebruik van dezelfde gooi-methode, ze gedraagt zich polymorf.

 */
public class TestRandomInterface {
    private static final int AANTAL = 10;

    public static void main(String[] args) {
        Gooibaar[] elements = {
                new Dobbelsteen(), new Munt()
        };

        // genereer 10 dobbelsteenworpen
        for (int i = 0; i < AANTAL; i++) {
            System.out.printf("%d ", elements[0].gooi());
        }
        System.out.println();

        // genereer 10 muntworpen, druk in plaats van 0 en 1 kop of munt af.
         for (int i = 0; i < AANTAL; i++) {
            int worp = elements[1].gooi();
            System.out.printf("%s ", worp == 1 ? "kop" : "munt");
        }
        System.out.println();
    }
}

/*
3 3 4 6 1 5 2 3 6 6
kop kop munt munt kop munt munt kop munt munt
*/