package main;

import classes.ElectricGuitar;
import classes.Instrument;
import classes.SubClass;

public class MainProgram
{
    public static void main(String[] args)
    {
        System.out.println("MAINPROGRAM : Start of mainprogram.");

        /*
        // Hoe kan je in een subclass een method van een superclass callen ?
        //
        // Gebruik van het keyword 'super'.
        //
        // Zet eerst de method printMethod van de SubClass in commentaar.
        //      De method van de superclass wordt uitgevoerd.
        //
        // Zet daarna de method printMethod van de SubClass uit commentaar.
        //      De method van de subclass wordt uitgevoerd.
        //      Daarin wordt de method van de superclass uitgevoerd.
        SubClass subClass = new SubClass();
        subClass.printMethod();
        */

        /*
        // Gebruik van abstract class : zie commentaar in class 'Instrument'.
        //
        ElectricGuitar guitar = new ElectricGuitar();
        guitar.play();
        */
        // Poging om een object te maken van de abstract class.
        // Instrument instrument = new Instrument();
        //

        /*
        // 3 Methods van dé Java superclass, 'Object'.
        //
        // Omdat elke class een subclass is van class 'Object', bevat elke class per definitie deze
        // 3 methods.
        //
        // Je kan die eventueel ook overriden.

        ElectricGuitar guitar = new ElectricGuitar();
        // toString overgeërfd van Object = generische omschrijving van de state.
        // Het object 'guitar' is van class ElectricGuitar, met hashcode @nnnnnnnn (hex).
        System.out.println("MAINPROGRAM : toString overgeërfd van Object : " + guitar.toString());
        // getClass overgeërfd van Object = de class van het object.
        System.out.println("MAINPROGRAM : getClass overgeërfd van Object : " + guitar.getClass());
        // hashCode overgeërfd van Object = unieke identificatie van een object.
        System.out.println("MAINPROGRAM : hashCode overgeërfd van Object : " + guitar.hashCode());
        */

        System.out.println("MAINPROGRAM : End of mainprogram.");
    }
}
