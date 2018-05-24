package be.kdg.racelambda;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class StartRace {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Runnable myRunnable = () -> {
            // TODO Vul hier aan
            String name = Thread.currentThread().getName();
            System.out.println(name + " START");
            for (int i = 0; i < 10; i++) {
                System.out.println(name + " ronde " + (i + 1));
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                    // negeer
                }
            }
            System.out.println(name + " AANGEKOMEN");
        };

        Thread racerEen = new Thread(myRunnable, "Peter");
        Thread racerTwee = new Thread(myRunnable, "Julie");

        System.out.println("De deelnemers staan klaar");
        racerEen.start();
        racerTwee.start();
        System.out.println("De race is begonnen");
    }
}
