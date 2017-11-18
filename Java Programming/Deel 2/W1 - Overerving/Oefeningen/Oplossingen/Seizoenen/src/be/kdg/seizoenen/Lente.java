package be.kdg.seizoenen;

/**
 * @author Kristiaan Behiels
 * @version 1.0 21/10/13
 */
public class Lente extends Seizoen {
    private int jaar = 2014;
    private String begin = "20 maart";

    public Lente() {
    }

    public Lente(int jaar, String begin) {
        this.jaar = jaar;
        this.begin = begin;
    }

    @Override
    public String getBegin() {
        return "In " + jaar + " begint de lente op " + begin;
    }

}
