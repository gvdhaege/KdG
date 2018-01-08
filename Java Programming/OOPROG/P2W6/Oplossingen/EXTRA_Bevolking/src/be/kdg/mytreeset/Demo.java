package be.kdg.mytreeset;

/**
 * @author Kristiaan Behiels
 * @version 1.0 16/12/13
 */
public class Demo {
    public static void main(String[] args) {
        Bevolking bevolking = new Bevolking();

        System.out.println("Inhoud set: " + bevolking.toon());

        System.out.println("\nEerste: " +  bevolking.getEerste());
        System.out.println("Tweede: " +  bevolking.getVolgende(bevolking.getEerste()));

        System.out.println("\nVoorlaatste: " +
                bevolking.getVorige(bevolking.getLaatste()));
       System.out.println("Laatste: " +  bevolking.getLaatste());

        System.out.println("\nCeiling: " +
                bevolking.getCeiling(new Persoon("Koen", 47)));
        System.out.println("Floor: " +  bevolking.getFloor(new Persoon("Koen", 47)));

        System.out.println("\nInhoud set: " + bevolking.toonMetHigher());
        System.out.println("Omgekeerd: " + bevolking.toonMetDescendingIterator());
        System.out.println("Leeftijd: " + bevolking.toonVolgensLeeftijd());

    }
}
