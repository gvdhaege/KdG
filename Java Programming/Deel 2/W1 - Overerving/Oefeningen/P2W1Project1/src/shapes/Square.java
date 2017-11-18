package shapes;

// Class Square erft over van class Rectangle : keyword 'extends'
//
// Een vierkant is een soort van rechthoek.
//
// Square bevat automatisch alle protected/public methods en attributen van Rectangle.

public class Square extends Rectangle
{
    // Constructor
    //
    // De constructor van de superclass wordt automatisch uitgevoerd als eerste statement.
    public Square()
    {
        System.out.println("\t\tSQUARE : in constructor SUBclass Square.");

        height = 200;
        width = 200;
    }

    // @Override annotation : we overschrijven de toString method van de superclass Object.
    @Override
    public String toString()
    {
        return "\t\tSQUARE -- state : " + "height = " + height + ", width = " + width + '.';
    }

    // @Override annotation : we overschrijven de getCircumference method van de superclass Rectangle.
    /*
    @Override
    public int getCircumference()
    {
        System.out.println("\t\tSQUARE : in getCircumference van Square.");
        return height * 4;
    }
    */
}
