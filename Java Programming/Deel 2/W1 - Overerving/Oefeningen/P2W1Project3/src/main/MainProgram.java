package main;

//
// Polymorfisme = veel vormen.
//
// Je kan een superclass en zijn subclasses door elkaar gebruiken.
// Nuttig : werk met een array van superclasses en bewaar er ook de subclasses in.
// Gemakkelijk : je hoeft niet te testen op de soort class.
//

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class MainProgram
{
    public static void main(String[] args)
    {
        System.out.println("MAINPROGRAM : Start of mainprogram.");

        // Een array van shapes (= superclass). Elk shape object kan 3 vormen aannemen : Shape, Rectangle en Circle.
        Shape[] shapes = new Shape[5];

        shapes[0] = new Shape();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();
        shapes[3] = new Rectangle();
        shapes[4] = new Circle();

        for (int i=0; i < shapes.length; i++)
        {
            System.out.println("MAINPROGRAM : Object " + i + " is van " + shapes[i].getClass() + " en heeft als hashcode " + shapes[i].hashCode() + ".");
        }

        System.out.println("MAINPROGRAM : End of mainprogram.");
    }
}
