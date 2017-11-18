package be.kdg;

import be.kdg.model.Model;

public class TestModel {
    public static void main(String[] args) {
        Model eerste = new Model("Caroline");
        System.out.println("\nEerste model");
        System.out.println(eerste);

        Model tweede = new Model("Veronica", 102, 67, 88);
        tweede.setAdres("Nationalestraat 5", 2000, "Antwerpen");
        System.out.println("\nTweede model");
        System.out.println(tweede);
    }
}

/*
Eerste model
Naam: Caroline
Adres: adres onbekend
Maten: 90 60 90

Tweede model
Naam: Veronica
Adres: Nationalestraat 5 2000 Antwerpen
Maten: 102 67 88
 */
