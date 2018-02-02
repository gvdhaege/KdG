package be.kdg.film;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */
public enum Drager {
    BLU_RAY, DVD;

    @Override
    public String toString() {
        return (this.ordinal() == 0 ? "BluRay" : super.toString());
    }

    // super.toString() --- name() --- "DVD"
}
