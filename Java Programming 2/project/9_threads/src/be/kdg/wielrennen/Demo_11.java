package be.kdg.wielrennen;

import be.kdg.wielrennen.model.Discipline;
import be.kdg.wielrennen.model.WielRenner;
import be.kdg.wielrennen.threading.WielRennerCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Predicate;

public class Demo_11 {
    private static final double TEST_COUNT = 100;

    public static void main(String[] args) {
        //opdracht 4.2
        Predicate<WielRenner> gewichtPredicate = a -> a.getGewicht() > 70.0;
        Predicate<WielRenner> disciplinePredicate = a -> a.getDiscipline().equals(Discipline.CYCLOCROSS);
        Predicate<WielRenner> lengtePredicate = a -> a.getLengte() > 200;

        WielRennerCallable callable1 = new WielRennerCallable(gewichtPredicate);
        WielRennerCallable callable2 = new WielRennerCallable(disciplinePredicate);
        WielRennerCallable callable3 = new WielRennerCallable(lengtePredicate);

        ExecutorService pool = Executors.newFixedThreadPool(3);


        Future[] futures = new Future[3];
        WielRennerCallable[] callables = {callable1, callable2, callable3};

        double gemiddelde = 0;

        for (int i = 0; i < TEST_COUNT; i++) {
            double startTijd = System.currentTimeMillis();

            for (int j = 0; j < futures.length; j++) {
                futures[j] = pool.submit(callables[j]);
            }
            try {
                futures[0].get();
                futures[1].get();
                futures[2].get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            gemiddelde += System.currentTimeMillis() - startTijd;
        }

        pool.shutdown();

        gemiddelde = gemiddelde / TEST_COUNT;
        System.out.printf("3 Futures verzamelen elk 1000 wielrenners (gemiddelde uit %.0f runs): %.2fms", TEST_COUNT, gemiddelde);
    }
}
