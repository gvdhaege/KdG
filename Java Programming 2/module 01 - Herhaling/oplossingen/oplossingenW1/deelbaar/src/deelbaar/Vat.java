package deelbaar;

public class Vat implements Deelbaar {
    int capaciteit;
    int inhoud;

    public Vat(int capaciteit, int inhoud) {
        this.capaciteit = capaciteit;
        this.inhoud = inhoud;
    }


    public void halveer() {
        this.inhoud /= 2;
    }

    public Deelbaar getHelft() {
        return new Vat(capaciteit, inhoud / 2);
    }

    public String toString() {
        return "capaciteit: " + capaciteit + "l"
                + " inhoud: " + inhoud + "l";
    }
}
