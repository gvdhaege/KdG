package be.kdg.dieren;

/**
 * @author Kristiaan Behiels
 * @version 1.0 20/10/13
 *
 * EXTRA?
 */
public class TestDieren {
    public static void main(String[] args) {
        Dier hond = new Hond("Roodbruin", 4, "Waf");
        Dier basenji = new Basenji("Geelbruin", 4, "geen");
        Dier kat = new Kat("Ros", 4, "Maw");

        Hond hondKopie = (Hond) hond.getDierKopie();
        Basenji basenjiKopie = (Basenji) basenji.getDierKopie();
        Kat katKopie = (Kat) kat.getDierKopie();

        hondKopie.setKleur("Roestbruin");
        basenjiKopie.setKleur("Bruin");
        katKopie.setKleur("Zwart");

        hondKopie.setGeluid("Woef woef");
        katKopie.setGeluid("Kssss!");

        System.out.println(hond);
        System.out.println(kat);
        System.out.println(basenji);
        System.out.println();

        System.out.println(hondKopie);
        System.out.println(katKopie);
        System.out.println(basenjiKopie);

        // testen equals
        hondKopie = (Hond) hond.getDierKopie();
        basenjiKopie = (Basenji) basenji.getDierKopie();
        katKopie = (Kat) kat.getDierKopie();

        boolean isHondGelijk = hondKopie.equals(hond);
        boolean isKatGelijk = katKopie.equals(kat);
        boolean isBasenjiGelijk = basenjiKopie.equals(basenji);
        System.out.println(isHondGelijk + " " + isKatGelijk + " " + isBasenjiGelijk);
    }
}

/*
Roodbruin    4 Waf
Ros          4 Maw
Geelbruin    4

Roestbruin   4 Woef woef
Zwart        4 Kssss!
Bruin        4
true true true
*/