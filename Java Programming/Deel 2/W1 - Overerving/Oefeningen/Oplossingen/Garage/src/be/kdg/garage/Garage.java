package be.kdg.garage;

/*
Maak eerst de klasse Garage.

De klasse heeft slechts 1 attribuut, naam (type String).
Voorzie een constructor en getters en setters.
Voorzie een toString methode die de naam teruggeeft.
Bijvoorbeeld: "Garage: Verstraeten NV" 
 */
public class Garage {
    private String naam;

    public Garage(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Garage: " + naam;
    }

}
