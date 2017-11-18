package be.kdg.garage;

/*
Maak vervolgens de klasse Auto.

Voorzie twee attributen merknaam (type String en final) en garage (type Garage).
Voorzie hiervoor een constructor met de twee parameters.
Voorzie twee extra constructors, een constructor met alleen de merknaam en een copy constructor die een kopie van een object maakt.
Gebruik in beide laatste gevallen this() om door te verwijzen naar de eerste constructor.
Voorzie getters en setters.
Voorzie een toString-methode die alle info teruggeeft.
Bijvoorbeeld: "Auto: BMW Z4 Garage: Verstraeten NV". 
 */
public class Auto {
    private final String merknaam;
    private Garage garage;

    public Auto(String merknaam) {
        this(merknaam, null);
    }

    public Auto(Auto auto) {
        this(auto.merknaam, auto.garage);
    }

    public Auto(String merknaam, Garage garage) {
        this.merknaam = merknaam;
        this.garage = garage;
    }

    public String getMerknaam() {
        return merknaam;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
         return "Auto: " + merknaam + " " + garage;
    }
}
