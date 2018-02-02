package be.kdg.leden;

import java.util.ArrayList;
import java.util.List;

/*
De klasse leden bevat slechts 1 attribute, met name de ArrayList leden, de elementen ervan zijn van het type Lid.
Voorzie indien nodig een constructor.
Voorzie een methode voegLidToe om een Lid-object te kunnen toevoegen.
Voorzie een methode getLid die aan de hand van een index (int-parameter) een Lid object teruggeeft.
Voorzie een methode size die het actuele aantal elementen van de ArrayList leden teruggeeft.
 */
public class Leden {
    public static final int MAX_AANTAL = 100;

    private Lid[] leden = new Lid[MAX_AANTAL];
    private int aantal;

    public void voegLidToe(Lid lid) {
        leden[aantal++] = lid;
    }

    public Lid getLid(int index) {
        return leden[index];
    }

    public int size() {
        return aantal;
    }
}

/* private final List<Lid> leden = new ArrayList<>();

    public void voegLidToe(Lid lid) {
        leden.add(lid);
    }

    public Lid getLid(int index) {
        return leden.get(index);
    }

    public int size() {
        return leden.size();
    }
*/

