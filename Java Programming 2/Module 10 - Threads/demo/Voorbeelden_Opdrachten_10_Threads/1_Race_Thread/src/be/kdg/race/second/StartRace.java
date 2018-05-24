package be.kdg.race.second;

public class StartRace {
    public static void main(String[] args) {
        Racer racerEen = new Racer("Peter");
        Racer racerTwee = new Racer("Julie");

        System.out.println("Deelnemers staan klaar");
        racerEen.start();
        racerTwee.start();
        System.out.println("De race is begonnen!");


        // Kortere schrijfwijze:  new Racer("Peter").start();
    }
}
