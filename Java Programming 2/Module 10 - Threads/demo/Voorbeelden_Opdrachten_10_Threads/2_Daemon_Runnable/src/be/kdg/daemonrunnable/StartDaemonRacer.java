package be.kdg.daemonrunnable;

import java.util.Scanner;

public class StartDaemonRacer {

    public static void main(String[] args) {
        DaemonRunnableRacer racer1 = new DaemonRunnableRacer("Hamilton");
        DaemonRunnableRacer racer2 = new DaemonRunnableRacer("Rosberg");

        Thread thread1 = new Thread(racer1);
        Thread thread2 = new Thread(racer2);

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();

        System.out.println("Druk op <ENTER> om te stoppen...");
        new Scanner(System.in).nextLine();

        System.out.printf("%s legde %d ronden af.%n", racer1.getNaam(), racer1.getRondeNummer());
        System.out.printf("%s legde %d ronden af.%n", racer2.getNaam(), racer2.getRondeNummer());
    }
}
