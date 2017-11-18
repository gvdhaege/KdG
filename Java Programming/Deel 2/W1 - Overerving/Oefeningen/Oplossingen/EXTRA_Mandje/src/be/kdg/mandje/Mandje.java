package be.kdg.mandje;

import java.util.ArrayList;
import java.util.List;

/*
Deze klasse bevat alle aangekochte artikels in de vorm van een ArrayList.
Voorzie een attribuut mandje van het type List<Aankoop>.
Maak de ArrayList in de constructor.
Voorzie een add-methode om een aankoop toe te voegen.
// Voorzie een remove-methode om een aankoop te verwijderen.
Voorzie een methode toon die een overzicht geeft van de inhoud van het mandje.
Ze maakt daarvoor gebruik van de toString-methode van de klasse Aankoop. (zie uitvoer)
De methode printFactuur drukt een 'primitieve" factuur af. Er wordt gebruik gemaakt van de methode toon van de klasse Aankoop en
 van de methoden printTotaalExclusief, printBtwTotaal en printTotaalInclusief.
De methode printTotaalExclusief drukt het algemeen totaal zonder BTW af.
De methode printBtWTotaal drukt het totaal aan BTW af.
De methode printTotaalInclusief drukt het algemeen totaal inclusief BTW af.
Uitdaging! De methode printTotaalTaksen drukt het totaal aan invoertaksen af (ook weegegeven in de uitvoer)
 */

public class Mandje {
    private List<Aankoop> mandje;

    public Mandje() {
        mandje = new ArrayList<>();
    }

    public void add(Aankoop aankoop) {
        mandje.add(aankoop);
    }

    /*
    public void remove(Aankoop aankoop) {
        mandje.remove(aankoop);
    }
    */

    public void toon() {
        for (Aankoop aankoop : mandje) {
            System.out.println(aankoop);
        }
    }

    public void printFactuur() {
        System.out.println("\nFactuur:\n");
        for (Aankoop aankoop : mandje) {
            aankoop.toon();
        }
        printTotaalExclusief();
        printBtwTotaal();
        printTotaalInclusief();
    }

    public void printTotaalExclusief() {
        double som = 0;
        for (Aankoop aankoop : mandje) {
            som += aankoop.totaalExclusief();
        }
        System.out.printf("\nTotaal zonder BTW : €%6.2f%n", som);
    }

    public void printBtwTotaal() {
        double som = 0;
        for (Aankoop aankoop : mandje) {
            som += aankoop.totaalBtw();
        }
        System.out.printf("Totaal BTW        : €%6.2f%n", som);
    }

    public void printTotaalInclusief() {
        double som = 0;
        for (Aankoop aankoop : mandje) {
            som += aankoop.totaalInclusief();
        }
        System.out.printf("Totaal met BTW    : €%6.2f%n", som);
    }

    public void printTotaalTaksen() {
        double som = 0;
        for (Aankoop aankoop : mandje) {
            Artikel artikel = aankoop.getArtikel();
            /* if (artikel instanceof ImportArtikel) {
               som += artikel.getInvoerTaks();
           } */
            if (artikel.getClass() == ImportArtikel.class) {
                som += artikel.getInvoerTaks();
            }
        }
        System.out.printf("Totaal taksen     : €%6.2f%n", som);
    }
}

