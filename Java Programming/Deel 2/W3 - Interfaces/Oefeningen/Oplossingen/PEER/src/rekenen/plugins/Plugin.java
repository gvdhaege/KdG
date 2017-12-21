package rekenen.plugins;

/**
 * Mark Goovaerts
 * Datum: 25-11-13
 * Johan Ven
 * Datum: 16-11-14 (Default methode toegevoegd)
 */
public interface Plugin {
    //Opgave 1.1
    public String getCommand();
    public double bereken(double x, double y);

    default String getAuteur(){
        return "KdG";
    }
}
