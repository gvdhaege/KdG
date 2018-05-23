package be.kdg.mandje;


import be.kdg.mandje.demo.Artikel;
import be.kdg.mandje.demo.Mandje;

public class RunMandje {
    public static void main(String[] args) {
        Mandje mandje = new Mandje();

        mandje.voegToe(new Artikel("Druiven", 2.0));
        mandje.voegToe(new Artikel("Passievruchten", 2.35));
        mandje.voegToe(new Artikel("Mandarijnen", 2.50));
        mandje.voegToe(new Artikel("Pruimen", 2.49));
        Artikel kiwis = new Artikel("Kiwis", 4.95);
        mandje.voegToe(kiwis);
        mandje.voegToe(new Artikel("Druiven", 1.95));
        mandje.voegToe(new Artikel("Peren", 1.99));
        mandje.voegToe(new Artikel("Appels", 2.20));
        mandje.verwijder(kiwis);

/*        mandje.toon();

        System.out.println("\nGesorteerd volgens naam:");
        mandje.sorteerVolgensNaam();

        System.out.println("\nGesorteerd volgens prijs:");
        mandje.sorteerVolgensPrijs();
        mandje.toon();*/
    }
}

/*
VERWACHTE AFDRUK:

mrt 07, 2018 3:59:35 PM be.kdg.mandje.demo.Mandje voegToe
INFO: Artikel Druiven toegevoegd.
mrt 07, 2018 3:59:35 PM be.kdg.mandje.demo.Mandje voegToe
INFO: Artikel Passievruchten toegevoegd.
mrt 07, 2018 3:59:35 PM be.kdg.mandje.demo.Mandje voegToe
INFO: Artikel Mandarijnen toegevoegd.
mrt 07, 2018 3:59:35 PM be.kdg.mandje.demo.Mandje voegToe
INFO: Artikel Pruimen toegevoegd.
mrt 07, 2018 3:59:35 PM be.kdg.mandje.demo.Mandje voegToe
INFO: Artikel Kiwis toegevoegd.
mrt 07, 2018 3:59:35 PM be.kdg.mandje.demo.Mandje voegToe
WARNING: Artikel Druiven NIET toegevoegd.
mrt 07, 2018 3:59:35 PM be.kdg.mandje.demo.Mandje voegToe
INFO: Artikel Peren toegevoegd.
mrt 07, 2018 3:59:35 PM be.kdg.mandje.demo.Mandje voegToe
INFO: Artikel Appels toegevoegd.
mrt 07, 2018 3:59:35 PM be.kdg.mandje.demo.Mandje verwijder
WARNING: Artikel Kiwis met prijs €4,95 verwijderd.
 */
