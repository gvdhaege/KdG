package be.kdg.wielrennen;

import be.kdg.wielrennen.data.Data;
import be.kdg.wielrennen.model.Discipline;
import be.kdg.wielrennen.model.WielRenner;
import be.kdg.wielrennen.model.WielRenners;
import be.kdg.wielrennen.persist.WielRennerDbDao;

import java.io.*;
import java.time.LocalDate;
import java.util.List;

public class Demo_7 {
    public static void main(String[] args) {
        //opdracht 2.2 & 2.3
        List<WielRenner> data = Data.getData();
        WielRenners wielRenners = new WielRenners();
        data.forEach(wielRenners::voegToe);

        System.out.println("Wielrenners object voor serialize");
        System.out.println(wielRenners.sorteerOpNationaliteit());

        try (FileOutputStream fileOutput = new FileOutputStream("../7_persistentie/db/wielrenners.ser");
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
            objectOutput.writeObject(wielRenners);
            System.out.println("\nWielrenners object weggeschreven in wielrenners.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileInputStream fileInput = new FileInputStream("../7_persistentie/db/wielrenners.ser");
             ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {
            WielRenners wielRennersInput = (WielRenners) objectInput.readObject();
            System.out.println("\nWielrenners object na serialize");
            System.out.println(wielRennersInput.sorteerOpNationaliteit());
            System.out.println("\nequals: " + wielRenners.equals(wielRennersInput));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        //opdracht 3.6
        WielRennerDbDao wielRennerDbDao = null;
        try {
            wielRennerDbDao = new WielRennerDbDao("jdbc:hsqldb:file:../7_persistentie/db/data");
            //opdracht 3.8a & 3.8b
            wielRennerDbDao.voegToe(new WielRenner("Evans", "Kyle", "BRIT",
                    LocalDate.of(1993, 9, 26), 180, 81.0, "BTech", Discipline.BMX));
            wielRennerDbDao.voegToe(new WielRenner("Benoot", "Tiesj", "BELG",
                    LocalDate.of(1994, 3, 11), 190, 72.0, "Lotto Soudal", Discipline.RACE));
            wielRennerDbDao.voegToe(new WielRenner("Schurter", "Nino", "ZWITSER",
                    LocalDate.of(1986, 5, 13), 173, 66.0, "Scott - SRAM", Discipline.MTB));
            wielRennerDbDao.voegToe(new WielRenner("Kulhavý", "Jaroslav", "TJSECHS",
                    LocalDate.of(1985, 1, 8), 187, 76.0, "Specialized Factory Racing", Discipline.MTB));
            wielRennerDbDao.voegToe(new WielRenner("Kristoff", "Alexander", "NOORS",
                    LocalDate.of(1987, 7, 5), 181, 78.0, "UAE Team Emirates", Discipline.RACE));
            wielRennerDbDao.voegToe(new WielRenner("van der Haar", "Lars", "NEDERLANDS",
                    LocalDate.of(1991, 7, 23), 169, 58.0, "Telenet Fidea Lions", Discipline.CYCLOCROSS));
            wielRennerDbDao.voegToe(new WielRenner("Pauwels", "Kevin", "BELG",
                    LocalDate.of(1984, 4, 12), 175, 60.0, "Marlux Napoleon Games", Discipline.CYCLOCROSS));

            //opdracht 3.8c
            System.out.println("\nResultaat van zoekopdracht naam <Kulhavý> voornaam <Jaroslav>:");
            WielRenner resultaat = wielRennerDbDao.zoek("Kulhavý", "Jaroslav");
            System.out.println(resultaat);
            System.out.println("id/primary key van resultaat: " + resultaat.getId());

            //opdracht 3.8d
            System.out.println("\nNaam van resultaat gewijzigd naar <Janssens>");
            resultaat.setNaam("Janssens");
            wielRennerDbDao.update(resultaat);

            System.out.println("\nResultaat van zoekopdracht naam <Janssens> voornaam <Jaroslav>:");
            WielRenner resultaatNaUpdate = wielRennerDbDao.zoek("Janssens", "Jaroslav");
            System.out.println(resultaatNaUpdate);

            //opdracht 3.8e
            wielRennerDbDao.verwijder("Janssens", "Jaroslav");
            System.out.println("\nResultaat van zoekopdracht naam <Janssens> voornaam <Jaroslav> na verwijder:");
            WielRenner resultaatNaVerwijder = wielRennerDbDao.zoek("Janssens", "Jaroslav");
            System.out.println(resultaatNaVerwijder);

            //opdracht 3.9
            System.out.println("\nWielrenners gesorteerd op nationaliteit: ");
            wielRennerDbDao.sorteerOpNationaliteit().forEach(System.out::println);

            System.out.println("\nWielrenners gesorteerd op gewicht: ");
            wielRennerDbDao.sorteerOpGewicht().forEach(System.out::println);

            System.out.println("\nWielrenners gesorteerd op lengte: ");
            wielRennerDbDao.sorteerOpLengte().forEach(System.out::println);

            //opdracht 3.10 & 3.11
            System.out.println("\nWielrenners gefilterd op <nationaliteit> is <BELG>: ");
            wielRennerDbDao.gefilterdOp("nationaliteit = 'BELG'").forEach(System.out::println);

            System.out.println("\nWielrenners gefilterd op <ploeg> is <Lotto Soudal>: ");
            wielRennerDbDao.gefilterdOp("ploeg = 'Lotto Soudal'").forEach(System.out::println);

            System.out.println("\nWielrenners gefilterd op <gewicht> is < >= 75kg>: ");
            wielRennerDbDao.gefilterdOp("gewicht >= 75").forEach(System.out::println);

        } finally {
            wielRennerDbDao.closeDb();
        }
    }
}
