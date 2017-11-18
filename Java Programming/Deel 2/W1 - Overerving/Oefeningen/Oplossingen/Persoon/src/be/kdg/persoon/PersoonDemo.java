package be.kdg.persoon;

/**
 * @author Kristiaan Behiels
 * @version 1.0 24/10/13
 */
public class PersoonDemo {
    public static void main(String[] args) {
        Persoon[] personen = {
            new Persoon(1000, "Jos"),
            new Persoon(1001, "Jos"),
            new Persoon(1000, "Jos"),
            new Student(1000, "Jos", 201301),
            new Student(1002, "George", 201302),
            new Student(1003, "William", 201303),
            new Student(1004, "Kate", 201304)
        };

        // Toon alle personen (for each)
        for (Persoon persoon : personen) {
            System.out.println(persoon);
        }

        // Tel het aantal Persoon objecten met id 1000.
        Persoon zoekId = new Persoon(1000, "Boris");
        int aantal = 0;
            // hier aanvullen
        for (Persoon persoon : personen) {
            if (persoon.equals(zoekId)) {
                aantal++;
            }
        }
        System.out.println("Aantal Persoon objecten met id 1000 = " + aantal);

        // Tel het aantal Student objecten
        int teller = 0;
        for (Persoon persoon : personen) {
            if (persoon instanceof Student) {
                teller++;
            }
        }
        System.out.println("Aantal Student objecten = " + teller);


    }
}

/*
1000 Jos
1001 Jos
1000 Jos
1000 Jos        201301
1002 George     201302
1003 William    201303
1004 Kate       201304
Aantal Persoon objecten met id 1000 = 2
Aantal Student objecten = 4
*/