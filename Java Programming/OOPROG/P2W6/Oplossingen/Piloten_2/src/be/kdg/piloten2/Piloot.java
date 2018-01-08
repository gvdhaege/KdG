package be.kdg.piloten2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kristiaan Behiels
 * @version 1.0 29/11/13
 */
public class Piloot {
    private String nationaliteit;
    private String naam;
    private int titels;
    private List<Integer> seizoenen;

    public Piloot(String nationaliteit, String naam, int titels) {
        this.nationaliteit = nationaliteit;
        this.naam = naam;
        this.titels = titels;
        seizoenen = new ArrayList<>();
    }

    public void voegSeizoenenToe(int... jaartallen) {
        for (int jaar : jaartallen) {
            seizoenen.add(jaar);
        }
    }

    public String getNationaliteit() {
        return nationaliteit;
    }

    public String getNaam() {
        return naam;
    }

    public int getTitels() {
        return titels;
    }

    public List<Integer> getSeizoenen() {
        return seizoenen;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-20s %d  %s", nationaliteit, naam, titels, seizoenen);
    }

}
