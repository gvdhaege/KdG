package be.kdg.wielrennen;

import be.kdg.wielrennen.generics.PriorityQueue;
import be.kdg.wielrennen.model.Discipline;
import be.kdg.wielrennen.model.WielRenner;

import java.time.LocalDate;

public class Demo_2 {
    public static void main(String[] args) {
        //opdracht 2.5 & 2.6
        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.enqueue("alfa", 2);
        myQueue.enqueue("beta", 5);
        myQueue.enqueue("gamma", 2);
        myQueue.enqueue("delta", 3);
        System.out.println("Overzicht van de PriorityQueue:");
        System.out.println(myQueue.toString());
        System.out.println("aantal: " + myQueue.getSize());
        System.out.println("positie van gamma: " + myQueue.search("gamma"));
        for (int i = 0; i < 4; i++) {
            System.out.println("Dequeue: " + myQueue.dequeue());
        }
        System.out.println("Size na dequeue: " + myQueue.getSize());


        //opdracht 2.7
        PriorityQueue<WielRenner> wielrennerQueue = new PriorityQueue<>();
        wielrennerQueue.enqueue(new WielRenner("Benoot", "Tiesj", "BELG",
                LocalDate.of(1994, 3, 11), 190, 72.0, "Lotto Soudal", Discipline.RACE), 2);
        wielrennerQueue.enqueue(new WielRenner("Fumic", "Manuel", "DUITS",
                LocalDate.of(1982, 3, 30), 174, 65.0, "Cannondale Factory Racing", Discipline.MTB), 3);
        wielrennerQueue.enqueue(new WielRenner("Evans", "Kyle", "BRIT",
                LocalDate.of(1993, 9, 26), 180, 81.0, "BTech", Discipline.BMX), 3);
        wielrennerQueue.enqueue(new WielRenner("Glaetzer", "Matthew", "AUSTRALISCH",
                LocalDate.of(1992, 8, 24), 190, 86.0, "Australian National Team", Discipline.PISTE), 5);
        wielrennerQueue.enqueue(new WielRenner("Greipel", "André", "DUITS",
                LocalDate.of(1982, 7, 16), 184, 82.0, "Lotto Soudal", Discipline.RACE), 2);
        wielrennerQueue.enqueue(new WielRenner("van der Poel", "Mathieu", "NEDERLANDS",
                LocalDate.of(1995, 1, 19), 182, 67.0, "Corendon Circus", Discipline.CYCLOCROSS), 1);
        wielrennerQueue.enqueue(new WielRenner("Cavendish", "Marc", "BRIT",
                LocalDate.of(1985, 5, 21), 175, 75.0, "Team Dimension Data", Discipline.RACE), 5);
        wielrennerQueue.enqueue(new WielRenner("Kristoff", "Alexander", "NOORS",
                LocalDate.of(1987, 7, 5), 181, 78.0, "UAE Team Emirates", Discipline.RACE), 5);
        System.out.println("\nOverzicht van de WielRenner PriorityQueue:");
        System.out.println(wielrennerQueue.toString());
        System.out.println("aantal: " + wielrennerQueue.getSize());
        System.out.println("positie van Marc Cavendish: " + wielrennerQueue.search(new WielRenner("Kristoff", "Alexander", "NOORS",
                LocalDate.of(1987, 7, 5), 181, 78.0, "UAE Team Emirates", Discipline.RACE)));
        System.out.println("positie van Mathieu van der Poel: " + wielrennerQueue.search(new WielRenner("van der Poel", "Mathieu", "NEDERLANDS",
                LocalDate.of(1995, 1, 19), 182, 67.0, "Corendon Circus", Discipline.CYCLOCROSS)));
        for (int i = 0; i < 8; i++) {
            System.out.println("Dequeue: " + wielrennerQueue.dequeue());
        }
        System.out.println("Size na dequeue: " + wielrennerQueue.getSize());
    }
}
