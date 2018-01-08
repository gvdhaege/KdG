import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Piloot {
    private String nationaliteit;
    private String naam;
    private int titels;
    private List<Integer> seizoenen;

    public Piloot(String nationaliteit, String naam, int titels) {
        this.nationaliteit = nationaliteit;
        this.naam = naam;
        this.titels = titels;
        this.seizoenen = new ArrayList<>();
    }

    public String getNaam() {
        return naam;
    }

    public int getTitels() {
        return titels;
    }

    public String getNationaliteit() {
        return nationaliteit;
    }

    public List<Integer> getSeizoenen() {
        return seizoenen;
    }

    public void voegSeizoenenToe(int... jaartallen) {
        for (int jaartal : jaartallen) {
            seizoenen.add(jaartal);
        }
    }

    @Override
    public String toString() {
        return String.format("%-20s %-25s %d %s", nationaliteit, naam, titels, seizoenen);
    }
}
