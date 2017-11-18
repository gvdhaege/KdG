package main;

import shapes.Rectangle;
import shapes.Square;

// Punten 20 november on line.
// Periode 2 : 5 weken les on line, 1 week les on campus.
// Laatste les : 2 uur praktijksessie = proefexamen.

// We gaan verder met OO Programming.
//
// In een CLASS wordt de definitie uitgewerkt van de elementen of bouwstenen die je in
// je programma wil gebruiken.
//
// Als je een class wil gebruiken, maak je er een OBJECT van (= een instance van een class).
//
// Een class bevat
//      attributen :    daarin bewaar je de state van het object,
//      methodes :      daarmee kan je de state van het object veranderen of bevragen.
//
// Een programma bestaat uit objecten.
// De classes van die objecten worden opgebouwd volgens een bepaalde hierarchie.
//
// Een package komt overeen met een map op je harde schijf.
// In een package worden classes volgens een bepaalde structuur samengezet.
//
// Vanaf nu werken we altijd met een testclass in package main, 'MainProgram'.
// In MainProgram worden objecten aangemaakt van classes die in de andere packages gedefiniëerd zijn.

// Vooraf : code convention om te loggen via System.out.println() :
//      Log in elke method de naam van de class.
//      Werk met tabs '\t' om de niveaus aan te geven.
//
// Op deze manier kan je de structuur van je classes laten zien at runtime.

// Overerving, inheritance. Zie slide 5.

public class MainProgram
{
    // Main program.
    public static void main(String[] args)
    {
        System.out.println("MAINPROGRAM : Start of mainprogram.");

        /*
        // Maak een nieuw object van class Rectangle, met naam rectangle.
        // De constructor call wordt gelogd.
        // Dan volgt een toString van het object : geeft de huidige state van het object weer.
        System.out.println("MAINPROGRAM : Making new Rectangle object.");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.toString());
        */

        /*
        // Call de getters van rectangle.
        Rectangle rectangle = new Rectangle();
        System.out.println("MAINPROGRAM : Height van rectangle = " + rectangle.getHeight());
        System.out.println("MAINPROGRAM : Width van rectangle = " + rectangle.getWidth());
        */

        /*
        // Maak een nieuw object van class Square, met naam square.
        //
        // Eerst wordt de constructor van de superclass gecalled.
        // Dan die van de subclass.
        //
        // Bij de toString wordt enkel die van de subclass gecalled.
        System.out.println("MAINPROGRAM : Making new Square object.");
        Square square = new Square();
        System.out.println(square.toString());
        */

        /*
        // Call de getters van square.
        // Die staan niet in de class Square, maar worden overgeërfd van Rectangle.
        Square square = new Square();
        System.out.println("MAINPROGRAM : Height van square = " + square.getHeight());
        System.out.println("MAINPROGRAM : Width van square = " + square.getHeight());
        */

        /*
        // Call method van rectangle, getCircumference.
        Rectangle rectangle = new Rectangle();
        System.out.println("MAINPROGRAM : Omtrek van rectangle = " + rectangle.getCircumference());
        */

        /*
        // Call method van square via overerving, getCircumference().
        // Deze method staat gedefiniëerd in superclass Rectangle.
        Square square = new Square();
        System.out.println("MAINPROGRAM : Omtrek van square = " + square.getCircumference());
        */

        /*
        // Zet nu de method getCircumference van de class Square uit commentaar, en run.
        // Nu wordt de method van Square gerund, omdat je die daar hebt overschreven.
        // De method van Rectangle speelt nu geen rol meer in Square.
        */

        System.out.println("MAINPROGRAM : End of mainprogram.");
    }
}
