package be.kdg.punt3;

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

        punt3D.setX(1);
        punt3D.setY(2);
        punt3D.setZ(3);

        System.out.println("Nieuwe coordinaten: " + punt3D);
    }
}

/*
Default punt: x: 0  y: 0
Default punt3D: x: 0  y: 0  z: 0
Punt: x: 2  y: 3
Punt3D: x: 4  y: 5  z: 6
Nieuwe coordinaten: x: 1  y: 2  z: 3
*/