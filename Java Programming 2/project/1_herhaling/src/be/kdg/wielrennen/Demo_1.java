package be.kdg.wielrennen;

import be.kdg.wielrennen.data.Data;
import be.kdg.wielrennen.model.Discipline;
import be.kdg.wielrennen.model.WielRenner;
import be.kdg.wielrennen.model.WielRenners;

import java.time.LocalDate;
import java.util.List;

public class Demo_1 {
    public static void main(String[] args) {
        List<WielRenner> data = Data.getData();
        WielRenners wielRenners = new WielRenners();

        System.out.println("Wielrenners data:");
        for (WielRenner wielRenner : data) {
            wielRenners.voegToe(wielRenner);
            System.out.println(wielRenner);
        }
        System.out.println();

        System.out.print("Dubbele wielrenner toevoegen: ");
        System.out.println(wielRenners.voegToe(new WielRenner("Benoot", "Tiesj", "BELG",
                LocalDate.of(1994, 3, 11), 190, 72.0, "Lotto Soudal", Discipline.RACE)) + "\n");

        System.out.println("Wielrenner zoeken op naam: ");
        System.out.println(wielRenners.zoek("Wellens", "Tim") + "\n");

        System.out.print("Aantal wielrenners: ");
        System.out.println(wielRenners.getAantal());

        System.out.print("Verwijder wielrenner: ");
        System.out.println(wielRenners.verwijder("Benoot", "Tiesj"));

        System.out.print("Aantal wielrenners: ");
        System.out.println(wielRenners.getAantal() + "\n");

        wielRenners.voegToe(new WielRenner("Benoot", "Tiesj", "BELG",
                LocalDate.of(1994, 3, 11), 190, 72.0, "Lotto Soudal", Discipline.RACE));

        data = wielRenners.sorteerOpGewicht();
        System.out.println("Wielrenners gesorteerd op gewicht:");
        for (WielRenner wielRenner : data) {
            System.out.println(wielRenner);
        }
        System.out.println();

        data = wielRenners.sorteerOpLengte();
        System.out.println("Wielrenners gesorteerd op lengte:");
        for (WielRenner wielRenner : data) {
            System.out.println(wielRenner);
        }
        System.out.println();

//        System.out.println(wielRenners.voegToe(new WielRenner()));

        data = wielRenners.sorteerOpNationaliteit();
        System.out.println("Wielrenners gesorteerd op nationaliteit:");
        for (WielRenner wielRenner : data) {
            System.out.println(wielRenner);
        }
        System.out.println();

        //test IllegalArgumentException - geboortedatum ligt in de toekomst
//        wielRenners.voegToe(new WielRenner("Naam", "Voornaam", "BELG",
//                LocalDate.of(2020, 3, 11), 190, 10.0, "Lotto Soudal", Discipline.RACE));
    }
}
