/*
    De klasse GeheelGetal erft over van de abstracte klasse Getal
    en implementeert de interface Deelbaar
 */
public class GeheelGetal extends Getal implements Deelbaar {
    private Integer integer;

    public GeheelGetal(int i) {
        integer = i;
    }

    public GeheelGetal(Integer integer) {
        this.integer = integer;
    }

    public void increment(int step) {
        integer += step;
    }

    public void decrement(int step) {
        integer -= step;
    }

    @Override
    public Deelbaar getHelft() {
        return new GeheelGetal(integer / 2);
    }

    public String toString() {
        return integer.toString();
    }


}
