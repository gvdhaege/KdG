import java.util.*;

public class Dubbels {
    private List<String> autoMerken;

    public Dubbels(List<String> autoMerken) {
        this.autoMerken = new ArrayList<>(autoMerken);
    }

    public void verwijderDubbels(){
        Set<String> uniekeAutoMerken = new TreeSet<>(autoMerken);
        autoMerken.clear();
        autoMerken.addAll(uniekeAutoMerken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < autoMerken.size(); i++) {
            if (i % 4 == 0) {
                sb.append("\n");
            }
            sb.append(String.format("%-12s", autoMerken.get(i)));
        }
        return sb.toString();
    }
}
