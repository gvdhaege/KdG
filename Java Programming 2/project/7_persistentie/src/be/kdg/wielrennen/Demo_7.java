package be.kdg.wielrennen;

import be.kdg.wielrennen.data.Data;
import be.kdg.wielrennen.model.WielRenner;
import be.kdg.wielrennen.model.WielRenners;
import be.kdg.wielrennen.persist.WielRennerDbDao;

import java.io.*;
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
        //TODO vanaf 3.8 + refactoring
        WielRennerDbDao wielRennerDbDao = null;
        try {
            wielRennerDbDao = new WielRennerDbDao("jdbc:hsqldb:file:../7_persistentie/db/data");
            wielRennerDbDao.vulTabel();
            List<WielRenner> wielRenners1 = wielRennerDbDao.zoekTabel();
            System.out.println(wielRenners1);
            System.out.println(wielRenners1.size());
        } finally {
            wielRennerDbDao.closeDb();
        }


    }
}
