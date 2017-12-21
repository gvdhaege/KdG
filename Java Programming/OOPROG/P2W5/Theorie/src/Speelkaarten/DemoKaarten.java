package Speelkaarten;

public class DemoKaarten {
    public static void main(String[] args) {
        BoekKaarten boekKaarten = new BoekKaarten();

        boekKaarten.tonen();
        boekKaarten.schudden();
        System.out.println("\nNa shuffle:");
        boekKaarten.tonen();
    }
}
