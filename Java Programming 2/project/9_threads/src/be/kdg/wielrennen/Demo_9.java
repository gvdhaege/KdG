package be.kdg.wielrennen;

import be.kdg.wielrennen.threading.WielRennerRunnable;

import java.time.LocalDate;

public class Demo_9 {
    private final static double TEST_COUNT = 100;

    public static void main(String[] args) {
        //opdracht 2.2
        WielRennerRunnable runnable1 = new WielRennerRunnable(wielRenner -> wielRenner.getLengte() > 170);
        WielRennerRunnable runnable2 = new WielRennerRunnable(wielRenner -> wielRenner.getGeboorteDatum().isBefore(LocalDate.of(1990, 1, 1)));
        WielRennerRunnable runnable3 = new WielRennerRunnable(wielRenner -> wielRenner.getGewicht() < 70.0);

        Thread[] threads = new Thread[3];

        double gemiddelde = 0;

        for (int i = 0; i < TEST_COUNT; i++) {
            threads[0] = new Thread(runnable1, "ONE");
            threads[1] = new Thread(runnable2, "TWO");
            threads[2] = new Thread(runnable3, "THREE");

            double startTijd = System.currentTimeMillis();

            for (Thread thread : threads) {
                thread.start();
                try {
                    threads[0].join();
                    threads[1].join();
                    threads[2].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            gemiddelde += System.currentTimeMillis() - startTijd;
        }

        System.out.println("Wielrenners van runnable/thread ONE dewelke groter zijn dan 170cm:");
        runnable1.getWielRenners().stream().limit(5).forEach(System.out::println);

        System.out.println("\nWielrenners van runnable/thread TWO dewelke voor 01/01/1990 geboren zijn:");
        runnable2.getWielRenners().stream().limit(5).forEach(System.out::println);

        System.out.println("\nWielrenners van runnable/thread THREE dewelke minder dan 70kg wegen:");
        runnable3.getWielRenners().stream().limit(5).forEach(System.out::println);
        gemiddelde = gemiddelde / TEST_COUNT;
        System.out.printf("\n3 threads verzamelen elk 1000 wielrenners (gemiddelde uit %.0f runs): %.2fms", TEST_COUNT, gemiddelde);
    }
}
