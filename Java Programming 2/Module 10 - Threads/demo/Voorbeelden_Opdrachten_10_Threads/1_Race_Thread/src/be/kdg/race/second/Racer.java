package be.kdg.race.second;


import java.util.concurrent.ThreadLocalRandom;

public class Racer extends Thread {  // Let op de extends!
    private String naam;

    public Racer(String naam) {
       this.naam = naam;
    }

    public void run(){
        ThreadLocalRandom random = ThreadLocalRandom.current();

        System.out.println(naam + " START");
        for (int i = 0; i < 10; i++) {
            System.out.println(naam + " ronde " + (i + 1));
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                // negeer
            }
        }
        System.out.println(naam + " AANGEKOMEN");
    }

    //TODO Vul hier aan (run methode)

}
