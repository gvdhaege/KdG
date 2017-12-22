import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Merken {
    private List<String> merken;

    public Merken() {
        this.merken = new ArrayList<>();
        Collections.addAll(merken, Data.merken);
    }

    public void sorteer(){
        Collections.sort(merken);
    }

    public void keerOm(){
        Collections.reverse(merken);
    }

    public String toString(){
        StringBuilder resultaat = new StringBuilder();
        for (String merk : merken) {
            resultaat.append(merk + " ");
        }
        return resultaat.toString();
    }
}
