package be.kdg.toetsen;

/**
 * @author Kristiaan Behiels
 * @version 1.0 29/10/13
 */
public class TestString {
    public static void main(String[] args) {
        String een = "hello";
        String twee = "hello";
        String drie = new String("hello");

        System.out.println(een == twee);
        System.out.println(een == drie);
    }
}
