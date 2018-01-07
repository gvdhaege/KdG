package be.kdg.examen.test;

import be.kdg.examen.klassement.archiefstukken.Boek;
import be.kdg.examen.klassement.archiefstukken.Kaart;
import be.kdg.examen.klassement.archiefstukken.Videoband;

public class TestArchiefStukken {
    public static void main(String[] args) {
        Boek boek = new Boek();
        Videoband videoband = new Videoband();
        Kaart kaart = new Kaart();

        System.out.println(boek + ", hoort in archiefhouder van het type " + boek.hoortIn());
        System.out.println("Omvang videoband is " + videoband.getOmvang() + ", hoort in archiefhouder van het type " + videoband.hoortIn());
        System.out.println("Omvang kaart is " + kaart.getOmvang() + ", hoort in archiefhouder van het type " + kaart.hoortIn());

    }
}
