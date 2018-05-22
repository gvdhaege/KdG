/*
    De klasse Reeks implementeert de interface Deelbaar.
    Als je de reeks deelt geef je de eerste helft van de reeks terug
 */
public class Reeks implements Deelbaar {
    private int[] array;

    public Reeks(int[] array) {
        this.array = array;
    }

    @Override
    public Deelbaar getHelft() {
        int[] tmp = new int[array.length / 2];
        System.arraycopy(array, 0, tmp, 0, array.length / 2);
        return new Reeks(tmp);
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if (i < array.length - 1) str += ", ";
        }
        return str + "]";
    }
}
