package be.kdg.toetsen;

/**
 * @author Kristiaan Behiels
 * @version 1.0 29/10/13
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Geef ");
        builder.append("me ").append("de ").append(2).append(3);
        System.out.println(builder);
    }
}
