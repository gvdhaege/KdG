package be.kdg;

import be.kdg.woordenboek2.Woordenboek;
import be.kdg.woordenboek2.WoordenboekCreator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestWoordenBoek {
    public static void main(String[] args) {
        WoordenboekCreator demo = new WoordenboekCreator();
        Woordenboek woordenboek = demo.getWoordenboek();

        System.out.println("Aantal woorden: " + woordenboek.aantalWoorden());

        List<String> woorden = new ArrayList<>(woordenboek.getOrigineleWoorden());
        Collections.sort(woorden, new WoordComparator());
        for (int i = 0; i < woordenboek.aantalWoorden(); i++) {
            System.out.println(woorden.get(i) + " - " + woordenboek.vertaal(woorden.get(i)));
        }

        try {
        System.out.println("twaalf - " + woordenboek.vertaal("twaalf"));
        }
        catch(RuntimeException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Alle Nederlandse woorden: " + woordenboek.nederlandseWoorden());
        System.out.println("Alle vertalingen: " + woordenboek.vertalingen());
        try {
            woordenboek.nederlandseWoorden().add("test");
            System.out.println("Test MISLUKT: de set is niet read-only!");
        } catch (UnsupportedOperationException e) {
            System.out.println("Test gelukt: de set is read-only.");
        }
        try {
            woordenboek.vertalingen().add("test");
            System.out.println("Test MISLUKT: de list is niet read-only!");
        } catch (UnsupportedOperationException e) {
            System.out.println("Test gelukt: de list is read-only.");
        }

    }

    private static int getInteger(String string) {
        switch (string) {
            case "een":
                return 1;
            case "twee":
                return 2;
            case "drie":
                return 3;
            case "vier":
                return 4;
            case "vijf":
                return 5;
            case "zes":
                return 6;
            case "zeven":
                return 7;
            case "acht":
                return 8;
            case "negen":
                return 9;
            case "tien":
                return 10;
        }
        return 0;
    }

    private static class WoordComparator implements Comparator<String>, Serializable {
        @Override
        public int compare(String eerste, String tweede) {
            int getalEen = getInteger(eerste);
            int getalTwee = getInteger(tweede);
            return getalEen - getalTwee;
        }
    }
}

/*
Aantal woorden: 10
een - yksi
twee - kaksi
drie - kolme
vier - neljä
vijf - viisi
zes - kuusi
zeven - seitsemän
acht - kahdeksan
negen - yhdeksän
tien - kymmenen
Vertaling niet gevonden!
Alle Nederlandse woorden: [zeven, acht, negen, twee, drie, vier, vijf, tien, zes, een]
Alle vertalingen: [kahdeksan, kaksi, kolme, kuusi, kymmenen, neljä, seitsemän, viisi, yhdeksän, yksi]
Test gelukt: de set is read-only.
Test gelukt: de list is read-only.
*/
