/*
    De klasse Vat implementeert de interface Deelbaar
    als je een vat deelt, haal je er de helft van de inhoud uit
 */
public class Vat implements Deelbaar {
    int capaciteit;
    int inhoud;

    public Vat(int capaciteit, int inhoud) {
        this.capaciteit = capaciteit;
        this.inhoud = inhoud;
    }

    @Override
    public Deelbaar getHelft() {
        return new Vat(capaciteit, inhoud / 2);
    }

    public String toString() {
        return "capaciteit: " + capaciteit + "l"
                + " inhoud: " + inhoud + "l";
    }
}
