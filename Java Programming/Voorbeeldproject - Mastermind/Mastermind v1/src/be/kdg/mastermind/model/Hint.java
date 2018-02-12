package be.kdg.mastermind.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vochtenh on 17/02/2016.
 */
public class Hint {
    private static final int MAX_NUMBER_OF_PINS = 4;
    private List<HintColor> hintColors;

    public Hint() {
        this.hintColors = new ArrayList<>();
    }

    public void addColor(HintColor color){
        if (hintColors.size()>= MAX_NUMBER_OF_PINS) return;
        hintColors.add(color);
    }

    public HintColor getHintColor(int index) {
        if (index>= MAX_NUMBER_OF_PINS) return null;
        return hintColors.get(index);
    }

    @Override
    public String toString() {
        return "Hint{" +
                "hintColors=" + hintColors +
                '}';
    }
}
