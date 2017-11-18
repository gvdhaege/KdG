package be.kdg.seizoenen;

/**
 * @author Kristiaan Behiels
 * @version 1.0 21/10/13
 */
public class Zomer extends Seizoen {
    int jaar = 2014;
    String begin = "21 juni";

    public Zomer() {
    }

    public Zomer(int jaar, String begin) {
        this.jaar = jaar;
        this.begin = begin;
    }

    @Override
    public String getBegin() {
        return "In " + jaar + " begint de zomer op " + begin;
    }
}
