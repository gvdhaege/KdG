package classes;

//
// ElectricGuitar erft over van Instrument (= abstract class).
//

public class ElectricGuitar extends Instrument
{
    //
    // Constructor.
    // Roept eerst de default constructor van de superclass aan.
    // Initialiseert dan het attribuut name.
    public ElectricGuitar()
    {
        this.name = "Gibson";
    }

    //
    // Deze method MOET geïmplementeerd worden in de subclass.
    // De method is abstract in de superclass.
    @Override
    public void play()
    {
        System.out.println("\tELECTRIC GUITAR : An electric " + name + " is rocking!");
    }
}
