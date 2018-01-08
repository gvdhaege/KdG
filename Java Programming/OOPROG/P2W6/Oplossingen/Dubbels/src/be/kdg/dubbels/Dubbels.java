package be.kdg.dubbels;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
De klasse Dubbels bevat als enig attribuut een List van strings.
Voorzie een constructor die de List maakt in invult met een kopie van de List in de parameter.
Voorzie een toString methode die de inhoud van de List met 4 op een regel als een string teruggeeft.
Voorzie een methode verwijderDubbels die ervoor zorgt dat elke merknaam slechts éénmaal in de List voorkomt.
 */
public class Dubbels {
    private List<String> lijst;

    public Dubbels(List<String> data) {
        lijst = new ArrayList<>();
        lijst.addAll(data);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lijst.size(); i++) {
            if (i % 4 == 0) {
                result.append('\n');
            }
            result.append(String.format("%-12s ", lijst.get(i)));
        }
        return result.toString();
    }

    public void verwijderDubbels() {
        Set<String> set = new TreeSet<>(lijst);
        lijst.clear();
        lijst.addAll(set);
    }
}
