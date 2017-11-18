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
        this.merknaam = merknaam;
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

    public void toonToerental(){
        System.out.println(motor.getToerental());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auto auto = (Auto) o;

        return nummerplaat != null ? nummerplaat.equals(auto.nummerplaat) : auto.nummerplaat == null;
    }

    @Override
    public int hashCode() {
        return nummerplaat != null ? nummerplaat.hashCode() : 0;
    }

    @Override
    public String toString() {
        return merknaam + " met kenteken " + nummerplaat;
    }
}
