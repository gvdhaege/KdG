package be.kdg.auto;

/*
Maak vervolgens de klasse Auto.
Voorzie 3 attributen, merknaam (String), nummerplaat (String) en motor (Motor).
Maak een constructor waarbij de merknaam en de nummerplaat worden meegegeven.
Voorzie 2 extra constructors, 1 met als enige parameter de merknaam en een copy constructor.
Gebruik this bij deze constructors om door te verwijzen naar de eerste constructor.
Werk de methode geefGas uit, daar verhoog je het toerental met 200.
Werk de methode geefGas opnieuw uit, ditmaal met een int parameter.
De methode rem legt de motor stil.
De methode toString geeft een string-representatie van de auto.
Bijvoorbeeld "VW Golf met kenteken BHZ456" 
 */
public class Auto {
    private String merknaam;
    private String nummerplaat;
    private Motor motor;

    public Auto(String merknaam, String nummerplaat) {
        motor = new Motor();
        this.merknaam = merknaam;
        this.nummerplaat = nummerplaat;
    }

    public Auto(String merknaam) {
        this(merknaam, "onbekend");
    }

    public Auto(Auto auto) {
        this(auto.merknaam, auto.nummerplaat);
    }

    public void geefGas() {
        motor.verhoogToerental(200);

    }

    public void geefGas(int toename) {
        motor.verhoogToerental(toename);
    }

    public void rem() {
        motor.setToerental(0);
    }

    public void toonToerental() {
        System.out.println(motor.getToerental());
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Auto auto = (Auto) object;

        return nummerplaat.equals(auto.nummerplaat);
    }

    @Override
    public int hashCode() {
        return nummerplaat.hashCode();
    }

    @Override
    public String toString() {
        return merknaam + " met kenteken " + nummerplaat;
    }
}
