package classes;

//
// "The purpose of an abstract class is to specify the default functionality of an object and let its sub-classes
// to explicitly implement that functionality. Thus, it stands as an abstraction layer that must be extended and
// implemented by the sub-classes."
//
// Abstract class = soort CONTRACT waarin staat wat de subclasses moeten implementeren.
// Good OO Programming Practice.
// Bevat zelf geen implementaties.
//
// Note : keyword 'abstract'.
// Note : van een abstract class kan je geen objecten aanmaken.
//

public abstract class Instrument
{
    protected String name;              // Is gekend in subclasses.

    public abstract void play();        // Method die zal worden geïmplementeerd in de subclasses.
}
