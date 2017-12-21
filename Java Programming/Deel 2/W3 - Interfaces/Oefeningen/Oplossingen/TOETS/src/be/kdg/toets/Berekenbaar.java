package be.kdg.toets;

import java.io.Serializable;

/**
 * @author Kristiaan Behiels
 * @version 1.0 31/10/13
 */
public interface Berekenbaar extends Comparable, Serializable {
    public static final int MAX_AANTAL = 100;
    double BTW_TARIEF = 0.21;

   // public abstract void berekenBtw() {}   // Interface methods can't have a body
    void berekenTotaal();

}
