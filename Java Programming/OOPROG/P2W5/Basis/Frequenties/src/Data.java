import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Data {
    private static final int MAX = 100;
    private static Random generator = new Random();
    private List<Integer> getallen;

    public Data() {
        this.getallen = new ArrayList<>(MAX);
        for (int i = 0; i < MAX; i++) {
            getallen.add(generator.nextInt(10));
        }
    }

    public List<Integer> getGetallen() {
        return getallen;
    }
}
