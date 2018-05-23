package be.kdg.wielrennen;

import be.kdg.wielrennen.model.WielRenner;

public class Demo_4 {
    public static void main(String[] args) {
        WielRenner wielRenner = new WielRenner();

        System.out.println(wielRenner.getNationaliteit());

        wielRenner.setGewicht(180);
        wielRenner.setLengte(300);
    }
}
