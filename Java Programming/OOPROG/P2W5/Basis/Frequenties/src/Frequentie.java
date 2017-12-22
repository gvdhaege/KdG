import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequentie {
    private static final int MAX = 10;
    private List<Integer> lijst;
    private int[] frequenties;

    public Frequentie(List<Integer> getallen) {
        this.lijst = new ArrayList<>(getallen);
    }

    private void bepaalFrequenties() {
        frequenties = new int[MAX];
        Arrays.fill(frequenties, 0);

        for (int i = 0; i < MAX; i++) {
            frequenties[i] = Collections.frequency(lijst, i);
        }
    }

    public String toonFrequenties() {
        bepaalFrequenties();

        StringBuilder resultaat = new StringBuilder();

        for (int i = 0; i < frequenties.length; i++) {
            resultaat.append(String.format("%d --> %2d\n", i, frequenties[i]));
        }
        return resultaat.toString();
    }

    public String toString() {
        StringBuilder resultaat = new StringBuilder();

        for (int i = 0; i < lijst.size(); i++) {
            resultaat.append(lijst.get(i) + " ");
            if ((i + 1) % 10 == 0) {
                resultaat.append("\n");
            }
        }
        return resultaat.toString();
    }
}
