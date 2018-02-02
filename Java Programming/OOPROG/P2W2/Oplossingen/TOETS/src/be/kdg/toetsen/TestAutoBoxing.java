package be.kdg.toetsen;

/**
 * @author Kristiaan Behiels
 * @version 1.0 29/10/13
 */
public class TestAutoBoxing {
    public static void main(String[] args) {
        Integer waarde = new Integer(10);
        waarde++;
        System.out.print(waarde + " ");
        System.out.println(waarde instanceof Integer);


        Boolean trueBool = true;
        Boolean falseBool = false;
        System.out.println(trueBool != falseBool);

        Integer klein = 42;
        Integer groot = 9000;
        Integer verschil = groot - klein;
        System.out.println(verschil == (groot - klein));

        Integer b1 = 500;
        Integer b2 = 500;
        System.out.println(b1 == b2);

    }
}
