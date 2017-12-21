package Kind;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestKlasse {
    public static void main(String[] args) {
        List<Kind> kinderen = new ArrayList<>();
        kinderen.add(new Kind("Dorien", 18, 160));
        kinderen.add(new Kind("Wouter", 15, 175));
        kinderen.add(new Kind("Stevie", 12, 147));
        kinderen.add(new Kind("Finn", 6, 105));

        System.out.println(kinderen);
        Collections.sort(kinderen);
        System.out.println(kinderen);
        Collections.sort(kinderen, new LeeftijdComparator());
        System.out.println(kinderen);

    }

}
