import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LottoGetallen {
    private static final int AANTAL_BALLEN = 45;
    private static final int AANTAL_GETALLEN = 6;
    private List<Integer> getallen = new ArrayList<>();
    private int[] lottoGetallen = new int[AANTAL_GETALLEN];

    public LottoGetallen() {
        for (int i = 1; i <= AANTAL_BALLEN; i++) {
            getallen.add(i);
        }
    }

    public void genereertLottoGetallen() {
        Collections.shuffle(getallen);
        for (int i = 0; i < AANTAL_GETALLEN; i++) {
            lottoGetallen[i] = getallen.get(i);
        }
        Arrays.sort(lottoGetallen);
    }

    public String toonLottoGetallen() {
        StringBuilder lottoTrekking = new StringBuilder();
        for (int i = 0; i < lottoGetallen.length; i++) {
            lottoTrekking.append(String.format("%3d", lottoGetallen[i]));
        }
        return lottoTrekking.toString();
    }
}
