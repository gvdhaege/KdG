package be.kdg.wielrennen;

import be.kdg.wielrennen.model.Discipline;
import be.kdg.wielrennen.model.WielRenner;
import be.kdg.wielrennen.model.WielRennerFactory;
import be.kdg.wielrennen.threading.WielRennerAttacker;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo_10 {
    public static void main(String[] args) {
        //opdracht 3.3
        List<WielRenner> wielRenners = Stream
                .generate(WielRennerFactory::newRandomWielRenner)
                .limit(1000)
                .collect(Collectors.toList());

        Predicate<WielRenner> gewichtPredicate = a -> a.getGewicht() > 70.0;
        Predicate<WielRenner> disciplinePredicate = a -> a.getDiscipline().equals(Discipline.CYCLOCROSS);
        Predicate<WielRenner> lengtePredicate = a -> a.getLengte() > 200;

        long gewichtCount = wielRenners.stream().filter(gewichtPredicate).count();
        long disciplineCount = wielRenners.stream().filter(disciplinePredicate).count();
        long lengteCount = wielRenners.stream().filter(lengtePredicate).count();


        System.out.printf("Voor attacks resteren er nog <%d> wielrenners in de lijst, waarvan:", wielRenners.size());
        System.out.printf("\n<%d> aantal wielrenners boven de 70kg", gewichtCount);
        System.out.printf("\n<%d> aantal wielrenners met Cyclocross als discipline", disciplineCount);
        System.out.printf("\n<%d> aantal wielrenners groter dan 200cm\n", lengteCount);


        Thread attacker1 = new Thread(new WielRennerAttacker(wielRenners, gewichtPredicate), "ATTACKER1");
        Thread attacker2 = new Thread(new WielRennerAttacker(wielRenners, disciplinePredicate), "ATTACKER2");
        Thread attacker3 = new Thread(new WielRennerAttacker(wielRenners, lengtePredicate), "ATTACKER3");

        attacker1.start();
        attacker2.start();
        attacker3.start();

        try {
            attacker1.join();
            attacker2.join();
            attacker3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.printf("Na attacks resteren er nog <%d> wielrenners in de lijst, waarvan:", wielRenners.size());
        System.out.printf("\n<%d> aantal wielrenners boven de 70kg", wielRenners.stream().filter(gewichtPredicate).count());
        System.out.printf("\n<%d> aantal wielrenners met Cyclocross als discipline", wielRenners.stream().filter(disciplinePredicate).count());
        System.out.printf("\n<%d> aantal wielrenners groter dan 200cm\n", wielRenners.stream().filter(lengtePredicate).count());
    }
}
