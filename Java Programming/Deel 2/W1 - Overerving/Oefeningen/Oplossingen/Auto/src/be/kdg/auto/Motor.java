package be.kdg.auto;

/*
Voorzie een constante MAX_TOERENTAL die je op 5800 zet.
Voorzie een attribuut toerental;
Werk de methode verhoogToerental uit -> void verhoogToerental(int toename)
Let op! Het toerental mag nooit boven het maximum gaan.
Voorzie een getter en een setter voor het toerental. In de setter moet je het toerental valideren.
 */
public class Motor {
    private static final int MAX_TOERENTAL = 5800;

    private int toerental;

    public Motor() {
    }

    public int getToerental() {
        return toerental;
    }

    public void setToerental(int toerental) {
        if (toerental > MAX_TOERENTAL) {
            this.toerental = MAX_TOERENTAL;
        } else {
            this.toerental = toerental;
        }
    }

    public void verhoogToerental(int toename) {
        if (toerental + toename > MAX_TOERENTAL) {
            toerental = MAX_TOERENTAL;
        } else {
            toerental += toename;
        }
    }
}
