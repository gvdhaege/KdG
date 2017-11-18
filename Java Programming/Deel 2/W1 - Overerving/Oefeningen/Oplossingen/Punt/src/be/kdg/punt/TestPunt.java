package be.kdg.punt;

/**
 * @author Kristiaan Behiels
 * @version 1.0 19/10/13
 */
public class TestPunt {
    public static void main(String[] args) {
        Punt punt = new Punt(1, 2);
        Punt3D punt3d = new Punt3D(4, 5, 6);

        System.out.println("Coordinaten punt: " + punt.getX() + ',' + punt.getY());
        System.out.println("Coordinaten punt3d: " + punt3d.getX() + ',' + punt3d.getY() + ',' + punt3d.getZ());
    }
}

/*
Coordinaten punt: 1,2
Coordinaten punt3d: 4,5,6
*/