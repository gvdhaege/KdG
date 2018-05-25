package be.kdg.wielrennen;

import be.kdg.wielrennen.model.WielRenner;

import java.time.LocalDate;

public class Demo_4 {
    public static void main(String[] args) {
        //opdracht 3.3
        //VM options (MAC): -Djava.util.logging.config.file=../4_testen/log/logging.properties

        WielRenner wielRenner = new WielRenner();
        System.out.println(wielRenner.getNationaliteit());

        wielRenner.setGewicht(180);
        wielRenner.setLengte(300);
        wielRenner.setGeboorteDatum(LocalDate.now());
    }
}
