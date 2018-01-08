package be.kdg;

import be.kdg.woordenboek.Woordenboek;
import be.kdg.woordenboek.WoordenboekCreator;

public class TestWoordenBoek {
    public static void main(String[] args) {
        WoordenboekCreator demo = new WoordenboekCreator();
        Woordenboek woordenboek = demo.getWoordenboek();

        System.out.println("Aantal woorden: " + woordenboek.aantalWoorden());
        System.out.println("een - " + woordenboek.vertaal("een"));
        System.out.println("drie - " + woordenboek.vertaal("drie"));
        System.out.println("zeven - " + woordenboek.vertaal("zeven"));
        System.out.println("twaalf - " + woordenboek.vertaal("twaalf"));
    }
}

/*
Aantal woorden: 10
een - yksi
drie - kolme
zeven - seitsemän
twaalf - Vertaling niet gevonden
*/
