package shapes;

// Deze class is een superclass. Ze bevat haar eigen logica.
//
// We zullen van deze class OVERERVEN in een subclass, in dit project de class 'Square'.
//
// Elke class die je zelf definiëert, erft automatisch over van de class 'Object'.
// Je hoeft hiervoor niets te doen.

public class Rectangle
{
    // Attributes : protected omdat ze in de subclasses zichtbaar moeten zijn.
    protected int height;
    protected int width;

    // Tip -> nadat je de attributes hebt gedefiniëerd :
    //      Voorzie voor elke class een constructor, getters, setters en een toString method.
    //      Gebruik hiervoor de shortcut alt/insert.

    // Constructor
    public Rectangle()
    {
        System.out.println("\tRECTANGLE : in constructor van SUPERclass Rectangle.");

        height = 100;
        width = 150;
    }

    // Getters en Setters
    public int getHeight()              { return height; }
    public void setHeight(int height)   { this.height = height; }
    public int getWidth()               { return width; }
    public void setWidth(int width)     { this.width = width; }

    // De toString method geeft een beschrijving van de huidige state van het object.

    // @ Override annotation : we OVERSCHRIJVEN de toString method van de superclass Object.
    // 'Override' wil zeggen 'opheffen'. 'Overschrijven' is toevallig 'overwrite'. Een beetje verwarrend.
    @Override
    public String toString()
    {
        return "\tRECTANGLE -- state : " + "height = " + height + ", width = " + width + '.';
    }

    // Method gedefiniëerd op superclass niveau.
    //
    // Wordt overgeërfd door alle subclasses. Die hoef je daar dus niet meer te schrijven.
    public int getCircumference()
    {
        System.out.println("\tRECTANGLE : in getCircumference van Rectangle.");
        return height * 2 + width * 2;
    }
}
