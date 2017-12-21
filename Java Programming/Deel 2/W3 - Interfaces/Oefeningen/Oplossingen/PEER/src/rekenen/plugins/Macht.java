package rekenen.plugins;

/**
 * Mark Goovaerts
 * Datum: 25-11-13
 * Johan Ven
 * Datum 16-11-14 (review AC14-15)
 */
public class Macht implements Plugin {
    @Override
    public String getCommand() {
        return "^";
    }

    @Override
    public double bereken(double x, double y) {
        return Math.pow(x, y);
    }
}
