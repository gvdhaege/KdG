package be.kdg;

import be.kdg.factuur.*;

public class TestFactuur {
    public static void main(String[] args) {
        Klanten klanten = new Klanten();

        klanten.voegToe(new Klant(1001, false, "Peter Celie", new Adres("Zuidlaan 16", 9230, "Wetteren")));
        klanten.voegToe(new Klant(1004, true, "Piet Uyttebroeck", new Adres("Heikant 75", 9340, "Zele")));
        klanten.voegToe(new Klant(1002, false, "Herman Brusselmans", new Adres("Oudburg 23", 9000, "Gent")));

        Artikels artikels = new Artikels();

        artikels.voegToe(new Artikel(3012, "Spade", 24.95));
        artikels.voegToe(new Artikel(3016, "Boomzaag", 12.49));
        artikels.voegToe(new Artikel(3014, "Hakbijl", 19.95));

        Facturatie facturatie = new Facturatie(klanten, artikels);
        facturatie.voegBestellingToe(new Bestelling(1002, 3014, 2));
        facturatie.voegBestellingToe(new Bestelling(1001, 3014, 1));
        facturatie.voegBestellingToe(new Bestelling(1002, 3016, 3));
        facturatie.voegBestellingToe(new Bestelling(1004, 3012, 2));

        System.out.println(facturatie.verwerkBestellingen());

    }
}

/*

nr: 1002
Herman Brusselmans
Oudburg 23
9000 Gent
-------------------------------------
3014 Hakbijl              €19,95  (2)
Te betalen: �39,90

nr: 1001
Peter Celie
Zuidlaan 16
9230 Wetteren
-------------------------------------
3014 Hakbijl              €19,95  (1)
Te betalen: �19,95

nr: 1002
Herman Brusselmans
Oudburg 23
9000 Gent
-------------------------------------
3016 Boomzaag             €12,49  (3)
Te betalen: �37,47

nr: 1004
Piet Uyttebroeck
Heikant 75
9340 Zele
-------------------------------------
3012 Spade                €24,95  (2)
Te betalen: �44,91

*/