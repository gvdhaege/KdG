package deelbaar;

public class Woord implements Deelbaar {
    private String str;

    public Woord(String str) {
        this.str = str;
    }

    public void halveer() {
        str = ((Woord) getHelft()).str;
    }

    public Deelbaar getHelft() {
        return new Woord(str.substring(0, str.length() / 2));
    }

    public String toString() {
        return str;
    }
}
