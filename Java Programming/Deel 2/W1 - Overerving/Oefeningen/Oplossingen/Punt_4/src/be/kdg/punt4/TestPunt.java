package be.kdg.punt4;

/**
 * @author Kristiaan Behiels
 * @version 1.0 19/10/13
 *
 * Polymorfisme without knowing it!
 */
public class TestPunt {
    public static void main(String[] args) {
        Punt[] punten = {
            new Punt(),
            new Punt3D(),
            new Punt(2, 3),
            new Punt3D(4, 5, 6)
        };

        for (Punt punt : punten) {
            System.out.println(punt);
        }

        // Toepassen equals methode
        boolean isPuntGelijk = punten[2].equals(new Punt(2, 3));
        boolean isPunt3DGelijk = punten[3].equals(new Punt3D(4, 5, 6));
        boolean isPunt3DNietGelijk = punten[3].equals(new Punt3D(3, 5, 6));

        System.out.println("\nPunt gelijk: " + isPuntGelijk);
        System.out.println("Punt3D gelijk: " + isPunt3DGelijk);
        System.out.println("Punt3D niet gelijk: " + isPunt3DNietGelijk);
    }
}

/*
x: 0  y: 0
x: 0  y: 0  z: 0
x: 2  y: 3
x: 4  y: 5  z: 6

Punt gelijk: true
Punt3D gelijk: true
Punt3D niet gelijk: false
*/