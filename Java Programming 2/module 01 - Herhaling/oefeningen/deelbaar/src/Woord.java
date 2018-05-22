/*
    De klasse Woord implementeert de interface Deelbaar
 */
public class Woord implements Deelbaar {
    private String str;

    public Woord(String str) {
        this.str = str;
    }

    @Override
    public Deelbaar getHelft() {
        return new Woord(str.substring(0, str.length() / 2));
    }

    public String toString() {
        return str;
    }
}
