package be.kdg.wielrennen;

import be.kdg.wielrennen.model.Discipline;
import be.kdg.wielrennen.model.WielRenner;
import be.kdg.wielrennen.model.WielRennerFactory;
import be.kdg.wielrennen.model.WielRenners;
import be.kdg.wielrennen.patterns.ObservableWielRenners;
import be.kdg.wielrennen.patterns.UnmodifiableWielRenners;
import be.kdg.wielrennen.patterns.WielRennersObserver;

import java.time.LocalDate;
import java.util.List;

public class Demo_5 {
    public static void main(String[] args) {
        ObservableWielRenners observableWielRenners = new ObservableWielRenners(new WielRenners());
        WielRennersObserver wielRennersObserver = new WielRennersObserver(observableWielRenners);
        observableWielRenners.addObserver(wielRennersObserver);

        observableWielRenners.voegToe(WielRennerFactory.newFilledWielRenner("Benoot", "Tiesj", "BELG",
                LocalDate.of(1994, 3, 11), 190, 72.0, "Lotto Soudal", Discipline.RACE));
        observableWielRenners.voegToe(WielRennerFactory.newFilledWielRenner("Kristoff", "Alexander", "NOORS",
                LocalDate.of(1987, 7, 5), 181, 78.0, "UAE Team Emirates", Discipline.RACE));
        observableWielRenners.voegToe(WielRennerFactory.newFilledWielRenner("van der Haar", "Lars", "NEDERLANDS",
                LocalDate.of(1991, 7, 23), 169, 58.0, "Telenet Fidea Lions", Discipline.CYCLOCROSS));
        System.out.println("Aantal wielrenners na toevoegen: " + observableWielRenners.getAantal() + "\n");

        observableWielRenners.verwijder("Kristoff", "Alexander");
        observableWielRenners.verwijder("Benoot", "Tiesj");
        observableWielRenners.verwijder("van der Haar", "Lars");
        System.out.println("Aantal wielrenners na verwijderen: " + observableWielRenners.getAantal() + "\n");

        System.out.println("Willekeurig gegenereerde wielrenners: ");
        observableWielRenners.voegToe(WielRennerFactory.newEmptyWielRenner());
        observableWielRenners.voegToe(WielRennerFactory.newRandomWielRenner());
        observableWielRenners.voegToe(WielRennerFactory.newRandomWielRenner());
        observableWielRenners.voegToe(WielRennerFactory.newRandomWielRenner());
        observableWielRenners.voegToe(WielRennerFactory.newRandomWielRenner());
        observableWielRenners.voegToe(WielRennerFactory.newRandomWielRenner());
        observableWielRenners.voegToe(WielRennerFactory.newRandomWielRenner());
        observableWielRenners.voegToe(WielRennerFactory.newRandomWielRenner());
        observableWielRenners.voegToe(WielRennerFactory.newRandomWielRenner());
        observableWielRenners.voegToe(WielRennerFactory.newRandomWielRenner());
        observableWielRenners.voegToe(WielRennerFactory.newRandomWielRenner());


        //PROTECTION PROXY
        UnmodifiableWielRenners unmodifiableWielRenners = new UnmodifiableWielRenners(new WielRenners());

//        unmodifiableWielRenners.voegToe(WielRennerFactory.newFilledWielRenner("van der Haar", "Lars", "NEDERLANDS",
//                LocalDate.of(1991, 7, 23), 169, 58.0, "Telenet Fidea Lions", Discipline.CYCLOCROSS));
        List<WielRenner> wielRenners = unmodifiableWielRenners.sorteerOpGewicht();
        wielRenners.add(WielRennerFactory.newFilledWielRenner("van der Haar", "Lars", "NEDERLANDS",
                LocalDate.of(1991, 7, 23), 169, 58.0, "Telenet Fidea Lions", Discipline.CYCLOCROSS));
    }
}
