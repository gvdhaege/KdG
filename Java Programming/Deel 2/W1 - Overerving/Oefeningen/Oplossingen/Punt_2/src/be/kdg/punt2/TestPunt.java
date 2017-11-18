package be.kdg.punt2;

/**
 * @author Kristiaan Behiels
 * @version 1.0 19/10/13
 */
public class TestPunt {
    public static void main(String[] args) {
        Punt defaultPunt = new Punt();
        System.out.println("Default punt: " + defaultPunt);

        Punt3D defaultPunt3D = new Punt3D();
        System.out.println("Default punt3D: " + defaultPunt3D);

        Punt punt = new Punt(2, 3);
        System.out.println("Punt: " + punt);

        Punt3D punt3D = new Punt3D(4, 5, 6);
        System.out.println("Punt3D: " + punt3D);
    }
}

/*
Default punt: (0,0)
Default punt3D: (0,0,0)
Punt: (2,3)
Punt3D: (4,5,6)
*/