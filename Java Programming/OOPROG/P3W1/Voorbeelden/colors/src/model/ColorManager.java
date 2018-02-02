package model;

//
// ColorManager is de class die alle data beheert, in dit geval gegevens over kleuren.
//

public class ColorManager
{
    // Opsomming van de kleuren.
    public enum Color
    {
        ORANGE, RED, GREEN
    }

    // Een variabele van de enum Color.
    private Color currentColor;

    // Constructor.
    public ColorManager()
    {
        this.currentColor = Color.RED;          // Huidige kleur wordt op RED gezet.
    }

    // Getter voor currentColor.
    public Color getCurrentColor()
    {
        return currentColor;
    }

    // Method die currentColor op de volgende kleur zet.
    public void next()
    {
        // Voor RED is de ordinal gelijk aan 1.
        // We tellen daar 1 bij op, dat geeft 2.
        // We berekenen dan de modulo (rest bij deling) van 2 / 3, dat geeft 1.
        //
        // We gebruiken dan die 1 als index in de values van de enum.
        // We zetten currentColor op dat element van de enum.

        System.out.println("index = " + (this.currentColor.ordinal() + 1) % Color.values().length);
        this.currentColor = Color.values()[(this.currentColor.ordinal() + 1) % Color.values().length];
    }
}
