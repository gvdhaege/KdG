package be.kdg.mastermind.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * De klasse Hint stelt een hint voor die de computer geef nadat de gebruiker een gok waagde.
 * Een hint bestaat uit witte en zwarte kleuren (zie spelregels voor de uitleg).
 *
 * @author Willy Wonka
 */
public class Hint {
    private static final int MAX_NUMBER_OF_PINS = 4;
    private List<HintColor> hintColors;

    /**
     * Maakt lege Hint aan.
     */
    public Hint() {
        this.hintColors = new ArrayList<>();
    }

    public void addColor(HintColor color){
        if (hintColors.size()>= MAX_NUMBER_OF_PINS) return;
        hintColors.add(color);
        Collections.sort(hintColors);
    }

    public HintColor getHintColor(int index) {
        if (index>= MAX_NUMBER_OF_PINS) return null;
        return hintColors.get(index);
    }

    public int size(){
        return hintColors.size();
    }

    @Override
    public String toString() {
        return hintColors.toString();
    }
}
