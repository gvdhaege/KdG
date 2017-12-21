package be.kdg.rekenmachine;

/**
 * @author Kristiaan Behiels
 * @version 1.0 15-dec-2009
 */
public interface Plugin {
    String getCommand();
    double bereken(double x, double y);
}
