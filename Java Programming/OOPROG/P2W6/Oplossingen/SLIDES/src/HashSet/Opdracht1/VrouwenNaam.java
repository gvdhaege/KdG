package HashSet.Opdracht1;

/**
 * Created by venj on 7/12/2014.
 */
public class VrouwenNaam {
    private String naam;

    public VrouwenNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        VrouwenNaam that = (VrouwenNaam) object;

        return naam.equals(that.naam);

    }

    @Override
    public int hashCode() {
        return naam.hashCode();
    }

    @Override
    public String toString() {
        return naam;
    }
}
